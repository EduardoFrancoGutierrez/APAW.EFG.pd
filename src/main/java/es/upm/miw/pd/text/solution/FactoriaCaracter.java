package es.upm.miw.pd.text.solution;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    // Aqui se crea para creación temprana
    private static FactoriaCaracter factoriaCaracter = new FactoriaCaracter();

    private Map<Character, Caracter> references;

    private FactoriaCaracter() {
        this.references = new HashMap<>();
    }

    public static FactoriaCaracter getFactoria() {
        return FactoriaCaracter.factoriaCaracter;
    }

    public Caracter get(Character car) {
        Caracter caracterRetorno = this.references.get(car);
        if (caracterRetorno == null) {
            caracterRetorno = new Caracter(car);
            this.references.put(car, caracterRetorno);
        }
        return caracterRetorno;
    }

    public void removeCaracter(Character car) {
        this.references.remove(car);
    }

}
