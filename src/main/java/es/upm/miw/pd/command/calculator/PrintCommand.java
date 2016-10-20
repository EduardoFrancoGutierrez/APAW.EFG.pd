package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand implements Comando {
    private Calculator calculator;

    public PrintCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        IO.getIO().println("El total vale="+this.calculator.getTotal());
        
    }

    @Override
    public String name() {
        return "ImprimirComand";
    }

}
