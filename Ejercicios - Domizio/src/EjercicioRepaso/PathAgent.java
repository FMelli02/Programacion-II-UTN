package EjercicioRepaso;

import java.util.ArrayList;

public class PathAgent {
    public Driver control;
    private ColisionCensor[] censor;

    public PathAgent(Driver control) {
        this.control = control;
        censor = new ColisionCensor[10];
    }

    public ColisionCensor[] getCensor() {
        return censor;
    }

    public void setCensor(ColisionCensor[] censor) {
        this.censor = censor;
    }

    //Sobrecarga metodo setCensor
    public void setCensor(ColisionCensor censor, int i) {
        this.censor[i] = censor;
    }

    public void mostrarAtributos() {
        System.out.println("Atributos PathAgent");
    }
}
