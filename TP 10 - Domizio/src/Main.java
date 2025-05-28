import controlador.ControladorCronometro;
import modelo.Cronometro;
import vista.VentanaCronometro;

public class Main {
    public static void main(String[] args) {
        VentanaCronometro vista = new VentanaCronometro();
        Cronometro modelo = new Cronometro();
        new ControladorCronometro(modelo, vista);
    }
}
