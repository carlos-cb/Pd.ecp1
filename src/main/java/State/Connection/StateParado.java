package State.Connection;

public class StateParado extends StateEstado {

	public StateParado() {
		super(Estado.PARADO);
	}
	@Override
	public void parar(Conexion conexion){
		conexion.setEstado(new StateParado());
	}
	
	@Override
	public void iniciar(Conexion conexion){
		conexion.setEstado(new StatePreparado());
	}

}
