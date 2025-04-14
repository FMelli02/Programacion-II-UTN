package EjercicioAsociacion;

public class Cuerpo {
    /// Composición
    public int a;
    public Corazon tiene;

    public Cuerpo() {
        tiene = new Corazon(); //Composición
    }

    public Cuerpo(int a) {
        this.a = a;
        tiene = new Corazon(); //Composición
    }

    public Cuerpo(int a, Corazon tiene) {
        this.a = a;
        //this.tiene = tiene; //No es composición
        this.tiene = new Corazon(tiene); //Composición
    }
}
