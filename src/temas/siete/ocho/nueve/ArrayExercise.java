package temas.siete.ocho.nueve;

/*
Dada la funcion reverse Escribe el codigo que devuelva una cadena al revers. Por
ejemplo, la cadena "hola mundo", debe retornar "odnum aloh"

1. Crea un array unidemensional de Strings y recorrelo, mostrando unicamente sus valores.
*/
public class ArrayExercise {
    //String texto = "Hola mundo";
   public static String reverse (String texto){
       char [] textoArray = texto.toCharArray();
//       ArrayList <Character> arrayReverse = new ArrayList<>();
       String reverseString = "";
       for (int i = texto.length() - 1; i >= 0; i--) {
//           arrayReverse.add(textoArray[i]);
           reverseString += textoArray[i];
       }
       return reverseString;
   }
}
