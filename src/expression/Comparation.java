package expression;

public class Comparation extends Expression {
	
	Statement left;
	String operador;
	Statement right;
	
	public Comparation(Statement left, String operador, Statement right) {
		this.left=left;
		this.operador=operador;
		this.right=right;
	}
	
	public String toString() {
		return left.toString() + operador + right.toString();
	}

}
