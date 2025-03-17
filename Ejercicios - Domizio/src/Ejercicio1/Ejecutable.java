package Ejercicio1;

public class Ejecutable {
    public static void main(String[] args) {
        Animal a1 = new Animal("Labrador", 5);
        a1.mostrarAtributos();
        a1.aumentarMachos();

        Animal a2 = new Animal("Caniche", 10);
        a2.mostrarAtributos();
        a2.aumentarHembras();

        Animal a3 = new Animal("Pitbull", 3);
        a3.mostrarAtributos();
        a3.aumentarMachos();

        System.out.println("Cantidad de animales de tipo macho: " + Animal.machos);
        System.out.println("Cantidad de animales de tipo hembra: " + Animal.hembras);
    }
}
