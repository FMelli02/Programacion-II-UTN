package modelo;

import java.io.Serializable;

public class Persona implements Serializable {
    protected int dni;
    protected String nombre;

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() { return dni; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Persona: " + nombre + " (DNI: " + dni + ")";
    }
}
