package EjercicioAsociacion;

public class Main2 {
    public static void main(String[] args) {
        /// Composición
        Cuerpo c1 = new Cuerpo(12, new Corazon(1000));
        Corazon cor1 = new Corazon(2000);
        Cuerpo c2 = new Cuerpo(3000, cor1);
        System.out.println("Desde c1 se muestran los latidos del nuevo corazon");
        System.out.println(c1.tiene.latidos);
        System.out.println("Desde c2 se muestran los latidos de cor1");
        System.out.println(c2.tiene.latidos);
    }
}
