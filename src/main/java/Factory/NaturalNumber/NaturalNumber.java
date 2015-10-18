package Factory.NaturalNumber;

public class NaturalNumber {
    private int value;
    private String[] textValue;

    public NaturalNumber() {
		this.value = 0;
	}

	public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }

    public String getTextValue() {
        if (this.value < textValue.length) {
            return this.textValue[this.value];
        } else {
            return "???";
        }
    }
    
    public void setTextValue(String[] textvalue){
    	this.textValue=textvalue;
    	
    }

}
