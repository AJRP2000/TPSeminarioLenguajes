package expression;

public class ExpressionParenthesis extends Expression {

	Statement expresion;
	
	public ExpressionParenthesis(Statement e) {
		this.expresion = e;
	}
	
	public String toString() {
		return "(" + expresion.toString() + ")";
	}
}
