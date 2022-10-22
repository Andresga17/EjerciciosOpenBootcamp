package poo.smartdevices;

public class Main {
    public static void main(String[] args) {
        SmartDevice whatch = new SmartWatch(24, "Huawei band 7", "1.47 inches Amoled", "rojo", "RTOS", false, true, true);
        System.out.println("Smartwatch" + "\n" + whatch);

        SmartDevice phone = new SmartPhone(960, "iPhone 13", "Super retina XDR OLED 6,1 inches", "Rosa", "iOS 16", "12 Mpx HDR", "12 Mpx gran angular y ultra gran angular HDR", true);
        System.out.println("Smartphone" + "\n" + phone);
    }
}
