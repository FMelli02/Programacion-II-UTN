package EjercicioRepaso;

public class Main {
    public static void main(String[] args) {
        //Punto a
        PathAgent pa1 = new PathAgent(new Driver(new MotorPrincipal(3500)));
        ColisionCensor c1 = new ColisionCensor(pa1);
        ColisionCensor c2 = new ColisionCensor(pa1);
        ColisionCensor c3 = new ColisionCensor(pa1);

        pa1.setCensor(new ColisionCensor[]{c1, c2, c3});
        System.out.println(pa1.getCensor().length);
    }
}
