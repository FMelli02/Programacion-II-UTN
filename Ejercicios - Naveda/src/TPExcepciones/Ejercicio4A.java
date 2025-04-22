package TPExcepciones;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4A {
    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader("archivo.txt");
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }
}
