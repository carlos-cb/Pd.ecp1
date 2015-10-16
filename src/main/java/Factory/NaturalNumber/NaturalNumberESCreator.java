package Factory.NaturalNumber;

public class NaturalNumberESCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber creatNaturalNumber(int value) {
		return new NaturalNumber(value);
	}

}
