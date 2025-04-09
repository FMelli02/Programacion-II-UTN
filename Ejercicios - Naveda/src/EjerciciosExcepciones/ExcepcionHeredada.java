package EjerciciosExcepciones;

import java.util.Scanner;

public class ExcepcionHeredada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, div;
        try {
            System.out.print("Ingrese el primer numero: ");
            num1 = sc.nextDouble();
            System.out.print("Ingrese el segundo numero: ");
            num2 = sc.nextDouble();
            if (num2 == 0) {
                throw new ExcepcionCreada();
            }
            div = num1 / num2;
            System.out.println("El resultado es: " + div);
        } catch (ExcepcionCreada ignored){}
    }
}
