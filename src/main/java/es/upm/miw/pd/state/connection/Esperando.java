package es.upm.miw.pd.state.connection;

public class Esperando extends State {

    
    @Override
    public void abrir(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public void cerrar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public void parar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");        
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        if (respuesta == 0) {
            conexion.setState(new Preparado());
        } else {
            conexion.setState(new Cerrado());
        }
        
    }

    @Override
    public Estado getEstado() {
        // TODO Auto-generated method stub
        return Estado.ESPERANDO;
    }



   

}
