package es.upm.miw.pd.text.solution;

public class Texto extends TextoComposite {

    @Override
    public void add(Componente componente) {
        // TODO Auto-generated method stub
        if (!TipoComponente.CARCACTER.equals(componente.getTipoComponente())) {
            this.getTextoComposite().add(componente);
        } else {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }

    }

    @Override
    public void delete(Componente componente) {
        if (!TipoComponente.CARCACTER.equals(componente.getTipoComponente())) {
            this.getTextoComposite().remove(componente);
        }

    }

    @Override
    public String dibujar(Boolean mayuscula) {
        StringBuilder str = this.dibujarTextoComposite(mayuscula);
        str.append("---o---\n");
        return str.toString();
    }

    @Override
    public TipoComponente getTipoComponente() {
        return TipoComponente.TEXTO;
    }

}
