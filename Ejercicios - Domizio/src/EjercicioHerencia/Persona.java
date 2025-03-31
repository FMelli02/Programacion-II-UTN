package EjercicioHerencia;

public abstract class Persona {
    public String nombre;
    public final int dni;
    //Si lleva final y no le pasamos un valor siempe se declara la variable en el constructor
    //hasta el vacío.


    public Persona(int dni) {
        this.dni = dni;
    }

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void mostrarAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
    }

    public abstract void hacerEjercicio();

}
