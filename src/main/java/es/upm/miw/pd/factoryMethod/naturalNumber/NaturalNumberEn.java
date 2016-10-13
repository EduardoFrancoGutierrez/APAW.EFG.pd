package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn  extends NaturalNumber{

    private static final String[] textValue = {"zero", "one", "two", "three", "four", "five"};
    
    public NaturalNumberEn(int value) {
        super(value);
        // TODO Auto-generated constructor stub
    }
    
    
    @Override
    public String getTextValue() {
        if (this.getValue() < textValue.length) {
            return NaturalNumberEn.textValue[this.getValue()];
        } else {
            return "???";
        }
    }
}
