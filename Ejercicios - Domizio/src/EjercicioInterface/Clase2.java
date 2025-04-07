package EjercicioInterface;

public class Clase2 extends Clase1{

    public Clase2() {
        super();
    }

    public Clase2(int s, String h) {
        super(s, h);
    }

    public Clase2(int s, String h, int edad) {
        super(s, h, edad);
    }

    public void mostrarDatos() {
        System.out.println("Mostrar datos de clase2");
        System.out.println("Edad -> " + this.getEdad());
    }

    public void mDatosSuper() {
        System.out.println("Desde Clase2 se ejecuta el método de Clase1");
        super.mostrarDatos();
    }

    public void cocina(int platos) {
        System.out.println(platos + " cocinados (Clase2)");
    }

    public void cocinaSuperInt(int a) {
        System.out.println("Ejecuto con super.");
        super.cocina(a);
    }

    public void cocina() {
        System.out.println("Cocina sin parámetros");
    }

    public void cocinaSuperSP() {
        System.out.println("Ejecuto de la superclase sin parámetros");
        System.out.println("NO es posible usar super.cocina() por que cocina es abstract");
    }
}
