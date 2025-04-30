package TPDependencias.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        //Ejercicio Dependencia
        Nafta nafta = new Nafta(45.5);
        Auto auto = new Auto("Mercedes Benz");

        auto.encender();
        auto.llenarTanque(nafta);
    }
}
