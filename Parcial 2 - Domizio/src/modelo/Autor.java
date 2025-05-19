package modelo;

import java.util.ArrayList;

public class Autor extends Persona{
    public String pseudonimo;
    private ArrayList<Libro> librosescritos;

    public Autor() {
    }

    public Autor(int dni, String nombre, String pseudonimo) {
        super(dni, nombre);
        this.pseudonimo = pseudonimo;
        this.librosescritos = librosescritos;
    }

    public ArrayList<Libro> getLibrosescritos() {
        return librosescritos;
    }

    public void setLibrosescritos(ArrayList<Libro> librosescritos) {
        this.librosescritos = librosescritos;
    }

    @Override
    public String toString() {
        return "Autor: " + nombre + " (DNI: " + dni + ", Pseudónimo: " + pseudonimo + ")";
    }

}
