package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class TextoComposite extends Componente {

    private List<Componente> textoComposite;

    public TextoComposite() {
        this.textoComposite = new ArrayList<Componente>();
    }

    public abstract void add(Componente componente);

    public abstract void delete(Componente componente);

    public List<Componente> getTextoComposite() {
        return textoComposite;
    }

    protected StringBuilder dibujarTextoComposite(Boolean mayuscula) {
        StringBuilder str = new StringBuilder();
        for (Componente componente : this.getTextoComposite()) {
            str.append(componente.dibujar(mayuscula));
        }
        return str;

    }

}
