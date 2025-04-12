package Ejercicio5;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList<Restaurante> frecuentes;
    private ArrayList<PlatoServido> gustos;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.frecuentes = new ArrayList<>();
        this.gustos = new ArrayList<>();
    }

    public void frecuenta(Restaurante r) {
        if (!frecuentes.contains(r)) {
            frecuentes.add(r);
        }
    }

    public void leGusta(PlatoServido p) {
        if (!gustos.contains(p)) {
            gustos.add(p);
        }
    }

    public ArrayList<PlatoServido> getGustos() {
        return gustos;
    }

    public String getNombre() {
        return nombre;
    }
}
