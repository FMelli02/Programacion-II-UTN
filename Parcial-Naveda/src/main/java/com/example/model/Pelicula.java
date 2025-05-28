package com.example.model;

public class Pelicula {
    private int id;
    private String titulo;
    private String genero;
    private int duracion; //En minutos
    private int anio;

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, String genero, int duracion, int anio) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.anio = anio;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return id + ": " + titulo + " (" + genero + ", " + anio + ", " + duracion + " minutos)";
    }
}
