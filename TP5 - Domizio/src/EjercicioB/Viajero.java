package EjercicioB;

import java.util.ArrayList;

public class Viajero {
    private String nombre;
    private char sexo;
    public ArrayList<Equipaje> guarda;

    public Viajero() {

    }

    public Viajero(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.guarda = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
