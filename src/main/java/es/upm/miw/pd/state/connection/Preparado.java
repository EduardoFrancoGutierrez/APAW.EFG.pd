package es.upm.miw.pd.state.connection;

public class Preparado  extends State {

    @Override
    public void abrir(Conexion conexion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setState(new Cerrado());
        
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setState(new Parado());
        
    }

    @Override
    public void iniciar(Conexion conexion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.getLink().enviar(msg);
        conexion.setState(new Esperando());
        
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public Estado getEstado() {
        // TODO Auto-generated method stub
        return Estado.PREPARADO;
    }

    

   

}
