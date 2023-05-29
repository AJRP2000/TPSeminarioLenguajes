package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StatementProcessor {
	
	List<Statement> list;
	public Map<String, Integer> values; /*tabla de valores para las variables */
	
	public StatementProcessor(List<Statement> lista) {
		this.list=lista;
		values = new HashMap<>();
	}
	
	public List<String> getEvaluationResult(){
		List<String> evaluations = new ArrayList<>();
		
		evaluations = getEvaluationStatementCycle(list);
		
		return evaluations;
	}
	
	private List<String> getEvaluationStatementCycle(List<Statement> listaCyclo){
		List<String> operaciones = new ArrayList<>();
		
		for(Statement e: listaCyclo) {
			if(e instanceof StatementTransicion) {
				StatementTransicion statementTransicion = (StatementTransicion)e;
				List<Statement> statementHijo = new ArrayList<>();
				statementHijo.add(statementTransicion.hijo);
				getEvaluationStatementCycle(statementHijo);
			}
			
			if(e instanceof IfStatement) {
				IfStatement ifStatement = (IfStatement)e;
				String input = ifStatement.toString();
				if(getComparationResult(ifStatement.comparacion)) {
					operaciones.add("Se cumplio la condicion del if: " + input);
					getEvaluationStatementCycle(ifStatement.statements);
				} else {
					operaciones.add("No se cumplio la condicion del if: " + input);
				}
			}
			
			if(e instanceof AsignStatement) {
				AsignStatement asignacion = (AsignStatement)e;
				String input = asignacion.expresion.toString();
				int result = getExpressionResult(asignacion.expresion);
				operaciones.add(input + "es" + result);
				values.put(asignacion.variable, result);
			}
			
			if(e instanceof WhileStatement) {
				WhileStatement whileStatement = (WhileStatement)e;
				String input = whileStatement.toString();
				while(getComparationResult(whileStatement.comparacion)) {
					operaciones.add("Se cumple la condicion del while: " + input);
					getEvaluationStatementCycle(whileStatement.statements);
				}
			}
			
			if(e instanceof PrintId) {
				PrintId printId = (PrintId)e;
				String mensaje = Integer.toString(getExpressionResult(printId.var));
				System.out.println(mensaje);
				operaciones.add("Se imprimio el mensaje: " + mensaje);
			}
			
			if(e instanceof PrintText) {
				PrintText printTexto = (PrintText)e;
				String mensaje = printTexto.texto;
				System.out.println(mensaje);
				operaciones.add("Se imprimio el mensaje: " + mensaje);
			}
			
			if(e instanceof InputStatement) {
				InputStatement input = (InputStatement)e;
				System.out.println(input.texto);
				Scanner sc = new Scanner(System.in);
				int valor = sc.nextInt();
				values.put(input.variable, valor);
				operaciones.add(input.variable + " se le asigno el valor" + valor);
					
			}
		}
		
		return operaciones;
		
	}
	
	private boolean getComparationResult(Statement e) {
		boolean result = false;
		Comparation comp = (Comparation)e;
		int left = getExpressionResult(comp.left);
		int right = getExpressionResult(comp.right);
		if(comp.operador.equals("==")) {
			if(left==right) {
				result = true;
			} else {
				result = false;
			}
		}
		if(comp.operador.equals("!=")) {
			if(left!=right) {
				result = true;
			} else {
				result = false;
			}
		}
		
		return result;
	}
	
	private int getExpressionResult(Statement e) {
		int result = 0;
		
		if(e instanceof StatementTransicion) {
			StatementTransicion statementTransicion = (StatementTransicion)e;
			result = getExpressionResult(statementTransicion.hijo);
		}
		
		if(e instanceof Number) {
			Number num = (Number)e;
			result = num.num;
		}
		if(e instanceof Variable) {
			Variable var = (Variable)e;
			result = values.get(var.id);
		}
		
		if(e instanceof Addition) {
			Addition add = (Addition)e;
			int left = getExpressionResult(add.left);
			int right = getExpressionResult(add.right);
			if(add.operator.equals("+")) {
				result = left + right;
			}
			if(add.operator.equals("-")) {
				result = left - right;
			}
		}
		
		if(e instanceof Multiplication) {
			Multiplication mul = (Multiplication)e;
			int left = getExpressionResult(mul.left);
			int right = getExpressionResult(mul.right);
			if(mul.operator.equals("*")) {
				result = left * right;
			}
			if(mul.operator.equals("/")) {
				result = left / right;
			}
			if(mul.operator.equals("%")) {
				result = left % right;
			}			
		}
		
		return result;
	}

}
