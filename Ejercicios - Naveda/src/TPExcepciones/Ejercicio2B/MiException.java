package TPExcepciones.Ejercicio2B;

public class MiException extends Exception {
    private String nombreVehiculo;

    public MiException(String mensaje, String nombreVehiculo) {
        super(mensaje);
        this.nombreVehiculo = nombreVehiculo;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }
}
