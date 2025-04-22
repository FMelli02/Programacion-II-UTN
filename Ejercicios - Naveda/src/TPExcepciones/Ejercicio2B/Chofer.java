package TPExcepciones.Ejercicio2B;

public class Chofer {
    private String nombre;
    private Vehiculo vehiculo;

    public Chofer(String nombre, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    // Getters
    public String getNombre() { return nombre; }
    public Vehiculo getVehiculo() { return vehiculo; }
}
