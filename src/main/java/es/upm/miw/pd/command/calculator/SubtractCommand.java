package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class SubtractCommand implements Comando{

    private Calculator calculator;
    
    public SubtractCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        int valor=IO.getIO().readInt("Introduzca el valor a restar");
        this.calculator.subtract(valor);
        
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "RestaComando";
    }

}
