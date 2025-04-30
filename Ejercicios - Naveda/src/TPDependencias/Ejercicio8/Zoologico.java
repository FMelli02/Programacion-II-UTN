package TPDependencias.Ejercicio8;

import java.util.ArrayList;

public class Zoologico {
    public ArrayList<Animal> animales;

    public Zoologico() {
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal a) {
        this.animales.add(a);
    }
}
