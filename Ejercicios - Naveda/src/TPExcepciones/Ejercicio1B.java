package TPExcepciones;

public class Ejercicio1B {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
