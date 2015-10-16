package Factory.NaturalNumber;

public class NaturalNumberES extends NaturalNumber{

	private final String[] textValue = {
			"cero", "uno", "dos", "tres", "cuatro", "cinco"
	};
	
	public NaturalNumberES(int value) {
		super(value);
		this.setTextValue(textValue);

	}
	
}
