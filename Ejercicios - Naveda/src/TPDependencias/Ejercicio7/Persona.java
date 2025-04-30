package TPDependencias.Ejercicio7;

public class Persona {
    public void mostrarDatos() {
        System.out.println("Persona sin atributos.");
    }

    public void mostrarDatos(String nombre) {
        System.out.println("\nPersona con nombre.");
        System.out.println("Nombre: " + nombre);
    }

    public void mostrarDatos(String nombre, String apellido, int edad) {
        System.out.println("\nPersona con nombre, apellido y edad.");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
}
