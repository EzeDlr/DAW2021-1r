package ej0118;
////8.Programa que lee 87 números. Al finalizar mostrará el máximo introducido, y cuántas veces
////se repite dicho máximo.

import java.util.Scanner;

public class Ejercicio8_segundo {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int numeroMaximo;
        int contador = 1;


        System.out.print("Leyendo: ");
        numero = teclado.nextInt();
        numeroMaximo = numero;

        for (int i = 0; i < 5; i++) {
            System.out.print("Leyendo: ");
            numero = teclado.nextInt();

            if(numero > numeroMaximo) {
                System.out.println(numero+" es mayor que "+numeroMaximo);
                numeroMaximo = numero;
                System.out.println(numeroMaximo);
            } else if(numero < numeroMaximo) {
                System.out.println(numero+" es menor que "+numeroMaximo);
            } else {
                contador++;
            }

        }

        System.out.println("Numero maximo: " + numeroMaximo);
        System.out.print("Veces repetido: " + contador);


    }
}
