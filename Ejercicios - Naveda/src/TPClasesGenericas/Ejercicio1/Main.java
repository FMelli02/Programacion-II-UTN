package TPClasesGenericas.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        NumeroEntero n1 = new NumeroEntero(10);
        NumeroEntero n2 = new NumeroEntero(2);

        System.out.println("Suma: " + n1.suma(n2));
        System.out.println("Resta: " + n1.resta(n2));
        System.out.println("Multiplicacion: " + n1.multiplicacion(n2));
        System.out.println("Division: " + n1.division(n2));
    }
}
