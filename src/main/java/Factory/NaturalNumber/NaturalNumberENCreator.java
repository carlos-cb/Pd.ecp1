package Factory.NaturalNumber;

public class NaturalNumberENCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber creatNaturalNumber() {
		
       return new NaturalNumberEN();
	}

}
