package EjercicioRepaso;

public abstract class Motor implements Auxiliar {
    protected int RMP;

    public Motor(int RMP) {
        this.RMP = RMP;
    }

    public abstract int acelerar(int v);

    public void parar(){
        System.out.println("Parando el vehiculo.");
    }

    @Override
    public boolean funciona() {
        return RMP > min_revol;
    }
}
