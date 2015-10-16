package Factory.NaturalNumber;

public class NaturalNumberFR extends NaturalNumber{

	private final String[] textValue = {
			"nul", "un", "deux", "trois", "quatre", "cinq"
	};
	
	public NaturalNumberFR(int value) {
		super(value);
		this.setTextValue(textValue);

	}

}
