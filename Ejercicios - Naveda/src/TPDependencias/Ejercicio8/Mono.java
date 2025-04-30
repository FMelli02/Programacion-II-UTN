package TPDependencias.Ejercicio8;

public class Mono extends Animal {
    private boolean tieneCola;

    public Mono(String sexo, int edad, boolean tieneCola) {
        super(sexo, edad);
        this.tieneCola = tieneCola;
    }

    public boolean isTieneCola() {
        return tieneCola;
    }

    public void setTieneCola(boolean tieneCola) {
        this.tieneCola = tieneCola;
    }

    public void esConCola() {
        if (tieneCola) {
            System.out.println("El primate tiene cola");
        } else {
            System.out.println("El primate no tiene cola");
        }
    }

    public void treparArbol() {
        System.out.println("Trepando arbol...");
    }
}
