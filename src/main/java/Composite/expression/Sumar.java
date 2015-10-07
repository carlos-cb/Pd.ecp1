package Composite.expression;

public class Sumar extends Operacion{

	public Sumar(Expresion expresionA, Expresion expresionB){
		super(expresionA, expresionB); 
	}

	@Override
	public int operar() {
		
		return getExpresionA().operar() + getExpresionB().operar();
	}
	
	@Override
	public String toString() { 
		 return "("+getExpresionA().toString()+"+"+getExpresionB().toString()+")"; 
    } 
 

}
