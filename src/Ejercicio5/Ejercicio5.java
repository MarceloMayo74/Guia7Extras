/*
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un
 * empleado en función de su edad y salario actual. El aumento salarial debe ser
 * del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Ejercicio5;

import Ejercicio5.entidad.Empleado;

public class Ejercicio5 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado().crearEmpleado();
        empleado1.calcularAumento(empleado1);
    }

}
