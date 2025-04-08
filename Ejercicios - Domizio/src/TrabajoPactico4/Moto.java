package TrabajoPactico4;

public class Moto extends VehiculoTerrestre{
    private int cantTiempos;

    public Moto(char tipoCombustible, float cantCombustible, int cantRuedas, int cantTiempos) {
        super(tipoCombustible, cantCombustible, cantRuedas);
        this.cantTiempos = cantTiempos;
    }

    public int getCantTiempos() {
        return cantTiempos;
    }

    public void setCantTiempos(int cantTiempos) {
        this.cantTiempos = cantTiempos;
    }

    @Override
    public float velocidadMaxima() {
        return super.velocidadMaxima();
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de tiempos: " + this.cantTiempos);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
    }

    @Override
    public float capacidadMaxDeCarga() {
        return 17.5f;
    }
}
