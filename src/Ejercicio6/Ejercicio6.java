/*
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area"
 * que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase
 * "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */
package Ejercicio6;

import Ejercicio6.entidades.Rectangulo;

public class Ejercicio6 {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo().crearRectangulo(4, 6);
        System.out.println(rectangulo1.calcular_area(rectangulo1));
    }
}
