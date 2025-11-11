package com.example.tema1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class examenTema1_eje2 {
    public static void main (String args[]) {

        /* 
     * Realiza un algoritmo que rellene un array con N notas, entre 0 y 10, generadas aleatoriamente,
    siendo N un número pedido al usuario (supondremos que siempre introducirá un número
    entero positivo).
    Una vez relleno, mostrar el contenido del array y, de acuerdo a las notas contenidas, indicar
    cuántos estudiantes son:
    Deficientes 0-3
    Regulares 4-5
    Buenos 6-8
    Excelentes 9-10
    Para generar un número aleatorio entre dos números, usad la función predefinida
    NumeroAleatorio<-Aleatorio(minimo,maximo)
    Ejemplo de ejecución para N=7:

    https://stackoverflow.com/questions/36210263/using-random-number-generator-java
    */
    boolean error = true;
    ArrayList<Integer> a = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    int cantidad = 0;
    int deficientes = 0; 
    int regulares = 0; 
    int buenos = 0; 
    int excelentes = 0;
    Random r = new Random();

    do {
        System.out.println("Dame la cantidad de notas que quieres que genere: ");
        try {
            cantidad = sc.nextInt();
            if (cantidad > 0) {
                error = false;
            }
        } catch (NumberFormatException | InputMismatchException ex){
            System.out.println("Dato introducido no válido, debe ser un número entero positivo");
            sc.next();
        }
    } while (error);

    for (int i = 0; i < cantidad; i++) {
        a.add(r.nextInt(0, 11));
        if (a.get(i) <= 3) {
            deficientes++;
        } else if (a.get(i) <= 5) {
            regulares++;
        } else if (a.get(i) <= 8) {
            buenos++;
        } else {
            excelentes++;
        }
    }
    
    for (int z : a) {
        System.out.println(z);
    }
    System.out.println("Hay " + excelentes + " excelentes.");
    System.out.println("Hay " + buenos + " buenos.");
    System.out.println("Hay " + regulares + " regulares.");
    System.out.println("Hay " + deficientes + " deficientes.");

    }
}
