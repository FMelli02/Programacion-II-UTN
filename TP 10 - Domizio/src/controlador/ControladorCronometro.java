package controlador;

import modelo.Cronometro;
import vista.VentanaCronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCronometro {
    private Cronometro cronometro;
    private VentanaCronometro vista;

    public ControladorCronometro(Cronometro cronometro, VentanaCronometro vista) {
        this.cronometro = cronometro;
        this.vista = vista;

        this.vista.btnInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!cronometro.isAlive()) cronometro.iniciar();
            }
        });

        this.vista.btnPausa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cronometro.pausar();
            }
        });

        this.vista.btnContinuar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cronometro.continuarCronometro();
            }
        });

        this.vista.btnParar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cronometro.parar();
            }
        });

        this.cronometro.setListener(new Cronometro.Listener() {
            @Override
            public void actualizarTiempo(String tiempo) {
                vista.lblTiempo.setText(tiempo);
            }
        });
    }
}
