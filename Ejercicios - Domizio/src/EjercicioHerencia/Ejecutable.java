package EjercicioHerencia;

public class Ejecutable {
    public static void main(String[] args) {
        //Persona p1 = new Persona(44336533);
        //Persona p2 = new Persona("Franco", 44247706);

        Alumno a1 = new Alumno(13435252);
        Alumno a2 = new Alumno("Enzo", 46327019);

        int [] notas = {10,9,5,6,7,8,7,8,9,6};

        Alumno a3 = new Alumno("Mateo", 45342879, notas);

        //p1.mostrarAtributos();
        //p2.mostrarAtributos();
        a1.mostrarAtributos();

        a2.notas[0] = 9;
        a2.notas[1] = 7;
        a2.mostrarAtributos();
        a3.mostrarAtributos();
        a3.hacerEjercicio();
    }
}
