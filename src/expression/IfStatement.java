package expression;
import java.util.ArrayList;
import java.util.List;

public class IfStatement extends Statement {

	Statement comparacion;
	public List<Statement> statements;
	
	public IfStatement(Statement comparacion) {
		this.comparacion=comparacion;
		statements = new ArrayList<Statement>();
	}
	
	public void addStatement(Statement e) {
		this.statements.add(e);
	}
	
	private String statementsToString() {
		String string = "";
		for(int i = 0; i<statements.size(); i++) {
			string = string + statements.get(i).toString();
		}
		
		return string;
	}
	
	public String toString() {
		return "if" + comparacion.toString()
				+ "{" + statementsToString() + "}";
	}
}