import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;

public class Visitor extends bcBaseVisitor<BigDecimal>{
    // for math expression
    private final static BigDecimal ZERO = BigDecimal.ZERO;
    private final static BigDecimal ONE = BigDecimal.ONE;
    private int scale = 20;
    private final static BigDecimal MAX_SCALE = new BigDecimal(Integer.MAX_VALUE);
    private MathContext mathContext = new MathContext(0, RoundingMode.HALF_EVEN);
    private Scanner input = new Scanner(System.in);

    // for variable scope
    private Stack<Map<String, BigDecimal>> scopes = new Stack<>();
    private Map<String, BigDecimal> globalScope = new HashMap<String, BigDecimal>();

    // for function
    private Map<String, Map<Integer, bcParser.BlockContext>> functionImpMap = new HashMap<>();
    private Map<String, Map<Integer, List<String>>> functionParamMap = new HashMap<>();
    private boolean hasReturned = false;
    private BigDecimal returnValue = ZERO;

    // control variable for loops
    private boolean isBreak = false;
    private boolean isContinue = false;

    public Visitor(){
        scopes.push(globalScope);
    }

    /**
     * Functions definitions are dynamic. A new definition
     * for the same exact function signature will update
     * its implementation.
     * @param ctx
     * @return
     */
    @Override
    public BigDecimal visitFunction(bcParser.FunctionContext ctx) {
        String functionName = ctx.VARIABLE(0).getText();
        int numOfParams = ctx.VARIABLE().size() - 1;

        // function implementation attached to the function name
        bcParser.BlockContext implementation = ctx.block();
        Map<Integer, bcParser.BlockContext> paramMap = functionImpMap.getOrDefault(functionName, new HashMap<>());
        paramMap.put(numOfParams, implementation);
        functionImpMap.put(functionName, paramMap);

        // function params attached to the function name
        List<String> variables = new ArrayList<>();
        Map<Integer, List<String>> varMap = functionParamMap.getOrDefault(functionName, new HashMap<>());

        for(int i = 1; i < ctx.VARIABLE().size(); ++i){
            variables.add(ctx.VARIABLE(i).getText());
        }

        varMap.put(numOfParams, variables);
        functionParamMap.put(functionName, varMap);

        return null;
    }

    /**
     * Function execution if function exist
     * @param ctx
     * @return
     */
    @Override
    public BigDecimal visitFunc_call(bcParser.Func_callContext ctx) {
        String functionName = ctx.VARIABLE().getText();
        int numOfParams = ctx.expression().size();

        Map<Integer, bcParser.BlockContext> paramMap = functionImpMap.getOrDefault(functionName, null);

        if(paramMap == null){
            System.err.println("Function: " + functionName + " does not exist!");
            return null;
        }

        bcParser.BlockContext block = paramMap.getOrDefault(numOfParams, null);

        if(block == null){
            System.err.println("Function: " + functionName + " does not exist!");
            return null;
        }

        // create a new scope for this function scope
        Map<String, BigDecimal> newScope = new HashMap<>();

        // set variable value for this function call
        List<String> params = functionParamMap.get(functionName).get(numOfParams);

        // parameters are pass by value
        for(int i = 0; i < ctx.expression().size(); ++i) {
           newScope.put(params.get(i), this.visit(ctx.expression(i)));
        }

        // add new scope
        scopes.push(newScope);

        BigDecimal value = this.visit(block);

        // remove scope
        scopes.pop();

        hasReturned = false;
        returnValue = ZERO;

        return value == null ? ZERO : value;
    }

    @Override
    public BigDecimal visitMath_expr(bcParser.Math_exprContext ctx) {
        BigDecimal result = this.visit(ctx.expression());
        if(result != null){
            System.out.println(result);
        }
        return null;
    }

