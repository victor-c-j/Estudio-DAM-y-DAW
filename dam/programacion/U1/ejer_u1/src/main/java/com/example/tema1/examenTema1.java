package com.example.tema1;

public class examenTema1 {
    public static void main (String args[]) {
        /*
        Ejercicio 1: Reloj Digital
        Realiza el algoritmo para simular un reloj que nunca se pare. Debe mostrar la hora en formato
        00:00:00 (hora:minuto:segundo). Por ejemplo, 05:37:09 corresponde a las 5 horas, 37 minutos
        y 9 segundos.
        También debes hacer que espere un segundo real para darle más realismo. Para ello, usa la
        siguiente instrucción: Esperar 1 segundos
        Mostrará la hora una vez por segundo, comenzando por las 23:59:59.
        
        Formateo de números para hacer que el reloj quede mejor:
        We want to pad the numbers.
        https://coderanch.com/t/422920/java/Display-integer-digit
        https://stackoverflow.com/questions/473282/how-can-i-pad-an-integer-with-zeros-on-the-left
        https://www.baeldung.com/java-number-formatting
        */

        int hora = 23;
        int min = 59;
        int sec = 57;

        for (;;){
            System.out.println(String.format("%02d", hora)+" : "
            + String.format("%02d", min)+" : "+String.format("%02d", sec));
            sec+=1;
            if (sec == 60) {
                sec = 0;
                min += 1;
                if (min == 60) {
                    min = 0;
                    hora += 1;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
            
        }
    }
}
