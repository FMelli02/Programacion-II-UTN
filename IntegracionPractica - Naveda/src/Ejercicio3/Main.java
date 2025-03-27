package Ejercicio3;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        float gasto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el total de gastos"));
        GastoPublico g = new GastoPublico(gasto);

        ArrayList<Impuesto> impuestos = new ArrayList<Impuesto>();

        for (int i = 0; i < 5; i++) {
            float imp = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del impuesto " + (i+1)));
            impuestos.add(new Impuesto(imp));
        }
        Ciudad c = new Ciudad("Mendoza", 100000, 10000);
        System.out.println("La ciudad tiene deficit? " + c.tieneDeficit());
    }
}
