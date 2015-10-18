package Factory.NaturalNumber;

public class NaturalNumberESCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber creatNaturalNumber() {
		return new NaturalNumberES();
	}

}
