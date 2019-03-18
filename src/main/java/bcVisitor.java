// Generated from C:/Users/Nimit/Downloads/Programming/ANTLR Projects/bc-statements/src/main/java\bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bcParser#bc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBc(bcParser.BcContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(bcParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(bcParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(bcParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#return_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stat(bcParser.Return_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#loop_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stat(bcParser.Loop_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(bcParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#print_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stat(bcParser.Print_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(bcParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(bcParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(bcParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(bcParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(bcParser.Math_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(bcParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpr(bcParser.ReadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(bcParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(bcParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(bcParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(bcParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(bcParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(bcParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathFuncExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathFuncExpr(bcParser.MathFuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scaleExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleExpr(bcParser.ScaleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(bcParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(bcParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link bcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(bcParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link bcParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(bcParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusNumber}
	 * labeled alternative in {@link bcParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusNumber(bcParser.MinusNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link bcParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(bcParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(bcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preOpVariableExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreOpVariableExpr(bcParser.PreOpVariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postOpVariableExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostOpVariableExpr(bcParser.PostOpVariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(bcParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticAssignExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAssignExpr(bcParser.ArithmeticAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link bcParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(bcParser.AssignExprContext ctx);
}