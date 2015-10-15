package State.Connection;

public class StatePreparado extends StateEstado {

    public StatePreparado() {
        super(Estado.PREPARADO);
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setEstado(new StateParado());
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setEstado(new StateCerrado());
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.getLink().enviar(msg);
        conexion.setEstado(new StateEsperando());
    }

    @Override
    public void abrir(Conexion conexion) {
        conexion.setEstado(new StatePreparado());
    }

    @Override
    public void iniciar(Conexion conexion) {
        conexion.setEstado(new StatePreparado());
    }

}
