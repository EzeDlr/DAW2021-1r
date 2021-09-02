package ej0118;
//Programa que lee 9 números, y en el caso en el que el primero introducido sea igual al
//último, nos muestra la media. En caso contrario, no se mostrará nada.

import java.util.Scanner;

public class Ejercicio6_tercero {
                //Ejercicio6Tercero

    public static void main(String args []) {

        Scanner teclado_primerNumero = new Scanner(System.in);

        int[] numeros = new int[9];
        int sum = 0;


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Leyendo numero: ");
            numeros[i] = teclado_primerNumero.nextInt();
        }


        //Suma de los numeros dentro del array para luego poder calcular la media.
        for (int i : numeros) {
            sum += i;
        }

        if (numeros[0] == numeros[8]) {
            int media;
            media = sum / numeros.length;
            System.out.print(media);
        } else {
            System.out.print("Fin.");
        }
    }

}
