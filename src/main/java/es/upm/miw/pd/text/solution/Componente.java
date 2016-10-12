package es.upm.miw.pd.text.solution;

public abstract class Componente {
    public abstract String dibujar(Boolean mayuscula);

    public abstract TipoComponente getTipoComponente();

    public abstract void add(Componente componente);

    public abstract void delete(Componente componente);

}
