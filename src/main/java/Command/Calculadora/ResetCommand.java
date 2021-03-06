package Command.Calculadora;

public class ResetCommand extends Command{

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		calculator.reset();
	}
	
	@Override
	public String name() {
	    return "Reset";
	}

	
}
