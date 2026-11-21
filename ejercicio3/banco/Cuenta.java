package ejercicio3.banco;

import java.util.ArrayList;

public class Cuenta {
    private String titular;
    private double saldo;
    private ArrayList<String> historial;

    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.historial = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<String> getHistorial() {
        return new ArrayList<>(historial);
    }

    public void depositar(double monto) {
        validarMonto(monto);
        saldo += monto;
        historial.add(String.format("Deposito de $%.2f | saldo: $%.2f", monto, saldo));
    }

    public void retirar(double monto) {
        validarMonto(monto);
        validarFondos(monto);
        saldo -= monto;
        historial.add(String.format("Retiro de $%.2f | saldo: $%.2f", monto, saldo));
    }

    public void transferir(Cuenta destino, double monto) {
        if (destino == null || destino == this) {
            throw new IllegalArgumentException("Cuenta destino invalida");
        }
        validarMonto(monto);
        validarFondos(monto);
        saldo -= monto;
        destino.saldo += monto;
        historial.add(String.format("Transferencia enviada a %s de $%.2f | saldo: $%.2f",
                destino.titular, monto, saldo));
        destino.historial.add(String.format("Transferencia recibida de %s de $%.2f | saldo: $%.2f",
                titular, monto, destino.saldo));
    }

    private void validarMonto(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero: " + monto);
        }
    }

    private void validarFondos(double monto) {
        if (monto > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente: " + saldo);
        }
    }

    @Override
    public String toString() {
        return String.format("%s - saldo: $%.2f", titular, saldo);
    }
}
