package ejercicio2.modelo;

public class Empleado {
    public static final double LIMITE = 15;

    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        if (sueldo < 0) {
            throw new IllegalArgumentException("El sueldo no puede ser negativo: " + sueldo);
        }
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void aplicarIncremento(ReglaIncremento regla) {
        double porcentaje = regla.getPorcentaje();
        if (porcentaje < 0 || porcentaje > LIMITE) {
            throw new IllegalArgumentException("Incremento no autorizado: " + porcentaje + " %");
        }
        sueldo = sueldo + sueldo * porcentaje / 100;
    }

    @Override
    public String toString() {
        return String.format("%s - sueldo: $%.2f", nombre, sueldo);
    }
}
