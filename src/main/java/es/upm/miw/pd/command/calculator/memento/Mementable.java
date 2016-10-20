package es.upm.miw.pd.command.calculator.memento;

public interface Mementable <T> {
    T createMemento (String key);
   T restoreMemento (String key);
}
