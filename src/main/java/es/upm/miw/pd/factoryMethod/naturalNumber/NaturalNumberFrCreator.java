package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(Integer number) {
        return new NaturalNumberFr(number);
    }

  

}
