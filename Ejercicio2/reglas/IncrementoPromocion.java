package ejercicio2.reglas;

import ejercicio2.modelo.ReglaIncremento;

public class IncrementoPromocion implements ReglaIncremento {
    private double porcentaje;

    public IncrementoPromocion(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double getPorcentaje() {
        return porcentaje;
    }
}
