package ejercicio2.reglas;

import ejercicio2.modelo.ReglaIncremento;

public class IncrementoAntiguedad implements ReglaIncremento {
    private int anios;

    public IncrementoAntiguedad(int anios) {
        this.anios = anios;
    }

    @Override
    public double getPorcentaje() {
        return anios * 2;
    }
}
