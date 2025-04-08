package TrabajoPactico4;

public class Coche extends VehiculoTerrestre{
    private double cilindrada;

    public Coche(char tipoCombustible, float cantCombustible, int cantRuedas, double cilindrada) {
        super(tipoCombustible, cantCombustible, cantRuedas);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public float velocidadMaxima() {
        return super.velocidadMaxima();
    }

    public void mostrarAtributos() {
        System.out.println("Cilindrada: " + this.cilindrada);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
    }

    @Override
    public float capacidadMaxDeCarga() {
        return 55.0f;
    }
}
