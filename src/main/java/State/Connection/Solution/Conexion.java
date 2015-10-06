package State.Connection.Solution;

public class Conexion {
	
	private Estado estado;
	



	public Conexion(){
		
	}
	
	

	public void abrir() {
        estado.abrir(this);
    }
	
	public void cerrar() {
        estado.cerrar(this);
    }
	
	public void parar() {
        estado.parar(this);
    }
	
	public void iniciar() {
        estado.iniciar(this);
    }
	
	public void enviar() {
        estado.enviar(this);
    }
	
	public void recibir() {
        estado.recibir(this);
    }
	
	
	 @Override
	 public String toString() {
	 return "Context[" + estado.toString() + "]";
	    }

	 
	 
	public void setestado(){
	
	}




}
