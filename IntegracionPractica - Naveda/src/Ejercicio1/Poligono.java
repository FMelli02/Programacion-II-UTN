package Ejercicio1;

import java.util.ArrayList;

public abstract class Poligono {
    private String nombre;
    /// Como es una relación de composición(Diamante lleno/pintado) se define como un atributo
    private ArrayList<Lado> lados;

    public Poligono(String nombre, ArrayList<Lado> lados) {
        this.nombre = nombre;
        this.lados = lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
