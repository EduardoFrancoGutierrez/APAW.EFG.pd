package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

    private NaturalNumber naturalNumber;

    private NaturalNumberCreator naturalNumberCreator;

    public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
        this.naturalNumberCreator = naturalNumberCreator;
    }

    public void createNaturalNumber(Integer number) {
        this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(number);
    }

    public NaturalNumber getNaturalNumber() {
        return this.naturalNumber;
    }

}
