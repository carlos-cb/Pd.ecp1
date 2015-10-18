package Factory.NaturalNumber;

public class NaturalNumberFRCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber creatNaturalNumber() {
		
       return new NaturalNumberFR();
	}

}
