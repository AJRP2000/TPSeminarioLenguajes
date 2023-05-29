package expression;

public class Multiplication extends Expression {
	
	Statement left;
	String operator;
	Statement right;
	
	public Multiplication(Statement left, String operator, Statement right) {
		this.left=left;
		this.operator=operator;
		this.right=right;
	}
	
	@Override
	public String toString() {
		return left.toString() + operator + right.toString();
	}

}
