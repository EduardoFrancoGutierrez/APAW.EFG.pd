package es.upm.miw.pd.composite.expression.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.composite.expression.java.Division;
import es.upm.miw.pd.composite.expression.java.Expresion;
import es.upm.miw.pd.composite.expression.java.Multiplicacion;
import es.upm.miw.pd.composite.expression.java.Numero;
import es.upm.miw.pd.composite.expression.java.Resta;
import es.upm.miw.pd.composite.expression.java.Suma;



public class ExpressionTest {
    private Expresion exp1, exp2, exp3, exp4, exp5, exp6,exp7;

    @Before
    public void ini() {
        this.exp1 = new Numero(4);
        this.exp2 = new Suma(this.exp1, new Numero(2));
        this.exp3 = new Resta(this.exp1, new Numero(3));
        this.exp4 = new Multiplicacion(this.exp1, new Numero(2));
        this.exp5 = new Division(this.exp1, new Numero(3));
        this.exp6 = new Suma(new Resta(new Numero(3), new Multiplicacion(
                new Division(this.exp1, new Numero(2)), new Numero(3))), this.exp1); // ((3-((4/2)*3))+4)
        this.exp7= new Suma (this.exp1, new Suma (new Numero(2),new Numero(3)));
    }

    @Test
    public void testValor() {
        assertEquals(4, this.exp1.operar());
    }

    @Test
    public void TestSuma() {
        assertEquals(6, this.exp2.operar());
    }

    @Test
    public void testResta() {
        assertEquals(1, this.exp3.operar());
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(8, this.exp4.operar());
    }

    @Test
    public void testDivision() {
        assertEquals(1, this.exp5.operar());
    }

    @Test
    public void testCompuesto() {
        System.out.println("hola"+this.exp7.operar());
        assertEquals(1, this.exp6.operar());
    }

    @Test
    public void testToString() {
        assertEquals(1, this.exp5.operar());
       // assertEquals("((3-((4/2)*3))+4)", this.exp6.toString());
    }
}
