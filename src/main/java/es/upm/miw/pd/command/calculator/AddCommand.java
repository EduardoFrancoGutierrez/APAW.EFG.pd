package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class AddCommand implements Comando {
    private Calculator calculator;
    
    public AddCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        int valor=IO.getIO().readInt("Introduzca el valor a sumar");
        this.calculator.add(valor);
        
    }

    @Override
    public String name() {
        return "SumaComando";
    }

}
