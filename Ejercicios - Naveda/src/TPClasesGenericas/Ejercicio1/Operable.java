package TPClasesGenericas.Ejercicio1;

public interface Operable<E> {
    E suma(E otro);
    E resta(E otro);
    E multiplicacion(E otro);
    E division(E otro);
}
