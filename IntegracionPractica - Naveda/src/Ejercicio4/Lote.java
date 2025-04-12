package Ejercicio4;

import java.util.ArrayList;

public class Lote {
    private ArrayList<String> minerales;
    private boolean especial;
    private Cereal sembrado;

    public Lote(ArrayList<String> minerales, boolean especial) {
        this.minerales = minerales;
        this.especial = especial;
        this.sembrado = null;
    }

    public boolean esEspecial() {
        return especial;
    }

    public boolean sePuedeSembrar(Cereal cereal) {
        if (!minerales.containsAll(cereal.getMineralesRequeridos())) {
            return false;
        }
        if (cereal.esPastura() && sembrado != null && sembrado.esPastura()) {
            return false;
        }
        return true;
    }

    public void sembrar(Cereal cereal) {
        if (sePuedeSembrar(cereal)) {
            this.sembrado = cereal;
            System.out.println("Cereal " + cereal.getNombre() + " sembrado exitosamente.");
        } else {
            System.out.println("No se puede sembrar " + cereal.getNombre() + " en este lote.");
        }
    }

    public Cereal getCerealSembrado() {
        return sembrado;
    }
}
