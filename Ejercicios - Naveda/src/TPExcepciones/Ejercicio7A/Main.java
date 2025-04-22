package TPExcepciones.Ejercicio7A;

public class Main {
    public static void main(String[] args) {
        try {
            metodoQueLanzaExcepcion(1);
        } catch (MiExcepcion e) {
            System.out.println("Capturada excepción: " + e.getMessage());
        }

        try {
            metodoQueLanzaExcepcion(2);
        } catch (ExcepcionNivel1 e) {
            System.out.println("Capturada ExcepcionNivel1: " + e.getMessage());
        } catch (MiExcepcion e) {
            System.out.println("Capturada ExcepcionNivel2: " + e.getMessage());
        }
    }

    public static void metodoQueLanzaExcepcion(int tipo) throws MiExcepcion {
        if (tipo == 1) {
            throw new ExcepcionNivel1("Error nivel 1 ocurrido");
        } else {
            throw new ExcepcionNivel2("Error nivel 2 detectado");

        }
    }
}
