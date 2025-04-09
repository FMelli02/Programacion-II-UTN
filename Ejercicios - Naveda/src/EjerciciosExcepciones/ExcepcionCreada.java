package EjerciciosExcepciones;

public class ExcepcionCreada extends RuntimeException {
  public ExcepcionCreada() {
    System.out.println("El número no puede ser 0");
  }
}
