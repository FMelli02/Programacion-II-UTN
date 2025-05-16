package TPClasesGenericas.Ejercicio1;

public class NumeroEntero implements Operable<NumeroEntero> {
    private int valor;

    public NumeroEntero(int valor) {
        this.valor = valor;
    }

    @Override
    public NumeroEntero suma(NumeroEntero otro) {
        return new NumeroEntero(this.valor + otro.valor);
    }

    @Override
    public NumeroEntero resta(NumeroEntero otro) {
        return new NumeroEntero(this.valor - otro.valor);
    }

    @Override
    public NumeroEntero multiplicacion(NumeroEntero otro) {
        return new NumeroEntero(this.valor * otro.valor);
    }

    @Override
    public NumeroEntero division(NumeroEntero otro) {
        if (otro.valor == 0) {
            throw new ArithmeticException("Division por cero");
        }
        return new NumeroEntero(this.valor / otro.valor);
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
