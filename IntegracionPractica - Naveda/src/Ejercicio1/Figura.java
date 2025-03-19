package Ejercicio1;

import java.util.ArrayList;

public class Figura {
    /// Como son relaciones de asociación(Diamante vacío) se definen como un atributo
    private ArrayList<Poligono> poligonos;
    private ArrayList<Elipse> elipses;

    ///No pasamos parametros en el constructor para no generar una obligación de generar un objeto
    public Figura() {
        ///En vez de usar this.poligono = poligono usamos:
        this.poligonos = new ArrayList<>();
        this.elipses = new ArrayList<>();
    }

    public void agregarPoligono(Poligono p) {
        ///Es lo mismo usar this.poligono.add(p) que poligono.add(p)
        poligonos.add(p);
    }

    public void borrarPoligono(Poligono p) {
        poligonos.remove(p);
    }

    public void mostrarPoligonos() {
        for (Poligono p : poligonos) {
            System.out.println(p.getNombre());
        }
    }
    public void agregarElipse(Elipse e) {
        elipses.add(e);
    }

    public void borrarElipse(Elipse e) {
        elipses.remove(e);
    }

    public void mostrarElipses() {
        for (Elipse e : elipses) {
            System.out.println(e.getNombre());
        }
    }
}
