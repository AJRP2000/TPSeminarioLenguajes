package expression;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import antlr.CalculadoraBaseVisitor;
import antlr.CalculadoraParser.AdditionContext;
import antlr.CalculadoraParser.AssignStatementContext;
import antlr.CalculadoraParser.ComparationContext;
import antlr.CalculadoraParser.ExpressionParenthesisContext;
import antlr.CalculadoraParser.FactoresContext;
import antlr.CalculadoraParser.IfStatementContext;
import antlr.CalculadoraParser.InputStatementContext;
import antlr.CalculadoraParser.MultiplicationContext;
import antlr.CalculadoraParser.NumberContext;
import antlr.CalculadoraParser.PrintIdContext;
import antlr.CalculadoraParser.PrintTextContext;
import antlr.CalculadoraParser.StatementContext;
import antlr.CalculadoraParser.TerminoContext;
import antlr.CalculadoraParser.VariableContext;
import antlr.CalculadoraParser.WhileStatementContext;

public class AntlrToStatement extends CalculadoraBaseVisitor<Statement> {

	private List<String> variables; //Almacena todas las variables que se han declarado en el programa
	private List<String> erroresSemanticos; //1 Uso de una variable no definida.
	
	public AntlrToStatement(List<String> erroresSemanticos) {
		variables = new ArrayList<String>();
		this.erroresSemanticos=erroresSemanticos;
	}

	@Override
	public Statement visitWhileStatement(WhileStatementContext ctx) {
		Statement booleanExpression = visit(ctx.getChild(1));
		WhileStatement whileStatement = new WhileStatement(booleanExpression);
		
		for(int i = 3; i < ctx.getChildCount()-1; i++) {
			whileStatement.addStatement(visit(ctx.getChild(i)));
		}
		
		return whileStatement;
	}

	@Override
	public Statement visitIfStatement(IfStatementContext ctx) {
		Statement booleanExpression = visit(ctx.getChild(1));
		IfStatement ifStatement = new IfStatement(booleanExpression);
		
		for(int i = 3; i < ctx.getChildCount()-1; i++) {
			ifStatement.addStatement(visit(ctx.getChild(i)));
		}
		
		return ifStatement;
	}

	@Override
	public Statement visitAssignStatement(AssignStatementContext ctx) {
		String id = ctx.getChild(0).getText();
		if(!variables.contains(id)) {
			variables.add(id);
		}
		Statement expresion = visit(ctx.getChild(2));
		
		return new AsignStatement(id, expresion);
	}

	@Override
	public Statement visitComparation(ComparationContext ctx) {
		Statement left = visit(ctx.getChild(0));
		String operador = ctx.getChild(1).getText();
		Statement right = visit(ctx.getChild(2));
		return new Comparation(left, operador, right);
	}

	@Override
	public Statement visitAddition(AdditionContext ctx) {
		Statement left = visit(ctx.getChild(0));
		String operador = ctx.getChild(1).getText();
		Statement right = visit(ctx.getChild(2));
		return new Addition(left, operador, right);
	}

	@Override
	public Statement visitMultiplication(MultiplicationContext ctx) {
		Statement left = visit(ctx.getChild(0));
		String operador = ctx.getChild(1).getText();
		Statement right = visit(ctx.getChild(2));
		return new Multiplication(left, operador, right);
	}

	@Override
	public Statement visitNumber(NumberContext ctx) {
		String numText = ctx.getChild(0).getText();
		int num = Integer.parseInt(numText);
		return new Number(num);
	}

	@Override
	public Statement visitVariable(VariableContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int linea = idToken.getLine();
		int columna = idToken.getCharPositionInLine() + 1;
		
		String id = ctx.getChild(0).getText();
		if(!variables.contains(id)) {
			erroresSemanticos.add("Error: Variable " + id + " no ha sido declarada (" + linea + ", " + columna + ")");
		}
		
		return new Variable(id);
	}
	
	@Override
	public Statement visitInputStatement(InputStatementContext ctx) {
		String var = ctx.getChild(0).getText();
		String texto = ctx.getChild(2).getText();
		if(!variables.contains(var)) {
			variables.add(var);
		}
		return new InputStatement(var,texto);
	}

	@Override
	public Statement visitPrintText(PrintTextContext ctx) {
		String texto = ctx.getChild(1).getText();
		return new PrintText(texto);
	}

	@Override
	public Statement visitPrintId(PrintIdContext ctx) {
		String texto = ctx.getChild(1).getText();
		Statement var = new Variable(texto);
		return new PrintId(var);
	}
	
	
	/* ====================================== Visits de transicion ======================================================== */
	
	@Override
	public Statement visitStatement(StatementContext ctx) {
		Statement statementHijo = visit(ctx.getChild(0)); //Devuelve el tipo de Statement
		return new StatementTransicion(statementHijo);
	}
	
	@Override
	public Statement visitTermino(TerminoContext ctx) {
		Statement termino = visit(ctx.getChild(0)); //Devuelve el Termino
		return new StatementTransicion(termino);
	}

	@Override
	public Statement visitFactores(FactoresContext ctx) {
		Statement factor = visit(ctx.getChild(0)); //Devuelve el Factor
		return new StatementTransicion(factor);
	}

	@Override
	public Statement visitExpressionParenthesis(ExpressionParenthesisContext ctx) {
		Statement expresion = visit(ctx.getChild(1)); //Devuelve la Expresion
		return new StatementTransicion(expresion);
	}
	
	

}
