package TrabajoPactico4;

public class Avion extends VehiculoAereo{
    private int cantTurbinas;

    public Avion(char tipoCombustible, float cantCombustible, float alturaVuelo, int cantTurbinas) {
        super(tipoCombustible, cantCombustible, alturaVuelo);
        this.cantTurbinas = cantTurbinas;
    }

    public int getCantTurbinas() {
        return cantTurbinas;
    }

    public void setCantTurbinas(int cantTurbinas) {
        this.cantTurbinas = cantTurbinas;
    }

    @Override
    public float velocidadMaxima() {
        return super.velocidadMaxima();
    }

    @Override
    public float alturaVuelo() {
        return 12000f;
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de turbinas: " + this.cantTurbinas);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
    }

    @Override
    public float capacidadMaxDeCarga() {
        return 1000f;
    }
}
