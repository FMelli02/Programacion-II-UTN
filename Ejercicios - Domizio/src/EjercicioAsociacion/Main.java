package EjercicioAsociacion;

public class Main {
    public static void main(String[] args) {
        ///Asociación Común
        /*A a1 = new A();
        B b1 = new B("Texto en clase B");
        a1.a = 5;
        a1.rol = b1;

        A a2 = new A(10, b1);

        System.out.println("Objeto a1 asociado con b1");
        System.out.println("Desde A, el atributo de B");
        System.out.println(a1.rol.b);
        System.out.println(".................");
        System.out.println("Objeto a2 asociado con b1");
        System.out.println("Desde A, el atributo de B");
        System.out.println(a2.rol.b);*/
        ///Asociación Bidireccional
        A a1 = new A(5, null);
        A a2 = new A(10, null);
        A a3 = new A(15, null);
        A auxiliar[] = new A[3];
        auxiliar[0] = a1;
        auxiliar[1] = a2;
        auxiliar[2] = a3;
        B b2 = new B("Segundo String de B", auxiliar);
        System.out.println("\nDesde b2 veo la relación con A (tiene)");
        for (int i = 0; i < 3; i++) {
            System.out.println("elemento " + i + "--> " + b2.tiene[i].a);
        }
        a1.setHace(b2);
        System.out.println("\nUtilizo sumar desde b2");
        System.out.println("Se suma el atributo de A + 50");
        System.out.println("Atributo de A = " + b2.tiene[2].a);
        System.out.println("Resultado: " + b2.tiene[2].sumar(50));
    }
}
