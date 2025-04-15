package EjercicioRepaso;

public class ColisionCensor {
    private PathAgent receptor;

    public ColisionCensor(PathAgent receptor) {
        this.receptor = receptor;
    }

    public PathAgent getReceptor() {
        return receptor;
    }

    public void setReceptor(PathAgent receptor) {
        this.receptor = receptor;
    }
}
