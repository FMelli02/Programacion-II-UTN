package vista;

import controlador.PersonaControlador;

import javax.swing.*;
import java.awt.*;

public class Formulario {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario MVC");
        frame.setSize(600, 340);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 2));

        JTextField txtDni = new JTextField();
        JTextField txtNombre = new JTextField();
        JTextField txtPseudonimo = new JTextField();
        JLabel lblDni = new JLabel("DNI:");
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblTipo = new JLabel("Tipo:");
        JLabel lblPseudonimo = new JLabel("Pseudonimo:");
        JComboBox<String> comboTipo = new JComboBox<>(new String[]{"Persona", "Autor"});
        JTextArea salida = new JTextArea(6, 2);
        JButton btnGuardar = new JButton("Guardar");
        JButton btnCerrar = new JButton("Cerrar");

        panel.setBackground(Estilos.COLOR_FONDO);
        txtDni.setBackground(Estilos.COLOR_CUADRO_TEXTO);
        txtNombre.setBackground(Estilos.COLOR_CUADRO_TEXTO);
        txtPseudonimo.setBackground(Estilos.COLOR_CUADRO_TEXTO);
        comboTipo.setBackground(Estilos.COLOR_FONDO);
        salida.setBackground(Estilos.COLOR_CUADRO_TEXTO);
        btnGuardar.setBackground(Estilos.COLOR_BOTON);
        btnCerrar.setBackground(Estilos.COLOR_BOTON);

        lblDni.setForeground(Estilos.COLOR_LETRA);
        lblNombre.setForeground(Estilos.COLOR_LETRA);
        lblTipo.setForeground(Estilos.COLOR_LETRA);
        lblPseudonimo.setForeground(Estilos.COLOR_LETRA);

        txtDni.setFont(Estilos.FUENTE);
        txtNombre.setFont(Estilos.FUENTE);
        txtPseudonimo.setFont(Estilos.FUENTE);
        lblDni.setFont(Estilos.FUENTE);
        lblNombre.setFont(Estilos.FUENTE);
        lblTipo.setFont(Estilos.FUENTE);
        lblPseudonimo.setFont(Estilos.FUENTE);
        comboTipo.setFont(Estilos.FUENTE);
        salida.setFont(Estilos.FUENTE);
        btnGuardar.setFont(Estilos.FUENTE);
        btnCerrar.setFont(Estilos.FUENTE);


        panel.add(lblDni);
        panel.add(txtDni);
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblTipo);
        panel.add(comboTipo);
        panel.add(lblPseudonimo);
        panel.add(txtPseudonimo);
        panel.add(btnGuardar);
        panel.add(btnCerrar);
        panel.add(new JScrollPane(salida));

        frame.add(panel);
        frame.setVisible(true);

        // Inicialmente ocultar pseudónimo
        lblPseudonimo.setVisible(false);
        txtPseudonimo.setVisible(false);

        comboTipo.addActionListener(e -> {
            boolean esAutor = comboTipo.getSelectedItem().equals("Autor");
            lblPseudonimo.setVisible(esAutor);
            txtPseudonimo.setVisible(esAutor);
        });

        btnGuardar.addActionListener(e -> {
            try {
                int dni = Integer.parseInt(txtDni.getText());
                String nombre = txtNombre.getText();
                String pseudo = txtPseudonimo.getText();
                boolean esAutor = comboTipo.getSelectedItem().equals("Autor");

                // Validar nombre sin números
                if (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
                    throw new IllegalArgumentException("El nombre no puede contener números ni símbolos.");
                }

                PersonaControlador.guardarPersona(dni, nombre, esAutor, pseudo);
                salida.setText(esAutor
                        ? "Autor guardado: " + nombre + " (" + pseudo + ")"
                        : "Persona guardada: " + nombre);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "DNI debe ser un número.");
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        });

        btnCerrar.addActionListener(e -> {
            frame.dispose();
            System.exit(0);
        });
    }
}

