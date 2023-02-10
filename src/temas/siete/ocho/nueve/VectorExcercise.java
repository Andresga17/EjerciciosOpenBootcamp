/*
Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
Elimina el 2o y 3er elemento y muestra el resultado final.
*/
package temas.siete.ocho.nueve;

import java.util.Vector;

public class VectorExcercise {
    public static void main(String[] args) {
        Vector <String> names = new Vector (5);
        names.add("Andres");
        names.add("Maria");
        names.add("Juliana");
        names.add("Jessica");
        names.add("Fernanda");
        System.out.println(names);
        names.remove(1);
        names.remove(2);
        System.out.println(names);

        /*
         * 4. El problema de tener que agregar mil elementos al mismo tiempo en un vector es que su capaciddad su diplicaria cada que
         * se alcance el tamaño actual del vector
         */
        Vector <Integer> numbers = new Vector ();

        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }
        int capacidad = numbers.capacity();
        System.out.println(capacidad);
        System.out.println(numbers);
    }


}

