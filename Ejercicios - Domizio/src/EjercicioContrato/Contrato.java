package EjercicioContrato;

public class Contrato {
    public int numero;
    public Empleador jefe;
    public Trabajador empleado;

    public Contrato() {

    }

    public Contrato(int numero, Empleador jefe, Trabajador empleado) {
        this.numero = numero;
        this.jefe = jefe;
        this.empleado = empleado;
    }
}
