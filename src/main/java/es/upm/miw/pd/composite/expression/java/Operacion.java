package es.upm.miw.pd.composite.expression.java;

public abstract class Operacion extends Expresion {

	private java.util.List<Expresion> expresion;
	
	public Operacion(){
		super();
		this.expresion= new java.util.ArrayList<Expresion>();
	}
}
