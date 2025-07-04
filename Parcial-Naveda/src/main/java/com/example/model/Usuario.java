package com.example.model;

public class Usuario {
    private int id;
    private String nombre;
    private String email;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return id + ": " + nombre + " (" + email + ")";
    }
}
