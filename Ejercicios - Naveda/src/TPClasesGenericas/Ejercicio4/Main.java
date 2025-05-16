package TPClasesGenericas.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> a1 = new Almacen<>();

        a1.añadirElemento(new Producto("Silla", 15000));
        a1.añadirElemento(new Producto("Mesa", 35000));
        a1.añadirElemento(new Producto("Heladera", 500000));

        List<Object> listaSuper = new ArrayList<>();
        listaSuper.addAll(a1.getElementos());

        a1.imprimirElementos(listaSuper);
    }
}
