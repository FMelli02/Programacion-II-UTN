package EjercicioInterface;

public abstract class Clase1 implements Interface1 {
    public int s;
    private String h;
    private int Edad;

    public Clase1() {
    }
    public Clase1(int s, String h) {
        this.s = s;
        this.h = h;
    }

    public Clase1(int s, String h, int edad) {
        this.s = s;
        this.h = h;
        Edad = edad;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Implementando MostrarDatos en Clase1");
        System.out.println("Edad en Clase1 -> " + this.getEdad());
    }

    @Override
    public int calcularAnio(int b) {
        return 100;
    }

    public void cocina(int platos) {
        System.out.println("Se cocinaron " + platos + " platos (Clase1)");
    }

    public abstract void cocina();
}
