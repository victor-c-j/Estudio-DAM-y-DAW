package com.example;
import java.util.Scanner;

public class array_funcion {
    public static void main(String[] args) {
        /*
         * Crea un array o arreglo unidimensional donde tu le indiques el tamaño por
         * teclado y crear una función que rellene el array con los múltiplos de un
         * número pedido por teclado.
         * Por ejemplo, si defino un array de tamaño y elijo un 3 en la función, el
         * array contendrá 3,6,9,12,15.
         * Mostrarlos por pantalla usando otra función distinta.
         */
        int size;
        Scanner sc = new Scanner(System.in);
         System.out.println("Dame la dimensión de una array: ");
         size = sc.nextInt();
         int[] a;
         a = rellenar(size);
         show(a);
    }
    public static int[] rellenar(int size) {
        int numBase;
        Scanner sc = new Scanner (System.in);

        System.out.println("Dime el número que quieres usar de base para rellenar el array con sus múltiplos: ");
        numBase = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length;i++) {
            a[i] = numBase * (i+1);
        }
        return a;
    }

    public static void show(int[] a){
        for (int i = 0; i < a.length; i++ ){
            System.out.println(a[0] + " x " + (i+1) + " = " + a[i]);
        }
    }
}
