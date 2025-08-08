package com.example;

public class bucle_bandera {
    public static void main(String[] args) {
        // Muestra por pantalla los números del 1  al 100 (incluidos ) que sean divisibles entre 2 y 3\. Usa un bucle Para.
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        } 
    }
}
