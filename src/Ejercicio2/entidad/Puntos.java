package Ejercicio2.entidad;

import java.util.Scanner;

public class Puntos {

    private double X1;
    private double X2;
    private double Y1;
    private double Y2;

    public Puntos(double X1, double X2, double Y1, double Y2) {
        this.X1 = X1;
        this.X2 = X2;
        this.Y1 = Y1;
        this.Y2 = Y2;
    }

    public Puntos() {
    }

    public Puntos crearPuntos() {
        Scanner sc = new Scanner(System.in);
        Puntos puntos = new Puntos();
        System.out.println("Ingrese las coordenadas de X1");
        puntos.setX1(sc.nextDouble());
        System.out.println("Ingrese las coordenadas de Y1");
        puntos.setY1(sc.nextDouble());
        System.out.println("Ingrese la coordenada X2");
        puntos.setX2(sc.nextDouble());
        System.out.println("Ingrese la coordenada Y2");
        puntos.setY2(sc.nextDouble());
        return puntos;
    }

    public void distanciaPuntos(Puntos puntos) {
        double distancia = Math.sqrt((Math.pow((puntos.getX2() - puntos.getX1()), 2)) + (Math.pow((puntos.getY2() - puntos.getY1()), 2)));
        System.out.println("La distancia es " + distancia);
    }

    public double getX1() {
        return X1;
    }

    public void setX1(double X1) {
        this.X1 = X1;
    }

    public double getX2() {
        return X2;
    }

    public void setX2(double X2) {
        this.X2 = X2;
    }

    public double getY1() {
        return Y1;
    }

    public void setY1(double Y1) {
        this.Y1 = Y1;
    }

    public double getY2() {
        return Y2;
    }

    public void setY2(double Y2) {
        this.Y2 = Y2;
    }

}
