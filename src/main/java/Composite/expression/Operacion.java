package Composite.expression;

public abstract class Operacion extends Expresion{

	private Expresion expresionA;
	private Expresion expresionB;
	
	public Operacion(Expresion expresionA, Expresion expresionB){
		this.expresionA = expresionA;
		this.expresionB = expresionB;
	}
	
	public Expresion getExpresionA(){
		return expresionA;
	}
	
	public void setExpresionA(Expresion expresionA){
		this.expresionA = expresionA;
	}
	
	public Expresion getExpresionB(){
		return expresionB;
	}
	
	public void setExpresionB(Expresion expresionB){
		this.expresionB = expresionB;
	}

	public abstract int operar();

}
