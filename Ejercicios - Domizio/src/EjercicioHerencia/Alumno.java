package EjercicioHerencia;

import java.util.Arrays;

public class Alumno extends Persona {
    public int notas[] = new int[10];

    //Como dni es una variable final de Persona, se llama también en el constructor de alumno
    //cuando hay herencia
    public Alumno(int dni) {
        super(dni);
    }

    public Alumno(String nombre, int dni) {
        super(nombre, dni);
    }

    public Alumno(String nombre, int dni, int[] notas) {
        super(nombre, dni);
        this.notas = notas;
    }

    @Override
    public void mostrarAtributos() {//RE DEFINICIÓN DE MÉTODOS O SOBRE-ESCRITURA
        super.mostrarAtributos();
        System.out.println("Notas: " + Arrays.toString(notas)+ "\n");
        //Cuando genero el mismo metodo que la super clase se llama Redefinición de métodos o Sobre-escritura
        //Polimorfismo
    }
    
    @Override
    public void hacerEjercicio() {
        System.out.println("Saliendo a correr...");
    }
}
