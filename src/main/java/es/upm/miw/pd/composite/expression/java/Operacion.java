package es.upm.miw.pd.composite.expression.java;

public abstract class Operacion extends Expresion {

	private java.util.List<Expresion> operacion;
	
	public Operacion(Expresion expresion1, Expresion expresion2){		
		this.operacion= new java.util.ArrayList<Expresion>(2);
		this.operacion.add(expresion1);
		this.operacion.add(expresion2);
	}

    public java.util.List<Expresion> getOperacion() {
        return operacion;
    }

    public void setOperacion(java.util.List<Expresion> operacion) {
        this.operacion = operacion;
    }
    
    
    public String toString() {
        return "("+this.operacion.get(0).toString() +this.toStringOp()+this.operacion.get(1).toString() +")";
    }
  
    public abstract String toStringOp();
	
}