    @Override
    public BigDecimal visitIf_else(bcParser.If_elseContext ctx) {
        // evaluate expression to determine which branch to take
        boolean is_if_branch = this.visit(ctx.expression()).compareTo(ZERO) != 0;

        if(is_if_branch) {
            this.visit(ctx.block(0));
        }else if(ctx.block(1) != null){
            this.visit(ctx.block(1));
        }

        return null;
    }

    @Override
    public BigDecimal visitWhile_loop(bcParser.While_loopContext ctx) {

        boolean condition = this.visit(ctx.expression()).compareTo(ZERO) != 0;
        isBreak = isContinue = false;

        while(condition) {
            this.visit(ctx.block());

            if (isBreak)
                break;

            if(isContinue)
                isContinue = false;

            condition = this.visit(ctx.expression()).compareTo(ZERO) != 0;
        }

        isBreak = isContinue = false;

        return null;
    }

    @Override
    public BigDecimal visitFor_loop(bcParser.For_loopContext ctx) {
        isBreak = isContinue = false;

        for(this.visit(ctx.expression(0)); this.visit(ctx.expression(1)).compareTo(ZERO) != 0; this.visit(ctx.expression(2))){
            this.visit(ctx.block());

            if(isBreak)
                break;

            if(isContinue)
                isContinue = false;
        }

        isBreak = isContinue = false;

        return null;
    }

    @Override
    public BigDecimal visitLoop_stat(bcParser.Loop_statContext ctx) {
        if(ctx.BREAK() != null){
            isBreak = true;
        }else{
            isContinue = true;
        }

        return null;
    }

    @Override
    public BigDecimal visitReturn_stat(bcParser.Return_statContext ctx) {

        if(ctx.expression() != null) {
            returnValue = this.visit(ctx.expression());
        }

        this.hasReturned = true;

        return returnValue;
    }

    @Override
    public BigDecimal visitPrint_stat(bcParser.Print_statContext ctx) {
        System.out.println(this.visit(ctx.expression()));
        return null;
    }

    @Override
    public BigDecimal visitBlock(bcParser.BlockContext ctx) {
        List<bcParser.StatementContext> statements = ctx.statement();

        for(bcParser.StatementContext statement : statements){
            this.visit(statement);

            if(isBreak || isContinue)
                break;

            if(hasReturned)
                return returnValue;
        }

        return returnValue;
    }

    @Override
    public BigDecimal visitPreOpVariableExpr(bcParser.PreOpVariableExprContext ctx) {
        BigDecimal value = this.getValue(ctx.VARIABLE().getText());
        int opType = ctx.op.getType();

        if(opType == bcParser.INC){
            value = value.add(ONE);
        }else{
            value = value.subtract(ONE);
        }

        putValue(ctx.VARIABLE().getText(), value);
        return value;
    }

    @Override
    public BigDecimal visitPostOpVariableExpr(bcParser.PostOpVariableExprContext ctx) {
        BigDecimal value = this.getValue(ctx.VARIABLE().getText());
        int opType = ctx.op.getType();

        if(opType == bcParser.INC){
            putValue(ctx.VARIABLE().getText(), value.add(ONE));
        }else{
            putValue(ctx.VARIABLE().getText(), value.subtract(ONE));
        }

        return value;
    }



    @Override
    public BigDecimal visitPowExpr(bcParser.PowExprContext ctx) {
        return evalExpression(this.visit(ctx.expression(0)), this.visit(ctx.expression(1)), bcParser.POW);
    }

    @Override
    public BigDecimal visitMultiplicativeExpr(bcParser.MultiplicativeExprContext ctx) {
        return evalExpression(this.visit(ctx.expression(0)), this.visit(ctx.expression(1)), ctx.op.getType());
    }

    @Override
    public BigDecimal visitAdditiveExpr(bcParser.AdditiveExprContext ctx) {
        return evalExpression(this.visit(ctx.expression(0)), this.visit(ctx.expression(1)), ctx.op.getType());
    }

