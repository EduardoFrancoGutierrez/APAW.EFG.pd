package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber{

    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};
    
    public NaturalNumberEs(int value) {
        super(value);
    }
    
    @Override
    public String getTextValue() {
        if (this.getValue() < textValue.length) {
            return NaturalNumberEs.textValue[this.getValue()];
        } else {
            return "???";
        }
    }

}
