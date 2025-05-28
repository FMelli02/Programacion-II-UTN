package modelo;

public class Cronometro extends Thread {
    private int horas = 0, minutos = 0, segundos = 0;
    private boolean corriendo = false;
    private boolean pausado = false;

    public interface Listener {
        void actualizarTiempo(String tiempo);
    }

    private Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void iniciar() {
        corriendo = true;
        pausado = false;
        this.start();
    }

    public void pausar() {
        pausado = true;
    }

    public void continuarCronometro() {
        pausado = false;
    }

    public void parar() {
        corriendo = false;
        horas = minutos = segundos = 0;
        notificar();
    }

    @Override
    public void run() {
        while (corriendo) {
            if (!pausado) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
                segundos++;
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                    if (minutos == 60) {
                        minutos = 0;
                        horas++;
                        if (horas == 24) horas = 0;
                    }
                }
                notificar();
            } else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }

    private void notificar() {
        if (listener != null) {
            String tiempo = String.format("%02d:%02d:%02d", horas, minutos, segundos);
            listener.actualizarTiempo(tiempo);
        }
    }
}

