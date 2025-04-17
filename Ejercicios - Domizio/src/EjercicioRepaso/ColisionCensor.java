package EjercicioRepaso;

public class ColisionCensor {
    public String colision;
    private PathAgent receptor;

    public ColisionCensor(String colision) {
        this.colision = colision;
    }
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
