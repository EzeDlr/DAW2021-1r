package ej0118;
//2. Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
//en el que algún número introducido no se encontrara dentro del rango permitido, se
//mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
//se hayan introducido 11 números válidos y mostrará el número máximo introducido de los
//11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.

import java.util.Scanner;



public class Ejercicio2 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int numerosInvalidos = 0;
        int numerosValidos = 0;
        int numeroMaximo = 0;

        do {
            System.out.print("Escribe numeros entre 20 y 40: ");
            numero = teclado.nextInt();

            //Este while esta dentro del do.
            while (numero < 20 || numero > 40) {
                System.out.print("Numero invalido, escribe numeros entre 20 y 40: ");
                numero = teclado.nextInt();
                numerosInvalidos++;
            }

            numerosValidos++;
            if(numero > numeroMaximo) {
                numeroMaximo = numero;
            }

        } while (numerosValidos < 11);

        System.out.println(numerosInvalidos + " numeros invalidos ");
        System.out.println(numerosValidos + " numeros validos ");
        System.out.println(numeroMaximo + " numero maximo ");
    }
}


