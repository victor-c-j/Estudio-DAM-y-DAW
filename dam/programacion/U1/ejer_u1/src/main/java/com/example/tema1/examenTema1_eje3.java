package com.example.tema1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class examenTema1_eje3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        /*
         * Realizar un algoritmo para simular un juego de adivinar un número, en el que
         * el usuario
         * introduce números y se le va indicando si es menor o mayor que el correcto
         * hasta que acierte.
         * Tendremos guardado en una variable el valor que nosotros queramos como número
         * a acertar.
         * Este número será un entero entre 1 y 100.
         * Tendremos que crear y usar las siguientes funciones:
         * leerNumero(): Solicita un número al usuario y hasta que éste no escriba un
         * valor entre 1 y 100,
         * vuelve a pedir el número. La función devuelve como salida el número
         * resultante.
         * comprobarValor(numeroUsuario, numeroCorrecto): comprueba si el número es el
         * correcto y
         * devuelve un número que puede ser: 0 si los dos números son iguales, 1 si el
         * numeroUsuario es
         * mayor que el numeroCorrecto, ó -1 si el numeroUsuario es menor que el
         * numeroCorrecto
         * Según lo que devuelva la función comprobarValor, se mostrará un mensaje
         * indicando si se ha
         * acertado el número, si el número introducido es mayor que el número buscado,
         * o si es menor.
         * El juego continuará hasta que el usuario acierte el número.
         * Ejemplo de ejecución para numeroCorrecto = 45:
         */
        int comprobador;
        Random r = new Random();
        int z = r.nextInt(1, 101);

        do {
            int x = leerNumero();
            switch (comprobador = comprobarNúmero(x, z)) {
                case 1:
                    System.out.println("El número que has introducido es mayor, prueba de nuevo.");
                    break;

                case -1:
                    System.out.println("El número que has introducido es menor, prueba de nuevo.");
                    break;

                case 0:
                    System.out.println("¡Has acertado!");
                    break;
            }
        } while (comprobador != 0);

    }

    public static int comprobarNúmero(int x, int z) {
        if (x < z) {
            return -1;
        } else if (x == z) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int leerNumero() {
        int y = -1;
        do {
            System.out.println("Dame un número entre 1 y 100");
            try {
                y = sc.nextInt();
            } catch (NumberFormatException | InputMismatchException e) {
                y = -1;
                sc.next();
            }
        } while (!(y >= 1 && y <= 100));

        return y;
    }
}
