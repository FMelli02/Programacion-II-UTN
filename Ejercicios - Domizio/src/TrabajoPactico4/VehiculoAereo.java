package TrabajoPactico4;

public abstract class VehiculoAereo extends Vehiculo {
    public float alturaVuelo;

    public VehiculoAereo(char tipoCombustible, float cantCombustible, float alturaVuelo) {
        super(tipoCombustible, cantCombustible);
        this.alturaVuelo = alturaVuelo;
    }

    public float getAlturaVuelo() {
        return alturaVuelo;
    }

    @Override
    public float velocidadMaxima() {
        return 800;
    }

    public abstract float alturaVuelo();

    public void mostrarAtributos() {
        System.out.println("Altura de vuelo: " + this.alturaVuelo);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributos();
    }
}
