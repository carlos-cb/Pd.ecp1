package Factory.NaturalNumber;

public class NaturalNumberManager {
	
	private NaturalNumber naturalNumber;
	
	private NaturalNumberCreator naturalNumberCreator;
	
	public NaturalNumberManager(){
		this.naturalNumber = new NaturalNumberES();
	}
	
	public void setCreator(NaturalNumberCreator naturalNumberCreator){
		this.naturalNumberCreator = naturalNumberCreator;
	}

	public void creatnaturalNumber(){
		this.naturalNumber = this.naturalNumberCreator.creatNaturalNumber();
	}
	
	public NaturalNumber getNaturalNumber(){
		return this.naturalNumber;		
	}
		
}
