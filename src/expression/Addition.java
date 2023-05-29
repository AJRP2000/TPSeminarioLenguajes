package expression;

public class Addition extends Expression {
	
	Statement left;
	String operator;
	Statement right;
	
	public Addition(Statement left, String operator, Statement right) {
		this.left=left;
		this.operator=operator;
		this.right=right;
	}
	
	@Override
	public String toString() {
		return left.toString() + operator + right.toString();
	}


}
