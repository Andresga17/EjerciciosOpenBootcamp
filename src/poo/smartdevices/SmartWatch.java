package poo.smartdevices;

public class SmartWatch extends SmartDevice{
    boolean podometro;
    boolean medidorPulsaciones;
    boolean medidorOxigeno;

    public SmartWatch() {
        super();
    }
    public SmartWatch(int precio, String marca, String pantalla, String color, String sistemaOperativo, boolean podometro, boolean medidorPulsaciones, boolean medidorOxigeno) {
        super(precio, marca, pantalla, color, sistemaOperativo);
        this.podometro = podometro;
        this.medidorPulsaciones = medidorPulsaciones;
        this.medidorOxigeno = medidorOxigeno;

    }

    public String toString() {
        return super.toString() + "\n"
                + "podometro: " + podometro + "\n"
                + "medidor de Pulsaciones: " + medidorPulsaciones + "\n"
                + "medidor de Oxigeno: " + medidorOxigeno + "\n";
    }
}
