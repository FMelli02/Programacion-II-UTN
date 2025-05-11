import java.util.ArrayList;

public class Autor extends Persona implements InterfaceLibro{
    public String pseudonimo;
    private ArrayList<Libro> librosescritos;

    public Autor() {
    }

    public Autor(int dni, String nombre, String pseudonimo, ArrayList<Libro> librosescritos) {
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
    public int cantidad_paginas(Libro libro) {
        return 0;
    }

    @Override
    public String idioma_primario() {
        return "";
    }

    @Override
    public String[] traducciones() {
        return new String[0];
    }
}
