package com.example;

import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        // https://stackoverflow.com/questions/10873590/using-switch-statement-with-a-range-of-value-in-each-case
        // link for ranged values alternativess

        /*
         * Ejercicio:
         * Hacer un programa que indique la denominación en cuanto a su edad de una
         * persona según los siguientes criterios:
         * 
         * Cuando la edad es menor de 14 años, es un niño.
         * Cuando la edad es de 14 a 22, es un adolescente.
         * Cuando la edad es de 23 a 43, es un joven.
         * Cuando la edad es de 44 a 64, es un adulto joven.
         * Cuando la edad es de 65 a más es un adulto mayor.
         */
        
        System.out.println("Mind telling me your age, pretty please? ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

    }

}