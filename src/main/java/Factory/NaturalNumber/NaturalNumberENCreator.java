package Factory.NaturalNumber;

public class NaturalNumberENCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber creatNaturalNumber(int value) {
		
       return new NaturalNumber(value);
	}

}
