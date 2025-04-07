package EjercicioInterface;

public class Main {
    public static void main(String[] args) {
        /*Clase1 c1 = new Clase1(5, "abc");
        System.out.println(c1.calcularAnio(7));
        c1.mostrarDatos();
        System.out.println("atributo s: " + c1.s);
        System.out.println("a desde objeto: " + c1.a); //Se puede llamar el atributo de la interface desde el objeto, pero gasta mas recursos
        System.out.println("letra desde clase: " + Clase1.letra);//Atributo llamado desde la clase
        System.out.println("m desde interface: " + Interface1.m);//Atributo llamado desde la interface*/

        //Clase1 c1 = new Clase1(5, "abc", 25);
        Clase2 c2 = new Clase2(55, "xyz", 72);
        //Sobre-escritura de métodos
        /*c1.mostrarDatos();
        System.out.println(" ");
        c2.mostrarDatos();
        System.out.println(" ");
        c2.mDatosSuper();*/
        //c1.cocina(5);
        /*c2.cocina(10);
        c2.cocinaSuperInt(2);
        c2.cocina();*/

        System.out.println("Atributos interface1");
        System.out.println("a: " + Interface1.a);
        System.out.println("a desde clase1: " + Clase1.a);
        System.out.println("a desde Clase2: " + Clase2.a);
        System.out.println("a desde objeto c2: " + c2.a);
    }
}
