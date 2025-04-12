package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Plato milanesa = new Plato("Milanesa");
        Plato pizza = new Plato("Pizza");
        Plato sushi = new Plato("Sushi");

        Restaurante rest1 = new Restaurante("Zitto");
        Restaurante rest2 = new Restaurante("OI Sushi");

        Sucursal s1 = new Sucursal("Palmares Open Mall", rest1);
        Sucursal s2 = new Sucursal("Av. San Martín 2560", rest2);
        rest1.agregarSucursal(s1);
        rest2.agregarSucursal(s2);

        PlatoServido milanesaR1 = new PlatoServido(milanesa, rest1);
        PlatoServido pizzaR1 = new PlatoServido(pizza, rest1);
        PlatoServido sushiR2 = new PlatoServido(sushi, rest2);
        PlatoServido milanesaR2 = new PlatoServido(milanesa, rest2);

        rest1.agregarPlato(milanesaR1);
        rest1.agregarPlato(pizzaR1);
        rest2.agregarPlato(sushiR2);
        rest1.agregarPlato(milanesaR2);

        Persona franco = new Persona("Franco");
        Persona enzo = new Persona("Enzo");

        franco.frecuenta(rest1);
        enzo.frecuenta(rest2);
        enzo.frecuenta(rest1);

        franco.leGusta(milanesaR1);
        enzo.leGusta(sushiR2);
        enzo.leGusta(pizzaR1);

        System.out.println("A Franco le gustan: ");
        for (PlatoServido p : franco.getGustos()) {
            System.out.println("- " + p.getNombrePlato() + " en " + p.getRestaurante().getNombre());
        }

        System.out.println("\nA Enzo le gustan: ");
        for (PlatoServido p : enzo.getGustos()) {
            System.out.println("- " + p.getNombrePlato() + " en " + p.getRestaurante().getNombre());
        }
    }
}
