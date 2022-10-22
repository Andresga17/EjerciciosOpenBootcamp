package poo.smartdevices;

public class SmartDevice {
    int precio;
    String marca;
    String pantalla;
    String color;
    String sistemaOperativo;

    public SmartDevice(){}
    public SmartDevice(int precio, String marca, String pantalla, String color, String sistemaOperativo) {
        this.precio = precio;
        this.marca = marca;
        this.pantalla = pantalla;
        this.color = color;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String toString(){
        return "precio: " + precio + "\n"
                + "marca: " + marca + "\n"
                + "pantalla: " + pantalla + "\n";
    }
}
