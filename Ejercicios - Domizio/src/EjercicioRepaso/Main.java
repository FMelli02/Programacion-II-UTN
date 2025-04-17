package EjercicioRepaso;

public class Main {
    public static void main(String[] args) {
        MotorPrincipal m1 = new MotorPrincipal(3500);
        Driver d1 = new Driver(m1);
        ColisionCensor c1 = new ColisionCensor("CC1");
        PathAgent pa1 = new PathAgent(d1);
        c1.setReceptor(pa1);
        pa1.setCensor(c1, 0);
        //Punto a
        System.out.println("Censor desde PathAgent --> " + pa1.getCensor()[0].colision);
        //Punto b
        System.out.println("\nMétodo acelerar desde PathAgent --> " + pa1.control.unidad.acelerar(150));
        //Punto c
        System.out.println();
        c1.getReceptor().mostrarAtributos();
        //Punto d
        System.out.println("\nRMP desde ColisionCensor --> " + c1.getReceptor().control.unidad.RMP);
        //Punto e
        System.out.println("\nMétodo funciona desde PathAgent --> " + pa1.control.unidad.funciona());
        //Punto f
        System.out.println("\nMostramos el valor de la constante de interface desde las clases posibles:");
        System.out.println("Desde Motor: " + Motor.min_revol);
        System.out.println("Desde MotorPrincipal: " + MotorPrincipal.min_revol);
        System.out.println("Desde Auxiliar: " + Auxiliar.min_revol);
    }
}
