package modelo;

public class Autor extends Persona {
    private String pseudonimo;

    public Autor(int dni, String nombre, String pseudonimo) {
        super(dni, nombre);
        this.pseudonimo = pseudonimo;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    @Override
    public String toString() {
        return "Autor: " + nombre + " (DNI: " + dni + ", Pseudónimo: " + pseudonimo + ")";
    }
}

