package EjercicioContrato;

public class Empleador {
    public String nombre;
    public Seguro contrata;

    public Empleador() {
    }

    public Empleador(String nombre, Seguro contrata) {
        this.nombre = nombre;
        this.contrata = contrata;
    }
}
