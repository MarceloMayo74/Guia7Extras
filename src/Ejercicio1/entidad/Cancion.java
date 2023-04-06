package Ejercicio1.entidad;

import java.util.Scanner;

public class Cancion {

    private String Titulo;
    private String Autor;

    public Cancion(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public Cancion() {
    }

    public Cancion crearCancion() {
        Scanner sc = new Scanner(System.in);
        Cancion cancion = new Cancion();
        System.out.println("Ingrese el Título");
        cancion.setTitulo(sc.next());
        System.out.println("Ingrese el Autor");
        cancion.setAutor(sc.next());
        return cancion;
    }

    public void mostrarCancion(Cancion cancion) {
        System.out.println("Titulo : " + cancion.getTitulo());
        System.out.println("Autor : " + cancion.getAutor());

    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getAutor() {
        return Autor;
    }

}
