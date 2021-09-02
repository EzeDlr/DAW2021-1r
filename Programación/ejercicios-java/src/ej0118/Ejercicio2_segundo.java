package ej0118;
//1. Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
//en el que algún número introducido no se encontrara dentro del rango permitido, se
//mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
//se hayan introducido 11 números válidos y mostrará el número máximo introducido de los
//11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.

import java.util.Scanner;

public class Ejercicio2_segundo {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int numerosValidos = 0;
        int numerosInvalidos = 0;
        int numeroMaximo = 0;

        do {
            System.out.print("Leyendo numeros entre 11 y 40: ");
            numero = teclado.nextInt();
            while (numero < 11 || numero > 40) {
                System.out.println("Numeros fuera de rango, sigo leyendo.");
                System.out.print("Leyendo numeros entre 11 y 40: ");
                numero = teclado.nextInt();
                numerosInvalidos++;
            }
            numerosValidos++;
            if (numero > numeroMaximo) numeroMaximo = numero;
        } while (numerosValidos < 11);

        System.out.println("Numeros validos: " + numerosValidos);
        System.out.println("Numeros invalidos: " + numerosInvalidos);
        System.out.println("Numeros maximo: " + numeroMaximo);

    }
}
