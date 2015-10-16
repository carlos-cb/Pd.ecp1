package Factory.NaturalNumber;

public class NaturalNumberManager {
	
	private NaturalNumber naturalNumber;
	
	private NaturalNumberCreator naturalNumberCreator;
	
	public void setCreator(NaturalNumberCreator naturalNumberCreator){
		this.naturalNumberCreator = naturalNumberCreator;
	}

	public void creatnaturalNumber(int value){
		this.naturalNumber = this.naturalNumberCreator.creatNaturalNumber(value);
	}
	
	public NaturalNumber getNaturalNumber(){
		return naturalNumber;		
	}
		
}
