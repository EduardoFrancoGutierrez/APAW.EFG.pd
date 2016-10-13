package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber{

    private static final String[] textValue = {"zero", "un", "deux", "trois", "quatre", "cinq"};
    
    public NaturalNumberFr(int value) {
        super(value);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public String getTextValue() {
        if (this.getValue() < textValue.length) {
            return NaturalNumberFr.textValue[this.getValue()];
        } else {
            return "???";
        }
    }
}
