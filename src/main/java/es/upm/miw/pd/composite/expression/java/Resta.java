package es.upm.miw.pd.composite.expression.java;

public class Resta extends Operacion {

    public Resta(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public int operar() {
        return  this.getOperacion().get(0).operar() - this.getOperacion().get(1).operar();
    }

}
