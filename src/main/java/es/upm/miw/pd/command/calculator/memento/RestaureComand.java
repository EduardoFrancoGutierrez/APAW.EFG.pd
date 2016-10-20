package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.Comando;

public class RestaureComand implements Comando {
    private  CalculatorMementable calculatorMementable;
    
    public RestaureComand(CalculatorMementable calculatorMementable) {
        super();
        this.calculatorMementable = calculatorMementable;
    }

    @Override
    public void execute() {
        String valor=IO.getIO().readString("Introduzca el nombre del punto de control de guardado");
        MementoCalculator memento=this.calculatorMementable.restoreMemento(valor);
        IO.getIO().println("El valor total guardado es="+memento.getTotal());
        
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "ReataureComand";
    }

}
