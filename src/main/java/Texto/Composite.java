package Texto;

import java.awt.Component;
import java.util.ArrayList;

public class Composite extends Componente{

	private ArrayList<Component> componente;
	
	public Composite(){
		componente = new ArrayList<Component>();
	}
	
	
	@Override
	public void add(Componente componente) {
    	   if(componente.isCaracter){
			   this.add(componente);
		   }else{
			   throw new UnsupportedOperationException();
		   }
	}
	
	
	
	
	

	@Override
	public String dibujar(boolean mayusculas) {
		return null;
           
		
	}


}
