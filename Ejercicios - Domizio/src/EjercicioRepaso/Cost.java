package EjercicioRepaso;

public class Cost {
    public float a;
    private PathAgent receptor;
    private ColisionCensor censor;

    public Cost() {
    }

    public Cost(float a, PathAgent receptor, ColisionCensor censor) {
        this.a = a;
        this.receptor = receptor;
        this.censor = censor;
    }

    public PathAgent getReceptor() {
        return receptor;
    }

    public void setReceptor(PathAgent receptor) {
        this.receptor = receptor;
    }

    public ColisionCensor getCensor() {
        return censor;
    }

    public void setCensor(ColisionCensor censor) {
        this.censor = censor;
    }
}
