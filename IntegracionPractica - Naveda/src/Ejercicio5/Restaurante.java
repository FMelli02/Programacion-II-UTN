package Ejercicio5;

import java.util.ArrayList;

public class Restaurante {
    private String nombre;
    private ArrayList<PlatoServido> platos;
    private ArrayList<Sucursal> sucursales;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.platos = new ArrayList<>();
        this.sucursales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPlato(PlatoServido plato) {
        if (platos.size() < 20) {
            platos.add(plato);
        } else {
            System.out.println("No se pueden agregar más de 20 platos");
        }
    }

    public void agregarSucursal(Sucursal s) {
        sucursales.add(s);
    }

    public ArrayList<PlatoServido> getPlatos() {
        return platos;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }
}
