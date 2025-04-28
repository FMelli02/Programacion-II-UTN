package EjercicioRepaso;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

public class NuevoMain {
    public static void main(String[] args) {
        MotorPrincipal mp1 = new MotorPrincipal(2000);
        Driver dr1 = new Driver(mp1);
        PathAgent pa1 = new PathAgent(dr1);
        ColisionCensor cc1 = new ColisionCensor("Primer cc");
        ColisionCensor cc2 = new ColisionCensor("Segundo cc");
        ColisionCensor cc3 = new ColisionCensor("Tercer cc");
        ArrayList<Cost> asociativas = new ArrayList<>();
        asociativas.add(mostrarAsociativa(pa1, cc1));
        asociativas.add(mostrarAsociativa(pa1, cc2));
        asociativas.add(mostrarAsociativa(pa1, cc3));
        System.out.println("----------------------------------------------------------");
        Iterator<Cost> it = asociativas.iterator();
        while (it.hasNext()) {
            Cost auxiliar = it.next();
            System.out.println("Asociadas: " + auxiliar.a + " con " + auxiliar.getCensor().colision);
        }
    }

    public static Cost mostrarAsociativa(PathAgent pa, ColisionCensor cc) {
        System.out.println("----------------------------------------------------------");
        Cost cost = new Cost(741f, pa, cc);
        System.out.println("En Cost Asociativa se asocian: ");
        System.out.println("Cost.PathAgent.Driver: " + cost.getReceptor().control);
        System.out.println("Cost.ColisionCensor.String: " + cost.getCensor().colision);
        return cost;
    }
}
