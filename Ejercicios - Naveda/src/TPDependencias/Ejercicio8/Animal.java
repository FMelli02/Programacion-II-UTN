package TPDependencias.Ejercicio8;

public class Animal {
    private String sexo;
    private int edad;

    public Animal(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer() {
        System.out.println("Comiendo");
    }

    public void mostrarAtributos() {
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Edad: " + this.edad);
    }
}
