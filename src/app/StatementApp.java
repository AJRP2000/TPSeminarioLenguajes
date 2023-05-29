package app;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.CalculadoraLexer;
import antlr.CalculadoraParser;
import expression.AntlrToProgram;
import expression.Program;
import expression.StatementProcessor;

public class StatementApp {

	public static void main(String[] args) {
		if(args.length !=1) {
			System.err.print("Necesita el nombre del archivo");
		}
		else {
			String nombreArchivo = args[0];
			CalculadoraParser parser = getParser(nombreArchivo);
			
			//Antlr crea el parser tree partiendo de prog
			ParseTree antlrAST = parser.prog();
			
			//Crear un visitor para convertir el parser tree en objetos Program/Statement
			AntlrToProgram progVisitor = new AntlrToProgram();
			Program prog = progVisitor.visit(antlrAST);
			
			if(!progVisitor.erroresSemanticos.isEmpty()){
				for(String err : progVisitor.erroresSemanticos) {
					System.out.println(err);
				}
			} else {
				StatementProcessor statementProcesador = new StatementProcessor(prog.statements);
				for(String operacion: statementProcesador.getEvaluationResult()) {
					System.out.println(operacion);
				}
			}
		}

	}

	private static CalculadoraParser getParser(String nombreArchivo) {
		CalculadoraParser parser = null;
		
		try {
			CharStream input = CharStreams.fromFileName(nombreArchivo);
			CalculadoraLexer lexer = new CalculadoraLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new CalculadoraParser(tokens);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return parser;
	}
}
