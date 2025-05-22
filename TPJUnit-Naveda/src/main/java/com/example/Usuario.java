package com.example;

public class Usuario {
    private String nombre;
    private int edad;

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativo");
        }
        this.edad = edad;
    }
}
