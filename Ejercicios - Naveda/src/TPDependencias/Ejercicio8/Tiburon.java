package TPDependencias.Ejercicio8;

public class Tiburon extends Animal{
    private String tamanio;

    public Tiburon(String sexo, int edad, String tamanio) {
        super(sexo, edad);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void mostrarTiburon() {
        System.out.println("Atributos del Tiburon: ");
        System.out.println("Sexo: " + getSexo());
        System.out.println("Edad: " + getEdad());
        System.out.println("Tamanio: " + getTamanio());
    }
}
