// Generated from C:/Users/Nimit/Downloads/Programming/ANTLR Projects/bc-statements/src/main/java\bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bcParser}.
 */
public interface bcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bcParser#bc}.
	 * @param ctx the parse tree
	 */
	void enterBc(bcParser.BcContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#bc}.
	 * @param ctx the parse tree
	 */
	void exitBc(bcParser.BcContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(bcParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(bcParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(bcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(bcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(bcParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(bcParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stat(bcParser.Return_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stat(bcParser.Return_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#loop_stat}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stat(bcParser.Loop_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#loop_stat}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stat(bcParser.Loop_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(bcParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(bcParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stat(bcParser.Print_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stat(bcParser.Print_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(bcParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(bcParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(bcParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(bcParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(bcParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(bcParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(bcParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(bcParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr(bcParser.Math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr(bcParser.Math_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(bcParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(bcParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadExpr(bcParser.ReadExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadExpr(bcParser.ReadExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(bcParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(bcParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(bcParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(bcParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(bcParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(bcParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(bcParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(bcParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(bcParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(bcParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(bcParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(bcParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathFuncExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathFuncExpr(bcParser.MathFuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathFuncExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathFuncExpr(bcParser.MathFuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scaleExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterScaleExpr(bcParser.ScaleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scaleExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitScaleExpr(bcParser.ScaleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(bcParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(bcParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(bcParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(bcParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(bcParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(bcParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link bcParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterNumber(bcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link bcParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitNumber(bcParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusNumber}
	 * labeled alternative in {@link bcParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterMinusNumber(bcParser.MinusNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusNumber}
	 * labeled alternative in {@link bcParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitMinusNumber(bcParser.MinusNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link bcParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterParen(bcParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link bcParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitParen(bcParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVariable(bcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVariable(bcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preOpVariableExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void enterPreOpVariableExpr(bcParser.PreOpVariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preOpVariableExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void exitPreOpVariableExpr(bcParser.PreOpVariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postOpVariableExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void enterPostOpVariableExpr(bcParser.PostOpVariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postOpVariableExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void exitPostOpVariableExpr(bcParser.PostOpVariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(bcParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(bcParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticAssignExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticAssignExpr(bcParser.ArithmeticAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticAssignExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticAssignExpr(bcParser.ArithmeticAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(bcParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(bcParser.AssignExprContext ctx);
}