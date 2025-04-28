package EjercicioContrato;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Herramienta h1 = new Herramienta("Destornillador");
        Herramienta h2 = new Herramienta("Cinta Métrica");
        Seguro s1 = new Seguro("OSPE");
        Trabajador t1 = new Trabajador("Juani Sarmiento", new Herramienta[]{h1, h2});
        Trabajador t2 = new Trabajador("Lauti Salinas", new Herramienta[]{h1, h2});
        Empleador e1 = new Empleador("Franco Mellimaci", s1);

        ArrayList<Contrato> contratos = new ArrayList<>();
        contratos.add(mostrarContrato(e1, t1));
        contratos.add(mostrarContrato(e1, t2));

        Iterator<Contrato> it = contratos.iterator();
        int cont = 0;
        System.out.println("\nHerramientas:");
        while (it.hasNext()) {
            Contrato aux = it.next();
            System.out.println(aux.empleado.getUsa()[cont].nombre);
            cont ++;
        }
    }

    public static Contrato mostrarContrato(Empleador e, Trabajador t) {
        Contrato contrato = new Contrato(1234, e, t);
        System.out.println("\nEmpleador: " + contrato.jefe.nombre);
        System.out.println("Seguro: " + contrato.jefe.contrata.numero);
        System.out.println("Trabajador: " + contrato.empleado.nombre);
        return contrato;
    }
}
