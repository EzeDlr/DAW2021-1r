package ej0118;
//5. Programa que nos informa si un número introducido es primo o no

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Numero para saber si es primo o no: ");
        int numero = teclado.nextInt();

        if (numero % numero == 0 && numero % 1 == 0) {
                System.out.print(numero + " es primo.");
            } else {
                System.out.print(numero + " no es primo. ");
            }
        }
    }

