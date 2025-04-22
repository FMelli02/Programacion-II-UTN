package TPExcepciones.Ejercicio2B;

public class Camion extends Vehiculo {
    public Camion(Matricula matricula) {
        super(matricula);
    }

    @Override
    public void acelera(int incremento) throws MiException {
        int nuevaVelocidad = velocidad + incremento;
        if (nuevaVelocidad > 120) {
            throw new MiException("Velocidad máxima excedida", "Camion");
        }
        velocidad = nuevaVelocidad;
    }
}
