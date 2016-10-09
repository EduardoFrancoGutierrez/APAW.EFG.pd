package es.upm.miw.pd.composite.expression.java;

public class Numero extends Expresion {
	
	
	public Numero (Integer valor){
		super(valor);
	}

	@Override
	public int operar() {
		return this.getValor();
	}

}
