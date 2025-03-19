package Ejercicio1;

public class Animal {
    public String raza;
    public int edad;
    public static int machos = 0;
    public static int hembras = 0;

    public Animal() {
    }

    public Animal(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public void mostrarAtributos() {
        System.out.println("Raza: " + raza + "; Edad: " + edad);
    }

    public void aumentarMachos() {
        Animal.machos++;
    }

    public void aumentarHembras() {
        Animal.hembras++;
    }
}
