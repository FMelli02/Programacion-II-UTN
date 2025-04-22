package TPExcepciones;

public class Ejercicio5A {
    public static void lanzarExcepcion(int tipo) throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException{
        switch (tipo) {
            case 1:
                throw new ArithmeticException("Error: División por cero.");
            case 2:
                throw new NullPointerException("Error: El valor no puede ser nulo.");
            case 3:
                throw new ArrayIndexOutOfBoundsException("Error: Índice fuera de rango.");
            default:
                System.out.println("No se lanzó ninguna excepción.");
        }
    }

    public static void capturarExcepcion(int tipo) {
        try {
            lanzarExcepcion(tipo);
        } catch (ArithmeticException e) {
            System.out.println("Capturada ArithmeticException: " + e.getMessage());
            try {
                int[] array = new int[2];
                System.out.println(array[5]);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Capturada ArrayIndexOutOfBoundsException dentro del catch anidado: " + e2.getMessage());
                try {
                    String texto = null;
                    System.out.println(texto.length());
                } catch (NullPointerException e3) {
                    System.out.println("Capturada NullPointerException dentro del segundo catch anidado: " + e3.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        capturarExcepcion(1);
        System.out.println("----------------");
        capturarExcepcion(2);
        System.out.println("----------------");
        capturarExcepcion(3);
    }
}
