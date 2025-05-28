package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaCronometro extends javax.swing.JFrame {
    public JLabel lblTiempo = new JLabel("00:00:00", SwingConstants.CENTER);
    public JButton btnInicio = new JButton("Inicio");
    public JButton btnPausa = new JButton("Pausa");
    public JButton btnContinuar = new JButton("Continuar");
    public JButton btnParar = new JButton("Parar");

    public VentanaCronometro() {
        setTitle("Cronometro MVC");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        lblTiempo.setFont(new Font("Arial", Font.BOLD, 40));
        add(lblTiempo, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4));
        panel.add(btnInicio);
        panel.add(btnPausa);
        panel.add(btnContinuar);
        panel.add(btnParar);
        add(panel, BorderLayout.SOUTH);

        //Teclas de acceso
        btnInicio.setMnemonic('I');
        btnPausa.setMnemonic('P');
        btnContinuar.setMnemonic('C');
        btnParar.setMnemonic('F');

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
