package com.example;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Ejercicio 1: Algoritmo que lea tres números distintos y nos diga cuál de ellos es mayor.
        //https://www.digitalocean.com/community/tutorials/java-random Random usage
        Random random = new Random();
        int x = random.nextInt(101);
        int y = random.nextInt(101);
        double z = random.nextDouble(101);

        System.out.println("X: " + x + " , Y: " + y + ", Z: " + z);

        if ( x > y  && x > z) {
            System.out.println("El mayor es: " + x);
        } else if (y > x && y > z) {
            System.out.println("El mayor es: " + y);
        } else if (z > x && z > y ) {
            System.out.println("El mayor es: " + z);
        } else if (x == y && x == z) {
            System.out.println("Todos iguales: " + x + ", " + y + " " + z);
        } else if (x == y && x != z) {
            System.out.println("X e Y Mayores que Z: " + x + ", " + y + ", " + z);
        } else if (x == z && x != y) {
            System.out.println("X y Z Mayores que Y: " + x + ", " + y + ", " + z);
        } else if (y == z && y != x) {
            System.out.println("Y y Z Mayores que x: " + x + ", " + y + ", " + z);
        }
    }
}
