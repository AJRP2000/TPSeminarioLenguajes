// Generated from Calculadora.g4 by ANTLR 4.13.0

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraParser}.
 */
public interface CalculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link CalculadoraParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculadoraParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link CalculadoraParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculadoraParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalculadoraParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalculadoraParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link CalculadoraParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CalculadoraParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link CalculadoraParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CalculadoraParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link CalculadoraParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CalculadoraParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link CalculadoraParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CalculadoraParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link CalculadoraParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(CalculadoraParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link CalculadoraParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(CalculadoraParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputStatement}
	 * labeled alternative in {@link CalculadoraParser#input_statement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(CalculadoraParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputStatement}
	 * labeled alternative in {@link CalculadoraParser#input_statement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(CalculadoraParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintText}
	 * labeled alternative in {@link CalculadoraParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintText(CalculadoraParser.PrintTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintText}
	 * labeled alternative in {@link CalculadoraParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintText(CalculadoraParser.PrintTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintId}
	 * labeled alternative in {@link CalculadoraParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintId(CalculadoraParser.PrintIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintId}
	 * labeled alternative in {@link CalculadoraParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintId(CalculadoraParser.PrintIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparation}
	 * labeled alternative in {@link CalculadoraParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterComparation(CalculadoraParser.ComparationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparation}
	 * labeled alternative in {@link CalculadoraParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitComparation(CalculadoraParser.ComparationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Termino}
	 * labeled alternative in {@link CalculadoraParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTermino(CalculadoraParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Termino}
	 * labeled alternative in {@link CalculadoraParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTermino(CalculadoraParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CalculadoraParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddition(CalculadoraParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CalculadoraParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddition(CalculadoraParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculadoraParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(CalculadoraParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculadoraParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(CalculadoraParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Factores}
	 * labeled alternative in {@link CalculadoraParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactores(CalculadoraParser.FactoresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Factores}
	 * labeled alternative in {@link CalculadoraParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactores(CalculadoraParser.FactoresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalculadoraParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalculadoraParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalculadoraParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalculadoraParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionParenthesis}
	 * labeled alternative in {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParenthesis(CalculadoraParser.ExpressionParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionParenthesis}
	 * labeled alternative in {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParenthesis(CalculadoraParser.ExpressionParenthesisContext ctx);
}