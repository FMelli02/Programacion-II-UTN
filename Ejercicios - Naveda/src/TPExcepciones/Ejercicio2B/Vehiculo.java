package TPExcepciones.Ejercicio2B;

public abstract class Vehiculo {
    protected Matricula matricula;
    protected int velocidad;

    public Vehiculo(Matricula matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public abstract void acelera(int incremento) throws MiException;

    // Getters
    public int getVelocidad() { return velocidad; }
}
