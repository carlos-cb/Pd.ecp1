package Factory.NaturalNumber;

public class NaturalNumberFRCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber creatNaturalNumber(int value) {
		
       return new NaturalNumber(value);
	}

}
