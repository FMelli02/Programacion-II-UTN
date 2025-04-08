package TrabajoPactico4;

public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche('D', 49.5f, 4, 2.4);
        Moto m1 = new Moto('N', 15.7f, 2, 4);
        Avion av1 = new Avion('M', 1500f, 10000f, 4);
        Helicoptero h1 = new Helicoptero('N', 500f, 900f, "Rescate");

        //Apartado B - Punto d
        System.out.println("Atributos coche");
        c1.mostrarAtributos();
        System.out.println("\nAtributos coche Super");
        c1.mostrarAtributosSuper();
        System.out.println("\nAtributos moto");
        m1.mostrarAtributos();
        System.out.println("\nAtributos moto Super");
        m1.mostrarAtributosSuper();
        System.out.println("\nAtributos avion");
        av1.mostrarAtributos();
        System.out.println("\nAtributos avion Super");
        av1.mostrarAtributosSuper();
        System.out.println("\nAtributos helicoptero");
        h1.mostrarAtributos();
        System.out.println("\nAtributos helicoptero Super");
        h1.mostrarAtributosSuper();
        //Apartado B - Punto e1
        System.out.println("\nVelocidad maxima: " + c1.velocidadMaxima());
        //Apartado B - Punto e2
        System.out.println("\nGet CantTurbinas: " + av1.getCantTurbinas());
        System.out.println("Get AlturaVuelo: " + av1.getAlturaVuelo());
        //Apartado C - Punto e
        System.out.println(" ");
        c1.desdePotencia(3, 45);
        //Apartado C - punto f
        System.out.println("\nCapacidad Máxima de carga de Helicóptero: " + h1.capacidadMaxDeCarga());
        //Punto 4b
        System.out.println("\nAtributos de " + h1.getClass().getSimpleName());
        h1.mostrarAtributos();
        //Punto 4c
        System.out.println("\nVelocidad máxima desde " + m1.getClass().getSimpleName() + ": " + m1.velocidadMaxima());
        System.out.println("Capacidad máxima desde " + av1.getClass().getSimpleName() + ": " + av1.capacidadMaxDeCarga());

    }
}