    @Override
    public BigDecimal visitRelationalExpr(bcParser.RelationalExprContext ctx) {
        BigDecimal left = this.visit(ctx.expression(0));
        BigDecimal right = this.visit(ctx.expression(1));
        int optType = ctx.op.getType();
        int compareValue = left.compareTo(right);

        switch(optType){
            case bcParser.LT: return compareValue == -1 ? ONE : ZERO;
            case bcParser.GT: return compareValue == 1 ? ONE : ZERO;
            case bcParser.LTEQ: return compareValue <= 0 ? ONE : ZERO;
            case bcParser.GTEQ: return compareValue >= 0 ? ONE : ZERO;
            case bcParser.EQEQ: return compareValue == 0 ? ONE : ZERO;
            case bcParser.NOTEQ: return compareValue != 0 ? ONE : ZERO;
            default:
        }

        return null;
    }

    @Override
    public BigDecimal visitNotExpr(bcParser.NotExprContext ctx) {
        BigDecimal value = this.visit(ctx.expression());
        return value.equals(ZERO) ? ONE : ZERO;
    }

    @Override
    public BigDecimal visitAndExpr(bcParser.AndExprContext ctx) {
        BigDecimal left = this.visit(ctx.expression(0));
        BigDecimal right = this.visit(ctx.expression(1));
        return !left.equals(ZERO) && !right.equals(ZERO) ? ONE : ZERO;
    }

    @Override
    public BigDecimal visitOrExpr(bcParser.OrExprContext ctx) {
        BigDecimal left = this.visit(ctx.expression(0));
        BigDecimal right = this.visit(ctx.expression(1));
        return !left.equals(ZERO) || !right.equals(ZERO) ? ONE : ZERO;
    }

    @Override
    public BigDecimal visitMathFuncExpr(bcParser.MathFuncExprContext ctx) {
        int opType = ctx.op.getType();
        BigDecimal value = this.visit(ctx.expression());
        BigDecimal result = null;

        switch(opType){
            case bcParser.SIN: result = new BigDecimal(Math.sin(value.doubleValue()), mathContext);
                break;
            case bcParser.COS: result = new BigDecimal(Math.cos(value.doubleValue()), mathContext);
                break;
            case bcParser.LOG: result = new BigDecimal(Math.log(value.doubleValue()), mathContext);
                break;
            case bcParser.EXP: result = new BigDecimal(Math.exp(value.doubleValue()), mathContext);
                break;
            case bcParser.SQRT: result = this.sqrt(value);
            default:
        }

        return result.setScale(this.scale, RoundingMode.HALF_EVEN);
    }

    @Override
    public BigDecimal visitScaleExpr(bcParser.ScaleExprContext ctx) {
        BigDecimal newScale = this.visit(ctx.expression());

        if(newScale == null || newScale.compareTo(ZERO) == -1){
            System.err.println("Error: scale is not valid!");
        }else if(newScale.compareTo(MAX_SCALE) == 1){
            System.err.println("Scale to large, setting scale to " + MAX_SCALE);
            this.scale = Integer.MAX_VALUE;
            mathContext = new MathContext(this.scale, RoundingMode.HALF_EVEN);
        }else{
            this.scale = newScale.intValue();
            mathContext = new MathContext(this.scale, RoundingMode.HALF_EVEN);
        }

        return null;
    }


    @Override
    public BigDecimal visitNumber(bcParser.NumberContext ctx){
        return new BigDecimal(ctx.NUMBER().getText());
    }

    @Override
    public BigDecimal visitMinusNumber(bcParser.MinusNumberContext ctx) {
        return (new BigDecimal(ctx.NUMBER().getText())).negate();
    }

    /**
     * Handles scoping for variables.
     * Default value of non-existent variable is ZERO.
     * @param ctx
     * @return
     */
    @Override
    public BigDecimal visitVariable(bcParser.VariableContext ctx) {
        return this.getValue(ctx.VARIABLE().getText());
    }

