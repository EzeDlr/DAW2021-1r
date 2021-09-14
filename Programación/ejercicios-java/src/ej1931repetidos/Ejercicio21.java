/*21. Realiza un programa que lea desde teclado 11 números enteros, para posteriormente
        mostrarlos en el orden inverso al que fueron introducidos*/

package ej1931repetidos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int [3];

        for(int i=0; i < numeros.length; i++) {
            System.out.print("Leyendo numero "+i+": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println();
        System.out.println(Arrays.toString(numeros));

        for(int j = numeros.length - 1; j >= 0; j--) {
            System.out.println(numeros[j]);
        }
    }

}
