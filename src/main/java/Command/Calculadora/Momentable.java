package Command.Calculadora;

public interface Momentable<T> {
	
	T createMemento();

    void restoreMemento(T memento);

}
