package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(Integer number) {
        return new NaturalNumberEs(number);
    }

   

}
