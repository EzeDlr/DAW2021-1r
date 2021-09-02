package ej0118;
//15. Programa que lee un número y muestra la suma de sus divisores, sin incluir el propio
//número entre sus divisores.

import java.util.Scanner;

public class Ejercicio15 {

    public static void main (String args []) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Leyendo: ");
        int numero = teclado.nextInt();
        int suma = 0;

        for(int i = 1; i < numero; i++) {
            if(numero % i == 0) {
                System.out.println(i);
                suma = suma + i;
            }
        }
        System.out.println("Suma de los divisores: " + suma);
    }

}
