package Ejercicio3;

import java.util.ArrayList;

public class Impuesto {
    public ArrayList<Impuesto> impuestos;
    public float montoImpuesto;
    private float total;
    public Impuesto(float montoImpuesto) {
        this.montoImpuesto = montoImpuesto;
        this.impuestos = new ArrayList<Impuesto>();
    }

    public float getTotal() {
        return total;
    }

    public void agregarImpuesto(Impuesto imp) {
        impuestos.add(imp);
    }

    public float totalImpuestos() {
        for (Impuesto imp : impuestos) {
            total = total + imp.totalImpuestos();
        }
        return total;
    }

}
