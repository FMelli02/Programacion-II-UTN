import java.util.ArrayList;

public class Libro {
    public String titulo;
    public String clasificacion;
    public int numero;
    private ArrayList<Autor> creador;
    protected ArrayList<Tema> consiste_en;

    public Libro() {
    }

    public Libro(String titulo, String clasificacion, int numero, ArrayList<Tema> consiste_en) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.numero = numero;
        this.creador = new ArrayList<>();
        this.consiste_en = consiste_en;
    }

    public ArrayList<Autor> getCreador() {
        return creador;
    }

    public void setCreador(ArrayList<Autor> creador) {
        this.creador = creador;
    }
}
