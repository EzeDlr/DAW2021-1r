    //Programa que lee 9 números, y en el caso en el que el primero introducido sea igual al
//último, nos muestra la media. En caso contrario, no se mostrará nada.

package ej0118repetidos;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int [] vector = new int [9];
        int suma = 0;

        for(int i=0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }
        System.out.println("Vector completado");

        for(int j=0; j < vector.length; j++) {
            suma = suma + vector[j];
        }
        System.out.println("Suma completada: "+suma);

        int primerNumero = vector[0];
        int ultimoNumero = vector[vector.length - 1];
        int media;

        if(primerNumero == ultimoNumero) {
            media = suma / 9;
            System.out.println(media);
        } else {
            System.out.println("Saliendo");
            return;
        }

    }

}
