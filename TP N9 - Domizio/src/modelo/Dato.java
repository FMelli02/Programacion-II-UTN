package modelo;

import java.io.Serializable;

public class Dato implements Serializable {
    private String textoLibre;
    private String opcion;

    public Dato(String textoLibre, String opcion) {
        this.textoLibre = textoLibre;
        this.opcion = opcion;
    }

    @Override
    public String toString() {
        return "Texto: " + textoLibre + ", Opción: " + opcion;
    }
}
