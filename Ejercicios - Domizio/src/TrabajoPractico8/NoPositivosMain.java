package TrabajoPractico8;

import java.util.Scanner;

public class NoPositivosMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int suma = 0;

        while (cont < 3) {
            try {
                System.out.print("Ingrese un número negativo: ");
                int numero = sc.nextInt();

                if (numero >= 0) {
                    throw new NoPositivosException("Se esperaba un número negativo.");
                }

                suma += numero;
                cont++;
            } catch (NoPositivosException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
            }
        }

        System.out.println("La suma es: " + suma);
    }
}
