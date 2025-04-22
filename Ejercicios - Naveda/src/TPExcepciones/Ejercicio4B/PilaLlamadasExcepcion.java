package TPExcepciones.Ejercicio4B;

public class PilaLlamadasExcepcion {
    public static void main(String[] args) {
        try {
            metodoUno();
        } catch (MiException e) {
            System.out.println("Excepción manejada en el método main: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void metodoUno() throws MiException {
        System.out.println("Ejecutando método 1");
        metodoDos();
    }

    public static void metodoDos() throws MiException {
        System.out.println("Ejecutando método 2");
        metodoTres();
    }

    public static void metodoTres() throws MiException {
        System.out.println("Ejecutando método 3");
        metodoCuatro();
    }

    public static void metodoCuatro() throws MiException {
        System.out.println("Ejecutando método 4");
        // Lanzamos la excepción en el último método
        throw new MiException("Excepción generada en método 4");
    }
}
