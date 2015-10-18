package Factory.NaturalNumber;

public class NaturalNumberFR extends NaturalNumber{

	private final String[] textValue = {
			"nul", "un", "deux", "trois", "quatre", "cinq"
	};
	
	public NaturalNumberFR() {
		super();
		this.setTextValue(textValue);

	}

}
