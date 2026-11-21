package ejercicio2.reglas;

import ejercicio2.modelo.ReglaIncremento;

public class IncrementoDesempeno implements ReglaIncremento {
    private int calificacion;

    public IncrementoDesempeno(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public double getPorcentaje() {
        if (calificacion >= 90) {
            return 8;
        } else if (calificacion >= 70) {
            return 4;
        } else {
            return 0;
        }
    }
}
