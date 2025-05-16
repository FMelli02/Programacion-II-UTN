package TPClasesGenericas.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        PilaArray<String> pila = new PilaArray<>(5);

        pila.añadir("A");
        pila.añadir("B");
        pila.añadir("C");

        System.out.println(pila);

        System.out.println("Primero: " + pila.primero());
        System.out.println("Extraído: " + pila.extraer());
        System.out.println(pila);
        System.out.println("Está vacía: " + pila.estaVacia());
    }
}
