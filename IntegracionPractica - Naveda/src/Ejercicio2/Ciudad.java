package Ejercicio2;

import org.w3c.dom.ls.LSOutput;

public class Ciudad{

    private String nombre;
    private Provincia provincia;
    private boolean esCapital;

    public Ciudad(String nombre, Provincia provincia, boolean esCapital) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.esCapital = esCapital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public boolean isEsCapital() {
        return esCapital;
    }

    public void setEsCapital(boolean esCapital) {
        this.esCapital = esCapital;
    }
}
