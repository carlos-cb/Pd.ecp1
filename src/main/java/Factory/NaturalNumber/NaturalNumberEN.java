package Factory.NaturalNumber;

public class NaturalNumberEN extends NaturalNumber{

	private final String[] textValue = {
			"zero", "one", "two", "three", "four", "five"
	};
	
	public NaturalNumberEN(int value) {
		super(value);
		this.setTextValue(textValue);
	}


}
