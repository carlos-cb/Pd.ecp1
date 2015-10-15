package State.Connection;

public abstract class StateEstado {

	private Estado estado;

    public StateEstado(Estado estado) {
        this.estado = estado;
    }
    
    public Estado getEstado() {
        return estado;
    }

	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");		
	}

	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");		
	}

	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");		
	}

	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

}
