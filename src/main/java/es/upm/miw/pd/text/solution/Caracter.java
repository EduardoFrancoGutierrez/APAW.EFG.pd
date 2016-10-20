package es.upm.miw.pd.text.solution;

public class Caracter extends Componente {

    private char caracter;

    protected Caracter(char caracter) {
        super();
        this.caracter = caracter;
    }

    public char getCaracter() {
        return caracter;
    }

    @Override
    public String dibujar(Boolean mayuscula) {
        if (mayuscula) {
            return String.valueOf(this.caracter).toUpperCase();
        } else {
            return String.valueOf(this.caracter);
        }
    }

    @Override
    public TipoComponente getTipoComponente() {
        return TipoComponente.CARCACTER;
    }

    @Override
    public void add(Componente componente) {

    }

    @Override
    public void delete(Componente componente) {

    }

}
