package EjercicioRepaso;

public class Driver {
    public MotorPrincipal unidad;

    public Driver() {
        this.unidad = new MotorPrincipal(1000);
    }
    public Driver(MotorPrincipal unidad) {
        this.unidad = unidad;
    }
}
