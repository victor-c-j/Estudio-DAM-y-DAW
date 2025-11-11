package com.example.tema1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class entradas {
    /*Realice un algoritmo que determine el pago a realizar por las entradas de un espectáculo donde se pueden 
    comprar sólo hasta cuatro entradas y cada una cuesta 15, sabiendo que al costo de dos entradas se les descuenta 
    el 10% del total, al de tres entradas el 15% y a la compra de cuatro entradas se le descuenta el 20%.  
    /*El número de entradas a comprar se le solicitará al usuario, y se comprobará que ha introducido un número correcto,
     volviéndoselo a pedir en caso contrario.
     */
    public static void main (String args[]) {
        final int precio = 15;
        int nEntradas;
        double res;
        Scanner sc = new Scanner(System.in);
        do{
        try {
            System.out.println("Número de entradas a comprar (máximo de 4): ");
            nEntradas = sc.nextInt();
        } catch (InputMismatchException | NumberFormatException ex) {
            sc.next();
            System.out.println("Error, debe introducir un número entero con formato válido y que esté entre 1 y 4");
            nEntradas = -1;
        }
        } while (!(nEntradas >=1 && nEntradas <=4));
        sc.close();
        res = (nEntradas * precio);
        switch (nEntradas) {
            case 2:
            res = res - (res * 0.10);
            break;
            case 3:
            res = res - (res * 0.15);
            break;
            case 4:
            res = res - (res * 0.20);
            break;
        }
        System.out.println("El precio total por " + nEntradas + " es de " + res);
    }
}
