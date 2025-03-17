public class Cajero_automatico {
    public final double efectivo;
    protected static boolean acepta;
    private String devuelve;

    //Constructor
    public Cajero_automatico(double efectivo, String devuelve) {
        this.efectivo = efectivo;
        this.devuelve = devuelve;
    }

    //Getters & Setters
    public double getEfectivo() {
        return efectivo;
    }

    public boolean isAcepta() {
        return acepta;
    }

    public void setAcepta(boolean acepta) {
        this.acepta = acepta;
    }

    public String getDevuelve() {
        return devuelve;
    }

    public void setDevuelve(String devuelve) {
        this.devuelve = devuelve;
    }

    //Métodos
    public void procesarPedido(){
    }

    public boolean pago(double efectivo){
        return acepta;
    }


}
