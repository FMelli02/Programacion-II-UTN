package EjercicioA;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("Arcos Dorados, CA", new ArrayList<>());
        Trabajador t1 = new Trabajador(35463772, e1);

        System.out.println("Desde objeto Trabajador visualizamos la razón social:");
        System.out.println(t1.getEmpleador().rSocial);

        System.out.println("\nDesde objeto Empresa visualizamos el dni:");
        e1.empleado.add(t1);
        System.out.println(e1.empleado.get(0).getDni());
    }
}
