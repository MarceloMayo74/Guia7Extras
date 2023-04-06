package Ejercicio3.entidad;

import java.util.Scanner;

public class Juego {

    private int CantidadIntentos;
    private int NumeroAdivinar;
    private int NumeroIngresado;

    public Juego(int CantidadIntentos, int NumeroAdivinar, int NumeroIngresado) {
        this.CantidadIntentos = CantidadIntentos;
        this.NumeroAdivinar = NumeroAdivinar;
        this.NumeroIngresado = NumeroIngresado;
    }

    public Juego() {
    }

    public Juego crearJuego() {
        Scanner sc = new Scanner(System.in);
        Juego juego = new Juego();
        System.out.println("Ingresa la cantidad de intentos para adivinar");
        juego.setCantidadIntentos(sc.nextInt());
        System.out.println("Jugador 1: Elige el número a adivinar");
        juego.setNumeroAdivinar(sc.nextInt());
        return juego;
    }

    public void iniciar_juego(Juego juego) {
        int contador = 1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Jugador 2: Ingrese un número para adivinar");
            juego.setNumeroIngresado(sc.nextInt());
            if (juego.getNumeroIngresado() > juego.getNumeroAdivinar()) {
                System.out.println("Más bajo");
            } else if (juego.getNumeroIngresado() < juego.getNumeroAdivinar()) {
                System.out.println("Más alto");
            }
            contador++;
        } while (contador < juego.getCantidadIntentos() && juego.getNumeroAdivinar() != juego.getNumeroIngresado());
        if (juego.getNumeroAdivinar() != juego.getNumeroIngresado()) {
            System.out.println("No adivinaste :c");
        } else {
            System.out.println("Adivinaste!!!");
        }
    }

    public int getCantidadIntentos() {
        return CantidadIntentos;
    }

    public void setCantidadIntentos(int CantidadIntentos) {
        this.CantidadIntentos = CantidadIntentos;
    }

    public int getNumeroAdivinar() {
        return NumeroAdivinar;
    }

    public void setNumeroAdivinar(int NumeroAdivinar) {
        this.NumeroAdivinar = NumeroAdivinar;
    }

    public int getNumeroIngresado() {
        return NumeroIngresado;
    }

    public void setNumeroIngresado(int NumeroIngresado) {
        this.NumeroIngresado = NumeroIngresado;
    }
}
