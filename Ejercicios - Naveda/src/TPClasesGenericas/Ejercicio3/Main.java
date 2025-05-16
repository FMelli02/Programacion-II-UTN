package TPClasesGenericas.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> a1 = new Almacen();
        Producto p1 = new Producto("Chocolate", 2000);
        Producto p2 = new Producto("Leche", 1500);
        Producto p3 = new Producto("Aceite", 1200);

        a1.añadirProducto(p1);
        a1.añadirProducto(p2);
        a1.añadirProducto(p3);

        a1.imprimirProductos(a1.getProductos());
    }
}
