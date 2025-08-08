package com.example;

import java.util.Scanner;

public class media_aritmetica {
    public static void main(String[] args) {
        // dada una secuencia de números leídos por teclado, que acabe con un \-1, por
        // ejemplo:
        // 5,3,0,2,4,4,0,0,2,3,6,0………,-1;
        // Realizar el algoritmo que calcule la media aritmética. Suponemos que el
        // usuario no insertara números negativos.
        Scanner sc = new Scanner(System.in);
        int nums = 0;
        int x = 0;
        int sum = 0;

        while (x != -1) {
            System.out.println("Dame un número: (Escribe -1 cuando quieras terminar)");
            x = sc.nextInt();
            if (x != -1) {
                nums++;
                sum += x;
            }
        }
        
        System.out.println( "La media es : "  + sum + " / " + nums + " = " + sum/nums);

    }
}
