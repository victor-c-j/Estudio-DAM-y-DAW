package com.example.tema1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class arrays_algebra_analisis {
    public static void main(String args[]) {
        /*
         * Pediremos los IDs (números) de alumnos de dos clases, álgebra y análisis.
         * Queremos mostrar a todos los alumnos comunes en las dos asignaturas.
         * Estos alumnos se guardan en un tercer arreglo y que ese sea el que se muestre
         * también indica el número de alumnos que se repiten usar una función para
         * rellenar los arrays (álgebra y análisis).
         * https://stackoverflow.com/questions/14163687/importing-list-from-java-awt-or-
         * java-utils
         * https://docs.oracle.com/javase/1.5.0/docs/api/java/awt/List.html
         * https://www.geeksforgeeks.org/java/difference-between-list-and-arraylist-in-
         * java/
         */
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        int x = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Dame un ID de estudiante para la clase de álgebra " +
                        "(-1 para finalizar, solo se aceptan números enteros no introducidos con anterioridad) ");
                x = sc.nextInt();
                if (!comprobarExistencia(x, a)) {
                    if (x > 0) {
                        a.add(x);
                    } else if (x != -1){
                        System.out.println("El ID debe ser mayor que 0");
                    }
                } else {
                    System.out.println("Ese ID ya fue introducido");
                }
            } catch (NumberFormatException ex) {
                System.out.println("El formato de número introducido no es el correcto");
                sc.next();
            } catch (InputMismatchException ex) {
                System.out.println("Se introdujo un dato que no era un número entero");
                sc.next();
            }
        } while (x != -1);

        do {
            try {
                System.out.println("Ahora un ID para la clase de análisis " +
                        "(-1 para finalizar, solo se aceptan números enteros no introducidos con anterioridad) ");
                x = sc.nextInt();
                if (!comprobarExistencia(x, b)) {
                    if (x > 0) {
                        b.add(x);
                    } else if (x != -1){
                        System.out.println("El ID debe ser mayor que 0");
                    }
                } else {
                    System.out.println("Ese ID ya fue introducido");
                }
            } catch (NumberFormatException ex) {
                System.out.println("El formato de número introducido no es el correcto");
                sc.next();
            } catch (InputMismatchException ex) {
                System.out.println("Se introdujo un dato que no era un número entero");
                sc.next();
            }
        } while (x != -1);

        sc.close();

        for (int z : a) {
            if (comprobarExistencia(z, b) && !comprobarExistencia(z, c)) {
                c.add(z);
            }
        }

        if (!c.isEmpty()) {
            System.out.println("Hay un total de " + c.size() + " estudiantes en ambas clases");
            System.out.println(c.toString());
        } else {
            System.out.println("No hay estudiantes comunes");
        }

    }

    public static boolean comprobarExistencia(int x, ArrayList<Integer> a) {
        for (int z : a) {
            if (z == x) {
                return true;
            }
        }
        return false;
    }
}
