package Ejercicio2;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Pais> limitaCon;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.limitaCon = new ArrayList<Pais>();
        this.provincias = new ArrayList<Provincia>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pais> getLimitaCon() {
        return limitaCon;
    }

    public void setLimitaCon(ArrayList<Pais> limitaCon) {
        this.limitaCon = limitaCon;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public void agregarFrontera(Pais pais) {
        this.limitaCon.add(pais);
        pais.limitaCon.add(this);
    }
    
    public void agregarProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }
}
