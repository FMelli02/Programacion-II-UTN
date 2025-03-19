import javax.swing.*;

public class Ejecutable {
    public static void main(String[] args) {
        Rectangulo[] rectangulos = new Rectangulo[5];

        for (int i = 0; i < 2; i++) {
            float base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del rectángulo " + (i + 1) + ": "));
            float altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del rectángulo " + (i + 1) + ": "));
            String color = JOptionPane.showInputDialog("Ingrese el color del rectángulo " + (i + 1) + ": ");

            rectangulos[i] = new Rectangulo(base, altura, color);
        }

        System.out.println("Datos de los rectángulos:");
        for (int i = 0; i < 2; i++) {
            rectangulos[i].mostrarTodos();
        }
    }
}
