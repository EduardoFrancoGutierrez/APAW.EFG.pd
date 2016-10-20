package es.upm.miw.pd.visitor.figure.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.visitor.figure.Circle;
import es.upm.miw.pd.visitor.figure.FiguresManager;
import es.upm.miw.pd.visitor.figure.Square;
import es.upm.miw.pd.visitor.figure.Triangle;

public class VisitorFiguresManagerTest {

    private FiguresManager figureManager,figureManager2;
    
    @Before
    public void ini() {
        this.figureManager= new FiguresManager();
        this.figureManager2= new FiguresManager();
        this.figureManager.add(new Circle("Circulo",5));
        this.figureManager.add(new Triangle("Tringulo",4,2));
        this.figureManager.add(new Square("Cuadrado",5));
        this.figureManager2.add(new Triangle("Tringulo",4,2));
        this.figureManager2.add(new Square("Cuadrado",5));
    }

    @Test
    public void testTotalArea() {
        assertEquals(107.5398163,this.figureManager.totalArea(), 0.1);
        assertEquals(29.0,this.figureManager2.totalArea(), 0.1);
        
    }

    @Test
    public void testTotalNumberOfSides() {
        assertEquals(Double.POSITIVE_INFINITY,this.figureManager.totalNumberOfSides(), 0.1); 
        assertEquals(7.0,this.figureManager2.totalNumberOfSides(), 0.1);
    }

}
