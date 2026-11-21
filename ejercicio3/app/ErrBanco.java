package ejercicio3.app;

import ejercicio3.banco.Cuenta;

public class ErrBanco {
    public static void main(String[] args) {
        Cuenta ana = new Cuenta("Ana");
        ana.saldo = 1000000;
        ana.setSaldo(1000000);
    }
}
