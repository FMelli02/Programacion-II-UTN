package TrabajoPractico6;

import java.util.HashMap;

public class Estudiante extends Persona {
    public HashMap<String, Inscripcion> formulario;

    public Estudiante() {
    }

    public Estudiante(String nombre, Integer legajo) {
        super(nombre, legajo);
        formulario = new HashMap<>();
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Inscripcion: " + formulario);
    }
}
