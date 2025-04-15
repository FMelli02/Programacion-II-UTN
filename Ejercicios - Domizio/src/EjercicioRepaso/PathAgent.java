package EjercicioRepaso;

import java.util.ArrayList;

public class PathAgent {
    public Driver control;
    private ColisionCensor[] censor;

    public PathAgent(Driver control) {
        this.control = control;
        censor = new ColisionCensor[]{};
    }

    public ColisionCensor[] getCensor() {
        return censor;
    }

    public void setCensor(ColisionCensor[] censor) {
        this.censor = censor;
    }
}
