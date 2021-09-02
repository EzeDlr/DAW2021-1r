package ej0118;
//2. Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
//en el que algún número introducido no se encontrara dentro del rango permitido, se
//mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
//se hayan introducido 11 números válidos y mostrará el número máximo introducido de los
//11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.

import java.util.Scanner;

public class Ejercicio2_tercero {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int numeros = 0;
        int numeroMaximo = 0;
        int numeroMinimo = 20;
        int numeroValido = 0;
        int numeroInvalido = 0;

        do {
            System.out.print("Leyendo numero entre 20 y 40: ");
            numeros = teclado.nextInt();
            while (numeros < 20 || numeros > 40) {
                System.out.print("Numero fuera de rango, sigo leyendo un numero entre 20 y 40: ");
                numeros = teclado.nextInt();
                numeroInvalido++;
            }

            System.out.println("Numero valido!");
            numeroValido++;

            if(numeros > numeroMaximo) {
                numeroMaximo = numeros;
            }

            //REVISAR PARA SACAR NUMERO MINIMO.
            if(numeros >= numeroMinimo) {
                numeroMinimo = numeros;
            }

        } while (numeroValido != 11);

        System.out.println("Numero maximo: "+numeroMaximo);
        System.out.println("Numero minimo: "+numeroMinimo);
        System.out.print("Numeros invalidos: "+numeroInvalido);

    }
}
