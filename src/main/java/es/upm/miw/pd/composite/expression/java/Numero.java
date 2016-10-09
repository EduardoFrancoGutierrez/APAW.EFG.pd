package es.upm.miw.pd.composite.expression.java;

public class Numero extends Expresion {
	
	public Integer  valor;
	
	public Numero (Integer valor){
		super();
		this.valor=valor;
	}

	@Override
	public int operar() {
		return this.valor;
	}

}
