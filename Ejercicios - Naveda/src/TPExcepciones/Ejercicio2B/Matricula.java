package TPExcepciones.Ejercicio2B;

public class Matricula {
    private int numero;
    private String fechaVencimiento;

    public Matricula(int numero, String fechaVencimiento) throws MatriculaVencidaException {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;

        // Validar si la matrícula está vencida (ejemplo simplificado)
        if (fechaVencimiento.equals("2022-12-31")) {
            throw new MatriculaVencidaException("La matrícula está vencida");
        }
    }

    // Getters
    public int getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
}
