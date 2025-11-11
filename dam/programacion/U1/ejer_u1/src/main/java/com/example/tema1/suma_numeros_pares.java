package com.example.tema1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class suma_numeros_pares {
    public static void main(String[] args) {
        /*
         * Se pide representar al algoritmo que nos calcule la suma de los N primeros
         * números pares.
         * Es decir, si insertamos un 5, nos haga la suma de 2 \+4+6+8+10.
         * About the scanner: https://stackoverflow.com/questions/32305011/why-doesnt-scanner-ask-for-an-other-input-in-a-try-catch-while-loop-java
         * 
         */
        Scanner sc = new Scanner(System.in);
        int x, y;
        int res = 0;
        do {
            try {
                System.out.println("Calcular la suma de N números pares (introduce la cantidad): ");
                x = sc.nextInt();
            } catch (NumberFormatException | InputMismatchException ex) {
                x = -1;
                System.out.println("Debes introducir un número y que este sea un entero positivo");
                sc.next();
            }
        } while (!( x > 0) );
        y = 2;
        for (int i = 0; i < x; i++) {
            if (i == 0) {
                System.out.print(y);
            } else if (i == x-1){
                System.out.print(" + " + y + " = ");
            } else {
                System.out.print(" + " + y);
            }
            res += y;
            y +=2;
        }
        System.out.println(" " + res);
    }
}
