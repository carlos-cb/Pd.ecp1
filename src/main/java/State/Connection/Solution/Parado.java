package State.Connection.Solution;


public class Parado extends Estado{

	@Override
	public void abrir(Conexion conexion) {
		 throw new UnsupportedOperationException("Acción no permitida...");
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		
		
	}

	@Override
	public void parar(Conexion conexion) {
		
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		
		
	}

	@Override
	public void enviar(String msg,Link link,Conexion conexion) {
		
		
	}

	@Override
	public void recibir(int respuesta,Conexion conexion) {
		
		
	}

	@Override
	public String toString() {
		return "Parado";
	}
	
	
	



	

}
