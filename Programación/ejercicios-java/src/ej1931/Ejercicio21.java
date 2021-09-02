package ej1931;


/*21. Realiza un programa que lea desde teclado 11 números enteros, para posteriormente
        mostrarlos en el orden inverso al que fueron introducidos*/

import java.util.Scanner;

public class Ejercicio21 {

    public static void main (String args []) {

        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int[3];



        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }

        for(int j = numeros.length - 1; j >= 0; j--) {
            System.out.print(numeros[j]+" ");
        }


    }

}
