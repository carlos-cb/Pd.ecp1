package State.Connection;

public class Conexion {
	 private StateEstado estado;

	    private Link link;

	    public Conexion(Link link) {
	        assert link != null;
	        this.link = link;
	        this.estado = new StateCerrado();
	    }

	    public Link getLink() {
	        return link;
	    }

	    public Estado getEstado() {
	        return this.estado.getEstado();
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

	    public void enviar(String msg) {
	        estado.enviar(this, msg);
	    }

	    public void recibir(int respuesta) {
	        estado.recibir(this, respuesta);
	    }

	    public void setEstado(StateEstado estado) {
	        this.estado = estado;
	    }

}
