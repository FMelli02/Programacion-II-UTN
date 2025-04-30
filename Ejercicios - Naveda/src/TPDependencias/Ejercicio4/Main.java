package TPDependencias.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        //HerenciaUpCasting
        ClasePadre padre = new ClaseHija();
        padre.apellido = "Mellimaci";

        ClaseHija hijo = (ClaseHija) padre;

        hijo.nombre = "Franco";
        System.out.println("Apellido: " + hijo.apellido);
        System.out.println("Nombre: " + hijo.nombre);
        hijo.mostrarAtributos();
    }
}
