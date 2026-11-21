package ejercicio1.app;

import ejercicio1.modelo.Sueldo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sueldo valido ===");
        Sueldo sueldo = new Sueldo(8500);
        System.out.println("Sueldo inicial: " + sueldo);
        sueldo.setMonto(9200);
        System.out.println("Sueldo cambiado a: " + sueldo);

        System.out.println("\n=== Sueldo en cero ===");
        Sueldo sinSueldo = new Sueldo(0);
        System.out.println("Sueldo: " + sinSueldo);

        System.out.println("\n=== Valores negativos ===");
        try {
            new Sueldo(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            sueldo.setMonto(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Sueldo despues de los intentos: " + sueldo);
    }
}
