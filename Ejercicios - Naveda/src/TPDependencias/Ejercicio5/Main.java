package TPDependencias.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        //Ejemplo UpCasting
        Animal a1 = new Animal();
        Animal a2 = (Animal) new Perro();
        a1.hacerSonido();
        a2.hacerSonido();
    }
}
