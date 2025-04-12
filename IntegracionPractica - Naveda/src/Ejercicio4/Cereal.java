package Ejercicio4;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private String tipo;
    private ArrayList<String> mineralesRequeridos;

    public static final String GRUESA = "GRUESA";
    public static final String FINA  = "FINA";
    public static final String PASTURA = "PASTURA";

    public Cereal(String nombre, String tipo, ArrayList<String> mineralesRequeridos) {
        this.nombre = nombre;
        this.tipo = tipo.toUpperCase();
        this.mineralesRequeridos = mineralesRequeridos;
    }

    public boolean esPastura() {
        return tipo.equals(PASTURA);
    }

    public ArrayList<String> getMineralesRequeridos() {
        return mineralesRequeridos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}
