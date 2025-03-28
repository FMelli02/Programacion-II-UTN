package Ejercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        GastoPublico gp = new GastoPublico();

        gp.setGastos(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el total de gastos:")));

        Impuesto impuesto = new Impuesto();

        impuesto.setMontoImpuesto(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el total de impuestos:")));

        Ciudad c = new Ciudad("Mendoza", 1000000, gp, impuesto);

        c.mostrarCiudad();

        System.out.print("La ciudad tiene más de 100000 habitantes? ");
        if (c.mayorCienMilHabitantes()) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }

        System.out.print("La ciudad tiene deficit? ");
        if (c.tieneDeficit()) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}
