package poo.smartdevices;

public class SmartPhone extends SmartDevice {
    String camaraFrontal;

    String camarasTraseras;
    boolean lectorDeHuella;


    public SmartPhone(){
        super();
    }
    public SmartPhone(int precio, String marca, String pantalla, String color, String sistemaOperativo, String camaraFrontal, String camarasTraseras, boolean lectorDeHuella){
        super(precio, marca, pantalla, color, sistemaOperativo);
        this.camaraFrontal = camaraFrontal;
        this.camarasTraseras = camarasTraseras;
        this.lectorDeHuella = lectorDeHuella;
    }

    public String toString(){
        return super.toString() + "\n"
                + "Camara frontal: " + camaraFrontal + "\n"
                + "Camaras traseras: " + camarasTraseras + "\n"
                + "lector de Huella: " + lectorDeHuella + "\n";
    }
}
