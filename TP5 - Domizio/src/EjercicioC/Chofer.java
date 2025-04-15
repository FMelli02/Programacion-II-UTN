package EjercicioC;

import java.util.ArrayList;

public class Chofer {
    private String nombre;
    public ArrayList<Taxi> conduce;

    public Chofer() {
    }

    public Chofer(String nombre) {
        this.nombre = nombre;
        this.conduce = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int vencimientoLic(int FechaActual) {
        return FechaActual;
    }
}
