package ejercicio1.modelo;

public class Sueldo {
    private double monto;

    public Sueldo(double monto) {
        validar(monto);
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        validar(monto);
        this.monto = monto;
    }

    private void validar(double monto) {
        if (monto < 0) {
            throw new IllegalArgumentException("El sueldo no puede ser negativo: " + monto);
        }
    }

    @Override
    public String toString() {
        return String.format("$%.2f", monto);
    }
}
