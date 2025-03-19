public class Rectangulo {
    public float base;
    protected float altura;
    private String color;

    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(float base, float altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public void mostrarTodos() {
        System.out.println("Base: " + base + "\nAltura: " + altura + "\nColor: " + color+ "\n");
    }
}
