package Ejercicio1;

import java.util.ArrayList;

public class Lado {
    private String nombre;
    private ArrayList<Punto> puntos;

    public Lado(String nombre, ArrayList<Punto> puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
