package EjerciciosExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*try{
            double num1, num2;
            double promedio;
            System.out.print("Ingrese el primer numero: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = sc.nextInt();
            promedio = (num1+num2)/2;
            System.out.println("El promedio es: " + promedio);
        } catch(InputMismatchException e){
            System.out.println("Solo se pueden ingresar numeros");
        }*/

        try {
            double num1, num2;
            double div;
            System.out.print("Ingrese el primer numero: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = sc.nextInt();
            if(num2 == 0) {
                throw new ArithmeticException();
            }
            div = num1/num2;
            System.out.println("El resultado de la division es: " + div);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir el número por 0");
        }catch (InputMismatchException e){
            System.out.println("Solo se pueden ingresar numeros");
        } finally {
            System.out.println("Gracias por usar el programa. :)");
        }

    }
}
