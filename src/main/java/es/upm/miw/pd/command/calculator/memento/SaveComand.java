package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.Comando;

public class SaveComand implements Comando {
    private  CalculatorMementable calculatorMementable;
    
    public SaveComand(CalculatorMementable calculatorMementable) {
        super();
        this.calculatorMementable = calculatorMementable;
    }

    @Override
    public void execute() {
       String valor=IO.getIO().readString("Introduzca el nombre del punto de control a guardar");
       this.calculatorMementable.createMemento(valor);
        
    }

    @Override
    public String name() {
        return "GuardarComando";
    }

}
