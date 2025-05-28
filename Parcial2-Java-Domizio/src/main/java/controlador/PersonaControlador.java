package controlador;

import modelo.Autor;
import modelo.Persona;

public class PersonaControlador { //Clase que centraliza la logica para decidir si guardar una Persona o un Autor

    public static void guardarPersona(int dni, String nombre, boolean esAutor, String pseudonimo) {
        if (esAutor) { //Si esAutor = true -> Crea un objeto Autor
            Autor autor = new Autor(dni, nombre, pseudonimo);
            BDControlador.guardarPersona(autor); //Delega el guardado en BDControlador
        } else { //Si esAutor = false -> Crea un objeto Persona
            Persona persona = new Persona(dni, nombre);
            BDControlador.guardarPersona(persona); //Delega el guardado en BDControlador
        }
    }
}

