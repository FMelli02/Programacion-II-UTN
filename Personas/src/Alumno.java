public class Alumno {
    private int dni;
    public String nombre;
    boolean trabaja;

    public void mostrar_atributos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);

        if (trabaja){
            System.out.println("Trabaja");
        }else{
            System.out.println("No trabaja");
        }
    }

    //Constructor
    public Alumno() {
    }

    public Alumno(int dni) {
        this.dni = dni;
    }

    //Getters & Setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
