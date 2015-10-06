package FactoryNaturalNumber;

public class NaturalNumberENCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber creatNaturalNumber(int value) {
		
       return new NaturalNumber(value, new String[]{
    		   "zero","one","two","three","four","five"
       });
	}

}
