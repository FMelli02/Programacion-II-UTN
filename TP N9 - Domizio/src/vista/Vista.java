package vista;

import modelo.Modelo;
import modelo.Dato;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Vista extends JFrame {
    private final Modelo modelo = new Modelo();
    private final JTextField campoTexto = new JTextField(15);
    private final JRadioButton opcion1 = new JRadioButton("Opción A");
    private final JRadioButton opcion2 = new JRadioButton("Opción B");
    private final ButtonGroup grupoOpciones = new ButtonGroup();

    public Vista() {
        super("TP9 - Persistencia de Objetos");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btnEscribir = new JButton("Escribir archivo de datos");
        JButton btnLeer = new JButton("Leer los datos guardados");
        JButton btnTerminar = new JButton("Terminar");

        grupoOpciones.add(opcion1);
        grupoOpciones.add(opcion2);

        add(new JLabel("Ingrese texto:"));
        add(campoTexto);
        add(opcion1);
        add(opcion2);
        add(btnEscribir);
        add(btnLeer);
        add(btnTerminar);

        btnEscribir.addActionListener(e -> escribirDatos());
        btnLeer.addActionListener(e -> leerDatos());
        btnTerminar.addActionListener(e -> terminarPrograma());
    }

    private void escribirDatos() {
        String texto = campoTexto.getText().trim();
        String opcion = opcion1.isSelected() ? opcion1.getText() : (opcion2.isSelected() ? opcion2.getText() : "");

        if (texto.isEmpty() || opcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
            return;
        }

        modelo.agregarDato(new Dato(texto, opcion));

        try {
            modelo.guardar();
            JOptionPane.showMessageDialog(this, "Datos guardados exitosamente.");
            campoTexto.setText("");
            grupoOpciones.clearSelection();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage());
        }
    }

    private void leerDatos() {
        try {
            ArrayList<Dato> datos = modelo.leer();
            if (datos.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay datos guardados.");
            } else {
                StringBuilder sb = new StringBuilder("Datos guardados:\n\n");
                for (Dato d : datos) sb.append(d).append("\n");
                JOptionPane.showMessageDialog(this, sb.toString());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al leer: " + ex.getMessage());
        }
    }

    private void terminarPrograma() {
        if (modelo.existeArchivo()) {
            JOptionPane.showMessageDialog(this, "Archivo guardado en:\n" + modelo.obtenerRuta());
        } else {
            JOptionPane.showMessageDialog(this, "No se ha guardado ningún archivo.");
        }
        System.exit(0);
    }
}
