package es.upm.miw.pd.composite.expression.java;

public class Suma extends Operacion {
    
    public Suma (Expresion expresion1, Expresion expresion2){
        super (expresion1,  expresion2);
    }

    @Override
    public int operar() {
        return this.getOperacion().get(0).operar()+ this.getOperacion().get(1).operar();
    }

    @Override
    public String toStringOp() {
        return "+";
    }
}
