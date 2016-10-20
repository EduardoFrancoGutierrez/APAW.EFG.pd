package es.upm.miw.pd.text.solution;

public class Parrafo extends TextoComposite {

    @Override
    public String dibujar(Boolean mayuscula) {
        StringBuilder str = this.dibujarTextoComposite(mayuscula);
        str.append('\n');
        return str.toString();
    }

    @Override
    public void add(Componente componente) {
        if (TipoComponente.CARCACTER.equals(componente.getTipoComponente())) {
            this.getTextoComposite().add(componente);
        } else {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }

    }

    @Override
    public TipoComponente getTipoComponente() {
        return TipoComponente.PARRAFO;
    }

    @Override
    public void delete(Componente componente) {
        if (TipoComponente.CARCACTER.equals(componente.getTipoComponente())) {
            this.getTextoComposite().remove(componente);
        }

    }

}
