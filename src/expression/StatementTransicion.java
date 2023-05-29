package expression;

public class StatementTransicion extends Statement {
	Statement hijo;
	
	public StatementTransicion(Statement hijo) {
		this.hijo=hijo;
	}
}
