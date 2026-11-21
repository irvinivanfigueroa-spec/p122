package ejercicio1.app;

import ejercicio1.modelo.Sueldo;

public class ErrSueldo {
    public static void main(String[] args) {
        Sueldo sueldo = new Sueldo(8500);
        sueldo.monto = -5;
    }
}
