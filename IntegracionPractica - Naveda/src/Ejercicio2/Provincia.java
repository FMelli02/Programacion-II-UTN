package Ejercicio2;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private Pais pais;
    private ArrayList<Provincia> limitaCon;
    private ArrayList<Ciudad> ciudades;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

