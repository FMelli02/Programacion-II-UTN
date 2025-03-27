package Ejercicio2;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Pais> limitaCon;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.limitaCon = limitaCon;
        this.provincias = provincias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarFrontera(Pais pais) {
        this.limitaCon.add(pais);
        pais.limitaCon.add(this);
    }
    
    public void agregarProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }
}
