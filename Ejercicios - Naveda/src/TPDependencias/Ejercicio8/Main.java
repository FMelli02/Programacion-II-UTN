package TPDependencias.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        //UpCasting
        Zoologico z = new Zoologico();
        Mono m = new Mono("Macho", 7, true);

        Animal a = m;

        z.agregarAnimal(a);
        z.agregarAnimal(new Tiburon("Hembra", 3, "Mediano"));
    }
}
