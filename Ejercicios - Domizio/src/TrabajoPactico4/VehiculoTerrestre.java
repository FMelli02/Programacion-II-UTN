package TrabajoPactico4;

public abstract class VehiculoTerrestre extends Vehiculo {
    public int cantRuedas;

    public  VehiculoTerrestre(char tipoCombustible, float cantCombustible, int cantRuedas) {
        super(tipoCombustible, cantCombustible);
        this.cantRuedas = cantRuedas;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    @Override
    public float velocidadMaxima() {
        return 200;
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de Ruedas: " + this.cantRuedas);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributos();
    }


}
