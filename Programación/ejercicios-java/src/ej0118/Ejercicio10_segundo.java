package ej0118;
////10. Programa que lee 10 números e indica si todos los números son iguales o no.

import java.util.Scanner;

public class Ejercicio10_segundo {

    public static void main(String args[]) {

        Scanner teclado_numeros = new Scanner(System.in);

        int numeros[] = new int[10];
        boolean iguales = true;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Leyendo numero: ");
            numeros[i] = teclado_numeros.nextInt();
            if(numeros[0] != numeros[i]){
                System.out.print("No todos los numeros son iguales");
                return;
            }

        }
        System.out.print("Todos los numeros son iguales." +
                "");
    }
}
