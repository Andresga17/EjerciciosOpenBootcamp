package temas.siete.ocho.nueve;

import java.util.ArrayList;

public class ArrayListNumbers {
    public static void main (String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i + 1);
        }
        System.out.println(numbers);

        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) % 2 == 0) {
                numbers.remove(numbers.get(j));
            }
        }

        System.out.println("Eliminando los numeros pares\n" + numbers);
    }
}
