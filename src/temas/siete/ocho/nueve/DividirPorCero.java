package temas.siete.ocho.nueve;

public class DividirPorCero {
    public static void main(String[] argas) {
        System.out.println(ceroDivide(3, 0));
    }
    public static float ceroDivide (int numerador, int denominador) throws ArithmeticException {
        float division = 0;
        try {
            division = numerador / denominador;
        } catch (ArithmeticException e) {
            System.out.println("Error. No se puede dividir por cero: " + e.getClass());
        }
        return division;
    }
}
