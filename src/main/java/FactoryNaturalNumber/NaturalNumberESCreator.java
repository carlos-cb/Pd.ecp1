package FactoryNaturalNumber;

public class NaturalNumberESCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber creatNaturalNumber(int value) {
		return new NaturalNumber(value, new String[]{
	    		   "zero","uno","dos","tres","cuatro","cinco "
	       });
	}

}
