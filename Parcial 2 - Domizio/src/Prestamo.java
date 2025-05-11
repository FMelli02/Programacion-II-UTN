import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
    public int numero;
    public Date dia_prestamo;
    public Date devolucion;
    public Persona socio;
    public ArrayList<Libro> prestado;

    public Prestamo() {
    }

    public Prestamo(int numero, Date dia_prestamo, Date devolucion) {
        this.numero = numero;
        this.dia_prestamo = dia_prestamo;
        this.devolucion = devolucion;
    }

    public Prestamo(int numero, Date dia_prestamo, Date devolucion, Persona socio, ArrayList<Libro> prestado) {
        this.numero = numero;
        this.dia_prestamo = dia_prestamo;
        this.devolucion = devolucion;
        this.socio = socio;
        this.prestado = prestado;
    }
}
