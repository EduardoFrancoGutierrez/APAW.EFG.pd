package es.upm.miw.pd.composite.expression.java;

public class Division extends Operacion  {

    public Division(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int operar() {
        // TODO Auto-generated method stub
        return this.getOperacion().get(0).operar() / this.getOperacion().get(1).operar();
    }

}
