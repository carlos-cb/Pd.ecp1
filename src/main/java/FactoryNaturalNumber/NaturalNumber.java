package FactoryNaturalNumber;

public class NaturalNumber {
    private int value;
    private String[] textValue;


    public NaturalNumber(int value, String[] textValue) {
        this.setValue(value);
        this.setTextValue(textValue);
    }

    public int getValue() {
        return value;
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
