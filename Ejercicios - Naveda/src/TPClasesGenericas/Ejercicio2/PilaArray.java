package TPClasesGenericas.Ejercicio2;


import java.util.NoSuchElementException;

public class PilaArray<E> {
    private E[] elementos;
    private int contador;

    @SuppressWarnings("unchecked")
    public PilaArray(int tamaño) {
        elementos = (E[]) new Object[tamaño];
        contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public boolean añadir(E elemento) {
        if (contador < elementos.length) {
            elementos[contador] = elemento;
            contador++;
            return true;
        } else {
            return false; //La pila está llena
        }
    }

    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return elementos[contador - 1];
    }

    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        contador--;
        return elementos[contador];
    }

    @Override
    public String toString() {
        if (estaVacia()) {
            return "Pila vacía";
        }

        StringBuilder sb = new StringBuilder("Pila: [");
        for (int i = 0; i < contador; i++) {
            sb.append(elementos[i]);
            if (i < contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
