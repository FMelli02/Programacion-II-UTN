package controlador;

import modelo.Autor;
import modelo.Persona;

public class PersonaControlador {

    public static void guardarPersona(int dni, String nombre, boolean esAutor, String seudonimo) {
        if (esAutor) {
            Autor autor = new Autor(dni, nombre, seudonimo);
            BDControlador.guardarPersona(autor);
        } else {
            Persona persona = new Persona(dni, nombre);
            BDControlador.guardarPersona(persona);
        }
    }
}

