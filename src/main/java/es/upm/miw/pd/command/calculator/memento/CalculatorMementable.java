package es.upm.miw.pd.command.calculator.memento;

import es.upm.miw.pd.command.calculator.Calculator;

public class CalculatorMementable extends Calculator implements Mementable <MementoCalculator> {
    private MementoManager <MementoCalculator> mementoManager = new MementoManager<MementoCalculator>();


    @Override
    public MementoCalculator restoreMemento(String key) {
        // TODO Auto-generated method stub
        MementoCalculator memento=this.mementoManager.getMemento(key);
        this.reset();
        this.add(memento.getTotal());
        return memento;
    }

    @Override
    public MementoCalculator createMemento(String key) {
        MementoCalculator memento= new MementoCalculator();
        memento.setTotal(this.getTotal());
        this.getMementoManager().addMemento(key, memento);
        return memento ;
    }

    public MementoManager<MementoCalculator> getMementoManager() {
        return mementoManager;
    }    
    

}
