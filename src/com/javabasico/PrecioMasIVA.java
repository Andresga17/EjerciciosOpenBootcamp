package com.javabasico;

import java.util.Scanner;

public class PrecioMasIVA {

    public static void main(String[] args) {
        //Calculo usando una variable
        //double precioProducto = 14800d;
        //System.out.println(precioMasIVA(precioProducto));

        //Calculo ingresando un valor
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();
        System.out.println("El precio del producto con el IVA inlcludio es: " + precioMasIVA(precioProducto));
   
    }

    static double precioMasIVA(double precioProducto) {
        double valorIVA = precioProducto * 0.16;
        return precioProducto + valorIVA;
    }

}
