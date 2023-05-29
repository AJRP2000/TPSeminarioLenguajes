package expression;

import java.util.ArrayList;
import java.util.List;

import antlr.CalculadoraBaseVisitor;
import antlr.CalculadoraParser.ProgramContext;

public class AntlrToProgram extends CalculadoraBaseVisitor<Program> {

	public List<String> erroresSemanticos; //1 Uso de una variable no definida.
	
	@Override
	public Program visitProgram(ProgramContext ctx) {
		Program prog = new Program();
		
		erroresSemanticos = new ArrayList<String>();
		AntlrToStatement statementVisitor = new AntlrToStatement(erroresSemanticos);
		for(int i = 0; i < ctx.getChildCount(); i++) {
			if(i == ctx.getChildCount()-1) {
				//Ultimo Hijo (EOF)
			}
			else {
				prog.addStatement(statementVisitor.visit(ctx.getChild(i)));
			}
		}
		
		return prog;
	}

}
