package ej0118;
//6. Programa que lee 9 números, y en el caso en el que el primero introducido sea igual al
//último, nos muestra la media. En caso contrario, no se mostrará nada.

import java.util.Scanner;

public class Ejercicio6cuarto {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int[9];
        int sum = 0;
        int media;


        for(int i=0; i < numeros.length; i++) {
            System.out.print("Leyendo " + i + ": ");
            numeros[i] = teclado.nextInt();
        }

        for(int z:numeros) {
            sum += z;
        }

        if(numeros[0]==numeros[8]) {
            media = sum / 9;
            System.out.println("Media: "+media);
        }

        System.out.println("Saliendo.");
        System.out.print(sum);
    }
}
