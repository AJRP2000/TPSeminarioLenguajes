package expression;

public class InputStatement extends Statement {
	String variable;
	String texto;
	
	public InputStatement(String var, String texto) {
		this.variable=var;
		this.texto=texto;
	}
	
	public String toString() {
		return variable + "= Input(" + texto + ")";
	}
}
