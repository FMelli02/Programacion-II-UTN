package modelo;

import java.io.*;
import java.util.ArrayList;

public class Modelo {
    private ArrayList<Dato> datos = new ArrayList<>();
    private final File archivo = new File("datos.dat");

    public void agregarDato(Dato dato) {
        datos.add(dato);
    }

    public void guardar() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(datos);
        }
    }

    public ArrayList<Dato> leer() throws IOException, ClassNotFoundException {
        if (!archivo.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Dato>) ois.readObject();
        }
    }

    public boolean existeArchivo() {
        return archivo.exists();
    }

    public String obtenerRuta() {
        return archivo.getAbsolutePath();
    }
}
