package TrabajoPactico4;

public abstract class Vehiculo implements Potencia {
    public char tipoCombustible;
    public float cantCombustible;

    public Vehiculo(char tipoCombustible, float cantCombustible) {
        this.tipoCombustible = tipoCombustible;
        this.cantCombustible = cantCombustible;
    }

    public char getTipoCombustible() {
        return tipoCombustible;
    }

    public float getCantCombustible() {
        return cantCombustible;
    }

    public abstract float velocidadMaxima();

    public void mostrarAtributos() {
        System.out.println("Tipo Combustible: " + this.tipoCombustible);
        System.out.println("Cantidad de Combustible: " + this.cantCombustible);
    }

    public void desdePotencia(int tipo_combustible, int cantCombRequerido) {
        if (tipo_combustible >= 0 && tipo_combustible <= 5) {
            System.out.println("Usted ha seleccionado: " + Potencia.tipoCombustible[tipo_combustible]);
            System.out.println("Cantidad de Combustible: " + cantCombRequerido);
        }else {
            System.out.println("El valor ingresado no corresponde a un tipo combustible.");
        }
    }
}
