package Ejercicio5.entidad;

import java.util.Scanner;

public class Empleado {

    private String Nombre;
    private int Edad;
    private double Salario;

    public Empleado() {
    }

    public Empleado(String Nombre, int Edad, double Salario) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public Empleado crearEmpleado() {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();
        System.out.println("Ingrese nombre empleado: ");
        empleado.setNombre(sc.next());
        System.out.println("Ingrese edad: ");
        empleado.setEdad(sc.nextInt());
        System.out.println("Ingrese salario: ");
        empleado.setSalario(sc.nextDouble());
        return empleado;
    }

    public void calcularAumento(Empleado empleado) {
        if (empleado.getEdad() > 30) {
            empleado.setSalario(empleado.getSalario() * 1.10);
            System.out.println("Por su edad " + empleado.getEdad() + " le corresponde un aumento del 10%, su salario es: " + empleado.getSalario());
        } else {
            empleado.setSalario(empleado.getSalario() * 1.05);
            System.out.println("Por su edad " + empleado.getEdad() + " le corresponde un aumento del 5%, su salario es: " + empleado.getSalario());
        }
    }

}
