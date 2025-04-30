package TPDependencias.Ejercicio6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Paramétrico
        ArrayList<Televisor> tv = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();

        Televisor t1 = new Televisor("Samsung");
        Televisor t2 = new Televisor("LG");

        tv.add(t1);
        tv.add(t2);
        num.add(1);
        num.add(2);
    }
}
