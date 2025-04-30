package TPDependencias.Ejercicio2;

public class Auto {
    private String marca;

    public Auto(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("Encendiendo " + marca);
    }

    public void llenarTanque(Nafta nafta) {
        System.out.println("Cargando " + nafta.getCantidad() + " litros.");
    }
}
