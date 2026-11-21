package ejercicio3.app;

import ejercicio3.banco.Cuenta;
import java.util.ArrayList;

public class Main {
    private static void mostrarHistorial(Cuenta cuenta) {
        System.out.println("Historial de " + cuenta.getTitular() + ":");
        for (String operacion : cuenta.getHistorial()) {
            System.out.println("  " + operacion);
        }
    }

    public static void main(String[] args) {
        Cuenta ana = new Cuenta("Ana");
        Cuenta luis = new Cuenta("Luis");

        System.out.println("=== Operaciones validas ===");
        ana.depositar(5000);
        ana.retirar(1200);
        ana.transferir(luis, 1500);
        System.out.println(ana);
        System.out.println(luis);

        System.out.println("\n=== Historial ===");
        mostrarHistorial(ana);
        mostrarHistorial(luis);

        System.out.println("\n=== Operaciones rechazadas ===");
        try {
            ana.depositar(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            ana.retirar(10000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            ana.transferir(ana, 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            ana.transferir(luis, 50000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(ana);
        System.out.println(luis);

        System.out.println("\n=== Copia del historial ===");
        ArrayList<String> copia = ana.getHistorial();
        copia.clear();
        System.out.println("Operaciones en la copia: " + copia.size());
        System.out.println("Operaciones en el historial real: " + ana.getHistorial().size());
    }
}
