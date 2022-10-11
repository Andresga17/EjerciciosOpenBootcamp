package com.javabasico;

public class Concatenar {
    public static void main(String[] args){
        String[] presentacion = {"Hola", "me", "llamo", "Andres", "y", "soy", "de", "Colombia"};
        for (String palabra : presentacion) {
            System.out.print(palabra + " ");
        }
    }
}
