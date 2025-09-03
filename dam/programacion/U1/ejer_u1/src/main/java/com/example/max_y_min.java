package com.example;

import java.util.Scanner;

public class max_y_min {
    public static void main(String[] args) {
        /*
         * Algoritmo que lea números enteros hasta teclear 0,
         * y nos muestre el máximo, el mínimo y la media de todos ellos.
         * Piensa cómo debemos inicializar las variables.
         */
        int x;
        int max = 0;
        int min = 0;
        int total = 0;
        int cantidad = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dame un numero entero (0 para salir) ");
            x = sc.nextInt();
            if (cantidad != 0 && x != 0) {
                if (x > max) {
                    max = x;
                }
                if (x < min) {
                    min = x;
                }
                total += x;
                cantidad++;
            } else if (cantidad == 0){
                max = x;
                min = x;
                total+=x;
                cantidad++;
            }
        } while (x != 0);
        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
        System.out.println("Media de los " + cantidad  + " números: " + total / cantidad);
        System.out.println("Total: " + total);
        System.out.println("cantidad de números: " + cantidad);
    }

}
