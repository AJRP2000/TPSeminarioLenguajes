package expression;

public class PrintId extends Statement {
	Statement var;
	
	public PrintId(Statement var) {
		this.var=var;
	}
	
	public String toString() {
		return "Print(" + var.toString() + ")";
	}
}