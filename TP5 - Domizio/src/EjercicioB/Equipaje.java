package EjercicioB;

public class Equipaje {
    private float peso;
    private String tipo;

    public Equipaje() {
    }

    public Equipaje(float peso, String tipo) {
        this.peso = peso;
        this.tipo = tipo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
