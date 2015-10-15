package State.Connection;

public class StateCerrado extends StateEstado {

    public StateCerrado() {
        super(Estado.CERRADO);
    }

    @Override
    public void abrir(Conexion conexion) {
        conexion.setEstado(new StatePreparado());
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setEstado(new StateCerrado());
    }

}
