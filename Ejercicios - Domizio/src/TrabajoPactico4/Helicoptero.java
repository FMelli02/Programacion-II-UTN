package TrabajoPactico4;

public class Helicoptero extends VehiculoAereo{
    private String prestaciones;

    public Helicoptero(char tipoCombustible, float cantCombustible, float alturaVuelo, String prestaciones) {
        super(tipoCombustible, cantCombustible, alturaVuelo);
        this.prestaciones = prestaciones;
    }

    public String getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(String prestaciones) {
        this.prestaciones = prestaciones;
    }

    @Override
    public float velocidadMaxima() {
        return super.velocidadMaxima();
    }

    @Override
    public float alturaVuelo() {
        return 900f;
    }

    public void mostrarAtributos() {
        System.out.println("Prestaciones: " + this.prestaciones);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
    }

    @Override
    public float capacidadMaxDeCarga() {
        return 350f;
    }
}
