package expression;

public class PrintText extends Statement {
	String texto;
	
	public PrintText(String texto) {
		this.texto=texto;
	}
	
	public String toString() {
		return "Print(" + texto + ")";
	}
}

