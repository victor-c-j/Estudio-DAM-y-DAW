package com.example;

import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        // Crea una piramide pasandole el numero de niveles que va a tener,
        // para que sea simétrica en el centro siempre tiene que tener un número impar
        // de asteriscos
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Dame el numero de niveles que quieres que tenga la pirámide: ");
        x = sc.nextInt();
        int odds = 1;
        for (int i = 1; i <= x; i++) {
            
            for (int j = 1; j <= (x-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= odds; k++) {
                System.out.print("A");
            }
            odds+=2;
            System.out.println();
        }
    }
}
