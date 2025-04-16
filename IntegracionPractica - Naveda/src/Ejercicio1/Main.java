package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Figura();

        Circulo c1 = new Circulo("Circulo 1");
        figura1.agregarElipse(c1);
        figura1.mostrarElipses();

        Rectangulo r1 = new Rectangulo("Rectangulo 1", null);
        figura1.agregarPoligono(r1);

        Triangulo t1 = new Triangulo("Triangulo 1", null);
        figura1.agregarPoligono(t1);

        Cuadrado cua1 = new Cuadrado("Cuadrado 1", null);
        figura1.agregarPoligono(cua1);

        figura1.mostrarPoligonos();
    }
}
