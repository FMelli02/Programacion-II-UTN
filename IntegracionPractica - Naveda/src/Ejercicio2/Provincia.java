package Ejercicio2;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private Pais pais;
    private ArrayList<Provincia> limitaCon;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.limitaCon = new ArrayList<Provincia>();
        this.ciudades = new ArrayList<Ciudad>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public ArrayList<Provincia> getLimitaCon() {
        return limitaCon;
    }

    public void setLimitaCon(ArrayList<Provincia> limitaCon) {
        this.limitaCon = limitaCon;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}

