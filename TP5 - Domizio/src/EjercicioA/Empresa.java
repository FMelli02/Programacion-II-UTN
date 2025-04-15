package EjercicioA;

import java.util.ArrayList;

public class Empresa {
    public String rSocial;
    public ArrayList<Trabajador> empleado;

    public Empresa() {
    }

    public Empresa(String rSocial, ArrayList<Trabajador> empleado) {
        this.rSocial = rSocial;
        this.empleado = empleado;
    }
}
