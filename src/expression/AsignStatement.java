package expression;

public class AsignStatement extends Statement {
	String variable;
	Statement expresion;
	
	public AsignStatement(String variable, Statement expresion) {
		this.variable=variable;
		this.expresion=expresion;
	}
	
	public String toString() {
		return variable + "=" + expresion.toString();
	}
}
