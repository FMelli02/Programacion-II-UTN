package TPDependencias.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        //Sobrecarga
        Persona p1 = new Persona();

        p1.mostrarDatos();
        p1.mostrarDatos("Franco");
        p1.mostrarDatos("Franco", "Mellimaci", 22);
    }
}
