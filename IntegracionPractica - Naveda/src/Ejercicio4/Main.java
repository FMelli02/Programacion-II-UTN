package Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mineralesLote1 = new ArrayList<>(Arrays.asList("fosforo", "potasio", "hierro"));
        ArrayList<String> mineralesLote2 = new ArrayList<>(Arrays.asList("azufre", "fosforo"));

        Lote loteEspecial = new Lote(mineralesLote1, true);
        Lote loteComun = new Lote(mineralesLote2, false);

        Cereal maiz = new Cereal("Maiz", Cereal.GRUESA, new ArrayList<>(Arrays.asList("fosforo", "potasio")));
        Cereal trigo = new Cereal("Trigo", Cereal.FINA, new ArrayList<>(Arrays.asList("fosforo")));
        Cereal alfalfa = new Cereal("Alfalfa", Cereal.PASTURA, new ArrayList<>(Arrays.asList("fosforo", "potasio")));
        Cereal trebol = new Cereal("Trébol", Cereal.PASTURA, new ArrayList<>(Arrays.asList("fosforo", "azufre")));

        System.out.println("Intentando sembrar Maíz en lote especial:");
        loteEspecial.sembrar(maiz);

        System.out.println("\nIntentando sembrar Trigo en lote especial:");
        loteEspecial.sembrar(trigo);

        System.out.println("\nIntentando sembrar Alfalfa en lote especial:");
        loteEspecial.sembrar(alfalfa);

        System.out.println("\nIntentando sembrar Trebol en lote común:");
        loteComun.sembrar(trebol);

        System.out.println("\nIntentando sembrar otra pastura de Alfalfa en el mismo lote");
        loteComun.sembrar(alfalfa);
    }
}
