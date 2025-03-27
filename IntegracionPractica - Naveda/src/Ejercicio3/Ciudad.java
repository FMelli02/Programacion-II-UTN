package Ejercicio3;

public class Ciudad {
    private String nombre;
    private int poblacion;
    private float gasto;
    private Impuesto impuesto;

    public Ciudad(String nombre, int poblacion, float gasto) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.gasto = gasto;
    }

    public boolean mayorCienMilHabitantes() {
        return this.poblacion > 100000;
    }

    public boolean tieneDeficit() {
        return gasto > impuesto.getTotal();
    }

    public Impuesto getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Impuesto impuesto) {
        this.impuesto = impuesto;
    }
}
