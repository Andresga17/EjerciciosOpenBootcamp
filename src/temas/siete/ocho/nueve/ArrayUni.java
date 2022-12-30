// 1. Crea un array unidemensional de Strings y recorrelo, mostrando unicamente sus valores.
package temas.siete.ocho.nueve;

public class ArrayUni {
    public static void main (String[] args){

        String [] arrayUni = new String [4];
        arrayUni[0] = "Hola";
        arrayUni[1] = "me";
        arrayUni[2] = "llamo";
        arrayUni[3] = "Andres";

        for (String word : arrayUni){
            System.out.println(word);
        }
    }

}
