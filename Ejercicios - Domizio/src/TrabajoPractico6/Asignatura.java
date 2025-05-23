package TrabajoPractico6;

public class Asignatura {
    private Integer codigo;
    public Profesor instructor;

    public Asignatura() {
    }

    public Asignatura(Integer codigo, Profesor instructor) {
        this.codigo = codigo;
        this.instructor = instructor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void mostrarAtributos() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Profesor: " + instructor);
    }
}
