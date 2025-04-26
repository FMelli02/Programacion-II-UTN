package TrabajoPractico6;

import java.util.ArrayList;

public class Profesor extends Persona {
    public ArrayList<Asignatura> curso;

    public Profesor() {
    }

    public Profesor(String nombre, Integer legajo) {
        super(nombre, legajo);
        curso = new ArrayList<>();
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Asignaturas que enseña: ");
        for (Asignatura asignatura : curso) {
            System.out.println(asignatura.getCodigo());
        }
    }
}
