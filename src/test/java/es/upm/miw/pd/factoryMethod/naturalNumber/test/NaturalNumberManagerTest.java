package es.upm.miw.pd.factoryMethod.naturalNumber.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberCreator;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberEnCreator;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberEsCreator;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberFrCreator;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberManager;

public class NaturalNumberManagerTest {
    
    private NaturalNumberManager naturalNumberManager;
    private NaturalNumberCreator naturalNumberFr, naturalNumberEs, naturalNumberEn;
   
    @Before
    public void ini() {
        this.naturalNumberManager = new NaturalNumberManager();
        this.naturalNumberFr = new NaturalNumberFrCreator();
        this.naturalNumberEs = new NaturalNumberEsCreator();
        this.naturalNumberEn = new NaturalNumberEnCreator();
    }
    
    @Test
    public void  getTextValueNaturalNumberFr(){
        this.naturalNumberManager.setNaturalNumberCreator(naturalNumberFr);
        this.naturalNumberManager.createNaturalNumber(2);
        assertEquals("deux", this.naturalNumberManager.getNaturalNumber().getTextValue());      
    }
    
    @Test
    public void  getTextValueNaturalNumberEs(){
        this.naturalNumberManager.setNaturalNumberCreator(naturalNumberEs);
        this.naturalNumberManager.createNaturalNumber(2);
        assertEquals("dos", this.naturalNumberManager.getNaturalNumber().getTextValue());
        
    }
    @Test
    public void  getTextValueNaturalNumberEn(){
        this.naturalNumberManager.setNaturalNumberCreator(naturalNumberEn);
        this.naturalNumberManager.createNaturalNumber(2);
        assertEquals("two", this.naturalNumberManager.getNaturalNumber().getTextValue());
        
    }
    
    @Test
    public void  getTextValueNaturalNumberEsError(){
        this.naturalNumberManager.setNaturalNumberCreator(naturalNumberEs);
        this.naturalNumberManager.createNaturalNumber(20);
        assertEquals("???", this.naturalNumberManager.getNaturalNumber().getTextValue());
        
    }
    

}
