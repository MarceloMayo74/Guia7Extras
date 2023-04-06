/*
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá́ definir además dos constructores: uno vacío que inicializa el título y el autor a
 * cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. 
 * Se deberán además definir los métodos getters y setters correspondientes.
 */
package Ejercicio1;

import Ejercicio1.entidad.Cancion;

public class Ejercicio1 {

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion().crearCancion();
        cancion1.mostrarCancion(cancion1);
    }
}
