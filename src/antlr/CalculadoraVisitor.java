// Generated from Calculadora.g4 by ANTLR 4.13.0

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link CalculadoraParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalculadoraParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CalculadoraParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link CalculadoraParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CalculadoraParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link CalculadoraParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CalculadoraParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link CalculadoraParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(CalculadoraParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputStatement}
	 * labeled alternative in {@link CalculadoraParser#input_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(CalculadoraParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintText}
	 * labeled alternative in {@link CalculadoraParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintText(CalculadoraParser.PrintTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintId}
	 * labeled alternative in {@link CalculadoraParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(CalculadoraParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparation}
	 * labeled alternative in {@link CalculadoraParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparation(CalculadoraParser.ComparationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Termino}
	 * labeled alternative in {@link CalculadoraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(CalculadoraParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CalculadoraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(CalculadoraParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculadoraParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(CalculadoraParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Factores}
	 * labeled alternative in {@link CalculadoraParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactores(CalculadoraParser.FactoresContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculadoraParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CalculadoraParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionParenthesis}
	 * labeled alternative in {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParenthesis(CalculadoraParser.ExpressionParenthesisContext ctx);
}