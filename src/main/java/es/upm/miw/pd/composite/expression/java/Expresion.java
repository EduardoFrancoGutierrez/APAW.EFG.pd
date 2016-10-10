package es.upm.miw.pd.composite.expression.java;

public abstract class Expresion {
    
    private Integer valor;

    public Expresion(){
        
    }
    public Expresion(Integer valor) {
        this.valor = valor;
    }

    public abstract int operar();

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    @Override
    public abstract String toString() ;
    
    

}
