package TPDependencias.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        //Ejemplo Coherción
        int a;
        int b;
        double multi;

        a = 6;
        b = 4;

        Multiplicacion m = new Multiplicacion();

        System.out.println("El resultado de a como int es: " + a);

        System.out.println("El resultado es: " + m.multiplicacion(a, b));

        multi = (double) a;

        System.out.println("El resultado de a como double es: " + multi);
    }
}
