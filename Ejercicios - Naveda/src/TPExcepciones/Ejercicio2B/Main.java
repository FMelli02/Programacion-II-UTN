package TPExcepciones.Ejercicio2B;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear matrícula (puede lanzar MatriculaVencidaException)
            Matricula matriculaAuto = new Matricula(1234, "2023-12-31");
            Matricula matriculaCamion = new Matricula(5678, "2023-12-31"); // Esta lanzará excepción

            // Crear vehículos
            Auto auto = new Auto(matriculaAuto);
            Camion camion = new Camion(matriculaCamion);

            // Crear choferes
            Chofer chofer1 = new Chofer("Juan", auto);
            Chofer chofer2 = new Chofer("Pedro", camion);

            // Probar aceleración
            auto.acelera(100);
            System.out.println("Auto velocidad: " + auto.getVelocidad());

            auto.acelera(30); // Esto lanzará MiException
        } catch (MatriculaVencidaException e) {
            System.out.println("Error al crear matrícula: " + e.getMessage());
        } catch (MiException e) {
            System.out.println("Error de velocidad: " + e.getMessage() + " en vehículo: " + e.getNombreVehiculo());
        }
    }
}
