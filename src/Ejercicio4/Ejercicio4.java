/*
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero del
 * saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de
 * realizar una transacción de retiro. 
 */
package Ejercicio4;

import Ejercicio4.entidad.Cuenta;

public class Ejercicio4 {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta().crearCuenta();
        cuenta1.operarCuenta(cuenta1);
    }
}