    @Override
    public BigDecimal visitUnaryMinusExpr(bcParser.UnaryMinusExprContext ctx) {
        BigDecimal value = this.getValue(ctx.VARIABLE().getText());
        return value.negate();
    }

    @Override
    public BigDecimal visitArithmeticAssignExpr(bcParser.ArithmeticAssignExprContext ctx) {
        BigDecimal varValue = this.getValue(ctx.VARIABLE().getText());
        int opType = ctx.op.getType();
        BigDecimal exprValue = this.visit(ctx.expression());
        BigDecimal result = evalExpression(varValue, exprValue, opType);
        putValue(ctx.VARIABLE().getText(), result);
        return null;
    }

    @Override
    public BigDecimal visitAssignExpr(bcParser.AssignExprContext ctx) {
        BigDecimal value = this.visit(ctx.expression());
        putValue(ctx.VARIABLE().getText(), value);
        return null;
    }

    @Override
    public BigDecimal visitReadExpr(bcParser.ReadExprContext ctx) {
        String number = input.next();
        return new BigDecimal(number);
    }

    @Override
    public BigDecimal visitParen(bcParser.ParenContext ctx) {
        return this.visit(ctx.expression());
    }


    public BigDecimal evalExpression(BigDecimal left, BigDecimal right, int opType){
        BigDecimal result = null;

        switch(opType){
            case bcParser.POW:
                                   result = left.pow(right.intValue(), mathContext);
                break;
            case bcParser.MUL:     result = left.multiply(right, mathContext);
                break;
            case bcParser.DIV:     result = left.divide(right, scale, RoundingMode.HALF_EVEN);
                break;
            case bcParser.MOD:     result = left.remainder(right, mathContext);
                break;
            case bcParser.PLUS:    result = left.add(right, mathContext);
                break;
            case bcParser.MINUS:   result = left.subtract(right, mathContext);
                break;
            default:

        }

        return result.setScale(this.scale, RoundingMode.HALF_EVEN);
    }

    /* source: StackOverflow */
    public BigDecimal sqrt(BigDecimal num){
        if(num.compareTo(ZERO) < 0){
            System.err.println("Error: sqrt of negative number");
            return null;
        }
        if(num.equals(ZERO))
            return ZERO;

        RoundingMode mode = RoundingMode.FLOOR;
        BigDecimal sqrt = new BigDecimal(1);
        BigDecimal store = new BigDecimal(num.toString());
        boolean first = true;
        sqrt.setScale(scale, mode);

        do{
            if (!first){
                store = new BigDecimal(sqrt.toString());
            }else{
                first = false;
            }

            store.setScale(scale, mode);
            sqrt = num.divide(store, scale, mode).add(store).divide(
                    BigDecimal.valueOf(2), scale, mode);
        }while (!store.equals(sqrt));

        return sqrt.setScale(scale, mode);
    }


    /**
     * Puts value for the variable in it's appropriate scope.
     * If variable exist in the local scope, then put it in the local scope.
     * If variable exist in the global scope, then put it in the global scope.
     * Otherwise, put the variable in the local scope.
     * @param varName
     * @param value
     */
    public void putValue(String varName, BigDecimal value){

        if(scopes.peek().containsKey(varName)){
            scopes.peek().put(varName, value);
        }else if(globalScope.containsKey(varName)){
            globalScope.put(varName, value);
        }else{
            scopes.peek().put(varName, value);
        }
    }

    /**
     * Gets value for the variable from the appropriate scope.
     * If variable exist in the local scope, return its value from the local scope.
     * If variable exist in the global scope, return its value from the global scope.
     * Otherwise, return the default value ZERO.
     * @param varName
     * @return
     */
    public BigDecimal getValue(String varName){

        if(scopes.peek().containsKey(varName))
            return scopes.peek().get(varName);

        return globalScope.getOrDefault(varName, ZERO);
    }

}
