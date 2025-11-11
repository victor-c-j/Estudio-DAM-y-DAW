package com.example.tema1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //Crea un array o arreglo unidimensional con un tamaño de 10, 
        // insertar los valores numéricos que le solicitéis al usuario 
        // y muestra por pantalla la media de valores del array
       int[] a = new int[10];
       Scanner sc = new Scanner(System.in);
       int sum = 0;

       for (int i = 0; i < a.length; i++) {
        System.out.println("Dame el " + (i+1) + "º número del array: ");
        a[i] = sc.nextInt();
       }

       for (int x : a) {
        sum += x; 
       }
       System.out.println(sum + " / " + a.length + " = " + sum/a.length);
    }
}