package expression;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public List<Statement> statements;
	
	public Program() {
		this.statements = new ArrayList<Statement>();
	}
	
	public void addStatement(Statement e) {
		this.statements.add(e);
	}

}
