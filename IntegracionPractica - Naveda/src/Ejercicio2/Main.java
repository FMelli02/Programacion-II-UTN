package Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pais pais1 = new Pais("Argentina");
        Provincia prov1 = new Provincia("Mendoza", pais1);
        Ciudad ciudad1 = new Ciudad("Godoy Cruz", prov1, false);

        Provincia prov2 = new Provincia("San Luis", pais1);

        System.out.println("Ciudad: " + ciudad1.getNombre());
        System.out.println("Es capital? " + ciudad1.isEsCapital());
        System.out.println("Provincia: " + ciudad1.getProvincia().getNombre());
        System.out.println("País: " + ciudad1.getProvincia().getPais().getNombre());

        prov1.getLimitaCon().add(prov2);

    }
}

