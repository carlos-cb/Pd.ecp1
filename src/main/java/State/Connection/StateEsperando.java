package State.Connection;

public class StateEsperando extends StateEstado {

	public StateEsperando() {
        super(Estado.ESPERANDO);
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        conexion.getLink().recibir(respuesta);
        if (respuesta == 0) {
            conexion.setEstado(new StatePreparado());
        } else {
            conexion.setEstado(new StateCerrado());
        }
    }

}
