package Visitor.Figure;

public abstract class Figure {

	private String description;
	
    public Figure(String description) {
    }

    public String getDescription(){
    	return description;
    }
    
    public void accept(Visitor visitor){
    	
    }
    
}
