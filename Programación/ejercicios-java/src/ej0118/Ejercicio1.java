package ej0118;
//1. Programa que lee dos números A y B, y nos informa si B es divisor de A o no.

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        Scanner i = new Scanner(System.in);

        System.out.print("Primer numero: ");
        int primer_numero = x.nextInt();
        System.out.print("Segundo numero: ");
        int segundo_numero = i.nextInt();

        if (primer_numero % segundo_numero == 0) {
            System.out.print(segundo_numero + " es divisor de " + primer_numero);
        } else {
            System.out.print(segundo_numero + " no es divisor de " + primer_numero);
        }
    }
}

