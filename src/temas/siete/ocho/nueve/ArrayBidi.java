/*
* 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posicion y el valor de cada elemento en ambas dimensiones.
*/
package temas.siete.ocho.nueve;

public class ArrayBidi {
    public static void main(String[] args) {

        int[][] numbers = new int[3][4];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[0][j] += j + 1;
                numbers[1][j] += j + 2;
                numbers[2][j] += j + 3;
                System.out.println("Posicion: " + i + j + " " + "Valor: " + numbers[i][j]);
            }
        }
    }

}