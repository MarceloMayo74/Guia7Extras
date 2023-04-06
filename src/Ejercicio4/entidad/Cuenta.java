package Ejercicio4.entidad;

import java.util.Scanner;

public class Cuenta {

    private String Titular;
    private double Saldo;

    public Cuenta() {
    }

    public Cuenta(String Titular, double Saldo) {
        this.Titular = Titular;
        this.Saldo = Saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public Cuenta crearCuenta() {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        System.out.println("Crearemos una nueva cuenta:");
        System.out.println("Titular:");
        cuenta.setTitular(sc.nextLine());
        System.out.println("Saldo:");
        cuenta.setSaldo(sc.nextDouble());
        return cuenta;
    }

    public void operarCuenta(Cuenta cuenta) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea retirar dinero?  si/no");
        String rta = sc.next();
        if (rta.equalsIgnoreCase("si")) {
            cuenta.retirarDinero(cuenta);
            System.out.println("Su saldo es " + cuenta.getSaldo());
        } else {
            System.out.println("Hasta pronto.");
        }
    }

    public void retirarDinero(Cuenta cuenta) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto desea retirar?");
        double retiro = sc.nextDouble();
        if (cuenta.getSaldo() < retiro) {
            System.out.println("No es posible retirar esa cantidad!");
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
        }
    }
}
