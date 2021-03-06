package Texto;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private final Map<Character, Caracter> map = new HashMap<Character, Caracter>();
	private static FactoriaCaracter factoriaCaracteres ;
	
	private FactoriaCaracter(){
	}

    public Caracter get(char key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            Caracter pl = new Caracter(key);
            map.put(key, pl);
            return pl;
        } 
    }
    
    public static FactoriaCaracter getFactoria(){
    	if(FactoriaCaracter.factoriaCaracteres == null){
    		FactoriaCaracter.factoriaCaracteres = new FactoriaCaracter();
    	}
    	return FactoriaCaracter.factoriaCaracteres;
    }

}
