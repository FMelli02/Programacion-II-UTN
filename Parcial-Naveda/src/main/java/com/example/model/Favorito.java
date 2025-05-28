package com.example.model;

import java.time.LocalDate;

public class Favorito {
    private int idUsuario;
    private int idPelicula;
    private LocalDate fechaAgregado;

    public Favorito() {
    }

    public Favorito(int idUsuario, int idPelicula, LocalDate fechaAgregado) {
        this.idUsuario = idUsuario;
        this.idPelicula = idPelicula;
        this.fechaAgregado = fechaAgregado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public LocalDate getFechaAgregado() {
        return fechaAgregado;
    }

    @Override
    public String toString() {
        return "Usuario ID: " + idUsuario +
                ", Película ID: " + idPelicula +
                ", Fecha Agregado: " + fechaAgregado;
    }
}
