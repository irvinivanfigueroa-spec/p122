package ejercicio2.app;

import ejercicio2.modelo.Empleado;

public class ErrEmpleado {
    public static void main(String[] args) {
        Empleado ana = new Empleado("Ana", 10000);
        double sueldo = ana.sueldo;
        ana.setSueldo(1000000);
    }
}
