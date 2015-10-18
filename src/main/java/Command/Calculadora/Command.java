package Command.Calculadora;

public class Command implements Comando{
	
	protected Calculator calculator;

	public Command(Calculator calculator) {
        this.calculator = calculator;
    }
	
	public String name() {
		return null;
	}

	public void execute() {

	}

}
