package Texto;

public abstract class Componente {
	
	public abstract void add(Componente componente);
	
	public abstract String dibujar(boolean enMayusculas);
	
	public abstract boolean isComposite();
}
