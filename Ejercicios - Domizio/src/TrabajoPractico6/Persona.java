package TrabajoPractico6;

public abstract class Persona {
    protected String nombre;
    public Integer legajo;

    public Persona() {
    }

    public Persona(String nombre, Integer legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public abstract void mostrarAtributos();
}
