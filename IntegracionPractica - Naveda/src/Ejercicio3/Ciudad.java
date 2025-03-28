package Ejercicio3;

public class Ciudad {
    private String nombre;
    private int poblacion;
    private GastoPublico gasto;
    private Impuesto impuesto;

    public Ciudad(String nombre, int poblacion, GastoPublico gasto, Impuesto impuesto) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.gasto = gasto;
        this.impuesto = impuesto;
    }

    public boolean mayorCienMilHabitantes() {
        return this.poblacion > 100000;
    }

    public boolean tieneDeficit() {
        return gasto.getGastos() > impuesto.getMontoImpuesto();
    }

    public void mostrarCiudad() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Poblacion: " + this.poblacion);
        System.out.println("Gasto: " + this.gasto.getGastos());
        System.out.println("Impuesto: " + this.impuesto.getMontoImpuesto());
    }
}
