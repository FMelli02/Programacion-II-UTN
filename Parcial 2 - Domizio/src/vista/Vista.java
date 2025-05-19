package vista;

import modelo.Autor;
import modelo.Persona;

import javax.swing.*;
import java.awt.*;

public class Vista {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario Persona / Autor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        // Campos comunes
        JLabel lblDni = new JLabel("DNI:");
        JTextField txtDni = new JTextField();

        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField();

        // Combo para tipo
        JLabel lblTipo = new JLabel("Tipo:");
        String[] tipos = {"Persona común", "Autor"};
        JComboBox<String> comboTipo = new JComboBox<>(tipos);

        // Campo extra para Autor
        JLabel lblSeudonimo = new JLabel("Pseudónimo:");
        JTextField txtSeudonimo = new JTextField();
        lblSeudonimo.setVisible(false);
        txtSeudonimo.setVisible(false);

        // Botón
        JButton btnGuardar = new JButton("Guardar");

        // Área de salida
        JTextArea salida = new JTextArea();
        salida.setEditable(false);

        // Mostrar/ocultar pseudónimo según selección
        comboTipo.addActionListener(e -> {
            boolean esAutor = comboTipo.getSelectedItem().equals("Autor");
            lblSeudonimo.setVisible(esAutor);
            txtSeudonimo.setVisible(esAutor);
        });

        // Acción del botón
        btnGuardar.addActionListener(e -> {
            int dni = Integer.parseInt(txtDni.getText());
            String nombre = txtNombre.getText();

            if (comboTipo.getSelectedItem().equals("Autor")) {
                String pseudonimo = txtSeudonimo.getText();
                Autor autor = new Autor(dni, nombre, pseudonimo);
                salida.setText(autor.toString());
            } else {
                Persona persona = new Persona(dni, nombre);
                salida.setText(persona.toString());
            }
        });

        // Agregamos los componentes
        panel.add(lblDni); panel.add(txtDni);
        panel.add(lblNombre); panel.add(txtNombre);
        panel.add(lblTipo); panel.add(comboTipo);
        panel.add(lblSeudonimo); panel.add(txtSeudonimo);
        panel.add(new JLabel()); panel.add(btnGuardar);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(salida), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
