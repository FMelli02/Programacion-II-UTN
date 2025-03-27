package Ejercicio3;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre, ArrayList<Provincia> provincias) {
        this.nombre = nombre;
        this.provincias = provincias;
    }
}
