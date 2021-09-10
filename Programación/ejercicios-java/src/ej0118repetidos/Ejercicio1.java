/*
Programa que lee dos números A y B, y nos informa si B es divisor de A o no.
*/

package ej0118repetidos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroA;
        int numeroB;

        System.out.println("Leyendo numero A: ");
        numeroA = teclado.nextInt();
        System.out.println("Leyendo numero B: ");
        numeroB = teclado.nextInt();

        if(numeroA%numeroB == 0) {
            System.out.println(numeroB+" es divisor de "+numeroA);
        } else {
            System.out.println("No es divisor");
            return;
        }

    }

}
