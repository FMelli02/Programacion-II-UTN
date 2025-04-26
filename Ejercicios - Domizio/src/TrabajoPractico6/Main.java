package TrabajoPractico6;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos Profesor
        Profesor p1 = new Profesor("Juan Perez", 354772);

        //Creamos Asignaturas
        Asignatura matematica = new Asignatura(101, p1);
        Asignatura fisica = new Asignatura(102, p1);
        p1.curso.add(matematica);
        p1.curso.add(fisica);

        //Creamos Estudiantes
        Estudiante e1 = new Estudiante("Franco Mellimaci", 54623);
        Estudiante e2 = new Estudiante("Mateo Lopez", 45253);

        //Creamos Inscripciones
        Inscripcion i1 = new Inscripcion(new Date(), e1, matematica);
        Inscripcion i2 = new Inscripcion(new Date(), e1, fisica);
        Inscripcion i3 = new Inscripcion(new Date(), e2, matematica);

        //Agregamos Inscripciones a estudiantes
        e1.formulario.put("Matematica", i1);
        e1.formulario.put("Fisica", i2);
        e2.formulario.put("Matematica", i3);

        //D) Desde un objeto Profesor
        System.out.println("D.1) Todas las asignaturas que imparte el profesor:");
        p1.mostrarAtributos();

        //Selección de asignatura para ver cantidad de inscriptos
        System.out.println("\nD.2) Elija codigo de asignatura para ver cantidad de inscriptos:");
        for (Asignatura asignatura : p1.curso) {
            System.out.println("Codigo: " + asignatura.getCodigo());
        }

        int codigoElegido = Integer.parseInt(JOptionPane.showInputDialog("Elija codigo de asignatura:"));
        int contador = 0;

        for (Estudiante e : Arrays.asList(e1, e2)) {
            for (Inscripcion inscripcion : e.formulario.values()) {
                if (inscripcion.en.getCodigo() == codigoElegido) {
                    contador++;
                }
            }
        }

        System.out.println("Datos del profesor:");
        System.out.println("Nombre: " + p1.nombre);
        System.out.println("Legajo: " + p1.legajo);
        System.out.println("Cantidad de alumnos inscriptos: " + contador);

        //E) Desde un objeto Estudiante
        System.out.println("\nE.1) Asignaturas en las que se inscribió " + e1.nombre);
        for (Inscripcion i : e1.formulario.values()) {
            System.out.println("Asignatura: " + i.en.getCodigo() + " | Profesor: " + i.en.instructor.nombre);
        }

        System.out.println("\nE.2) Fechas de inscripción:");
        for (Inscripcion i : e1.formulario.values()) {
            System.out.println("Fecha: " + i.getFecha() + " | Asignatura: " + i.en.getCodigo());
        }

        //F) Desde cada objeto Inscripción
        System.out.println("\nF.1) Estudiante y asignatura desde inscripcion:");
        for (Inscripcion i : Arrays.asList(i1, i2, i3)) {
            System.out.println("Estudiante: " + i.inscripto.nombre + " | Asignatura: " + i.en.getCodigo());
        }

        System.out.println("\nF.2) Fecha y profesor de cada asignatura:");
        for (Inscripcion i : Arrays.asList(i1, i2, i3)) {
            System.out.println("Fecha: "+ i.getFecha() + " | Profesor: " + i.en.instructor.nombre);
        }

        //F.3 Todas las asignaturas de un alumno pedido por pantalla
        System.out.println("\nF.3) Ingrese nombre del estudiante para ver inscripciones: ");
        String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");

        Estudiante elegido = null;
        for (Estudiante e : Arrays.asList(e1, e2)) {
            if(e.nombre.equalsIgnoreCase(nombreEstudiante)) {
                elegido = e;
                break;
            }
        }

        if(elegido != null) {
            System.out.println("Asignaturas inscriptas de " + nombreEstudiante + ": ");
            for (Inscripcion i : elegido.formulario.values()) {
                System.out.println("Asignatura: " + i.en.getCodigo());
            }
        } else {
            System.out.println("No hay asignaturas en el estudiante.");
        }
    }
}
