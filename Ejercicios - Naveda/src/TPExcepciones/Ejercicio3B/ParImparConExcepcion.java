package TPExcepciones.Ejercicio3B;

import java.util.Random;

public class ParImparConExcepcion {
    public static void main(String[] args) {
        try {
            verificarParidad();
        } catch (EsParException | EsImparException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void verificarParidad() throws EsParException, EsImparException {
        Random rand = new Random();
        int numero = rand.nextInt(34);

        if (numero % 2 == 0) {
            throw new EsParException("El número " + numero + " es PAR");
        } else {
            throw new EsImparException("El número " + numero + " es IMPAR");
        }
    }
}
