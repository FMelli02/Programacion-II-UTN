package EjercicioC;

public class Main {
    public static void main(String[] args) {
        Chofer c1 = new Chofer("José");
        Taxi t1 = new Taxi("AF 326 DD");
        Taxi t2 = new Taxi("AD 759 CE");
        Taxi t3 = new Taxi("AD 255 XU");

        c1.conduce.add(t1);
        c1.conduce.add(t2);
        c1.conduce.add(t3);

        System.out.println("Desde Chofer visualizamos las matriculas de los Taxis:");
        for (Taxi t: c1.conduce) {
            System.out.println(t.getMatricula());
        }

        //Invocamos el atributo matricula desde Chofer
        //System.out.println(c1.conduce.get(1).getMatricula());
    }
}
