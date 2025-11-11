package com.example.tema1;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class eje2 {
    public static void main(String[] args) {
        // Ejercicio 2: Haz un algoritmo que nos calcule y muestre la suma de los n
        // primero números naturales.
        // N se leerá por teclado. Por ejemplo, para N=5,
        // el algoritmo realizará el cálculo 1+2+3+4+5 y mostrará el resultado 15\.
        Random random = new Random();
        int x = random.nextInt(20);
        int res = 0;

        System.out.println("random number: " + x);

        for (int i = 1; i <= x; i++) {
            res = res + i;
            if (i != x) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
        }
        System.out.print(res);

        // hazme la equivalencia del ejercicio anterior pero usando un bucle mientras,
        // tienes que hacer exactamente lo mismo, sino , no seria equivalente:
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Equivalencia en while : ");
        int i = 1;
        res = 0;
        
        while (i <= x) {
            res = res + i;
            if (i != x) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
            i++;
        }
        System.out.print(res);

    }
}
