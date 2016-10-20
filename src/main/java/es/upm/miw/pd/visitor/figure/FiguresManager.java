package es.upm.miw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figure> figures;

    public FiguresManager() {
        figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public double totalArea() {
        /*double result = 0;
        for (Figure figure : figures) {
            result += figure.area();
        }
        return result;*/
        VisitorArea visitorArea= new VisitorArea();
        for (Figure figure: this.figures){
            figure.accept(visitorArea);
        }
        return visitorArea.getArea();
        
        /*
         * Visitor1 v1 = new Visitor1();
        for (Element elemento : coleccion) {
            elemento.accept(v1);
        }
         */
    }

    public double totalNumberOfSides() {
       /* double result = 0;
        for (Figure figure : figures) {
            result += figure.numberOfSides();
        }
        return result;*/
        
        VisitorNumberOfSides visitorNumberOfSides= new VisitorNumberOfSides();
        for (Figure figure: this.figures){
            figure.accept(visitorNumberOfSides);
        }
        return visitorNumberOfSides.getNumberOfSides();
    }

}
