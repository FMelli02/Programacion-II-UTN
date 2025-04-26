package TrabajoPractico6;

import java.util.Date;

public class Inscripcion {
    private Date fecha = new Date();
    public Estudiante inscripto;
    public Asignatura en;

    public Inscripcion() {
    }

    public Inscripcion(Date fecha, Estudiante inscripto, Asignatura en) {
        this.fecha = fecha;
        this.inscripto = inscripto;
        this.en = en;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void mostrarAtributos() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Estudiante inscripto: " + inscripto.nombre);
        System.out.println("Asignatura: " + en.getCodigo());
    }
}
