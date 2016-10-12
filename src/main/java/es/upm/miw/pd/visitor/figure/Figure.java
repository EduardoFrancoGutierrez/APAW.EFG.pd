package es.upm.miw.pd.visitor.figure;

;

public abstract class Figure {

    public Figure(String description) {
    }
    
    public abstract void accept(Visitor v);

}
