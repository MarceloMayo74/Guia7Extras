package Ejercicio6.entidad;

import java.util.Scanner;

public class Rectangulo {

    private double Lado1;
    private double Lado2;

    public Rectangulo() {
    }

    public Rectangulo(double Lado1, double Lado2) {
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
    }

    public double getLado1() {
        return Lado1;
    }

    public void setLado1(double Lado1) {
        this.Lado1 = Lado1;
    }

    public double getLado2() {
        return Lado2;
    }

    public void setLado2(double Lado2) {
        this.Lado2 = Lado2;
    }

    public Rectangulo crearRectangulo() {
        Scanner sc = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingrese Lado1: ");
        rectangulo.setLado1(sc.nextInt());
        System.out.println("Ingrese Lado2: ");
        rectangulo.setLado2(sc.nextInt());
        return rectangulo;
    }

    public void calcular_area(Rectangulo rectangulo) {
        System.out.println("El area es: " + rectangulo.getLado1() * rectangulo.getLado2());
    }
}
