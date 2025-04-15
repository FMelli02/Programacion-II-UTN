package EjercicioB;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Viajero v1 = new Viajero("Franco", 'M');
        Equipaje e1 = new Equipaje(7, "Mochila");
        Equipaje e2 = new Equipaje(15, "Valija");

        v1.guarda.add(e1);
        v1.guarda.add(e2);
        System.out.println("Desde Viajero visualizamos el peso de los equipajes");
        for (Equipaje e : v1.guarda) {
            System.out.println(e.getPeso());
        }
        //Invocamos el atributo tipo desde viajero
        //System.out.println(v1.guarda.get(0).getTipo());
    }
}
