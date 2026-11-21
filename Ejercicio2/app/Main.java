package ejercicio2.app;

import ejercicio2.modelo.Empleado;
import ejercicio2.modelo.ReglaIncremento;
import ejercicio2.reglas.IncrementoAntiguedad;
import ejercicio2.reglas.IncrementoDesempeno;
import ejercicio2.reglas.IncrementoPromocion;

public class Main {
    public static void main(String[] args) {
        Empleado ana = new Empleado("Ana", 10000);
        System.out.println("=== Reglas autorizadas ===");
        System.out.println("Inicial: " + ana);

        ana.aplicarIncremento(new IncrementoAntiguedad(3));
        System.out.println("Antiguedad (3 anios): " + ana);

        ana.aplicarIncremento(new IncrementoDesempeno(95));
        System.out.println("Desempeno (95): " + ana);

        ana.aplicarIncremento(new IncrementoPromocion(5));
        System.out.println("Promocion (5 %): " + ana);

        System.out.println("\n=== Varias reglas en un arreglo ===");
        Empleado luis = new Empleado("Luis", 8000);
        ReglaIncremento[] reglas = {
            new IncrementoAntiguedad(1),
            new IncrementoDesempeno(75),
            new IncrementoPromocion(3)
        };
        for (ReglaIncremento regla : reglas) {
            luis.aplicarIncremento(regla);
            System.out.println("Regla de " + regla.getPorcentaje() + " %: " + luis);
        }

        System.out.println("\n=== Incrementos no autorizados ===");
        try {
            luis.aplicarIncremento(new IncrementoPromocion(40));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            luis.aplicarIncremento(new IncrementoPromocion(-5));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            luis.aplicarIncremento(new IncrementoAntiguedad(10));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Sueldo de Luis sin cambios: " + luis);
    }
}
