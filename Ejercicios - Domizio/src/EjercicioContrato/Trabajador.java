package EjercicioContrato;

public class Trabajador {
    public String nombre;
    private Herramienta[] usa;

    public Trabajador() {
    }

    public Trabajador(String nombre, Herramienta[] usa) {
        this.nombre = nombre;
        this.usa = usa;
    }

    public Herramienta[] getUsa() {
        return usa;
    }

    public void setUsa(Herramienta[] usa) {
        this.usa = usa;
    }
}
