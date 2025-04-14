package EjercicioAsociacion;

public class A {
    ///Asociación Común
    /*public int a;
    public B rol;

    public A() {
    }

    public A(int a, B rol) {
        this.a = a;
        this.rol = rol;
    }*/
    ///Asociación Bidireccional
    public int a;
    private B hace;

    public A() {

    }
    public A(int a, B hace) {
        this.a = a;
        this.hace = hace;
    }

    public B getHace() {
        return hace;
    }

    public void setHace(B hace) {
        this.hace = hace;
    }

    public int sumar(int x) {
        return a + x;
    }
}
