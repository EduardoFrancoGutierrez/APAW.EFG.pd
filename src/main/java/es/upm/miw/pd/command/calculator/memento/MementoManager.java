package es.upm.miw.pd.command.calculator.memento;

import java.util.HashMap;
import java.util.Map;

public class MementoManager<T> {
    private Map<String, T> mapMemento = new HashMap<>();

    public void addMemento(String key, T memento) {
        this.mapMemento.put(key, memento);
    }

    public T getMemento(String key) {
        return this.mapMemento.get(key);
    }

    public String[] keys() {
        return this.mapMemento.keySet().toArray(new String[0]);
    }
}
