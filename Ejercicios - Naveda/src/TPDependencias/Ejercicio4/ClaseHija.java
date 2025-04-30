package TPDependencias.Ejercicio4;

public class ClaseHija extends ClasePadre{
    public int edad;

    @Override
    public void mostrarAtributos() {
        System.out.println("Mostramos los atributos de la Clase Hija:");
        System.out.println("Edad: " + edad);
    }
}
