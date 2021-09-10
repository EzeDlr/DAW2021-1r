//3. Programa que lee de manera consecutiva números hasta que se introducen dos números
//iguales seguidos.

package ej0118repetidos;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroActual;
        int numeroAnterior;

        System.out.println("Leyendo: ");
        numeroActual = teclado.nextInt();

        do {
            numeroAnterior = numeroActual;
            System.out.println("Leyendo: ");
            numeroActual = teclado.nextInt();

            if(numeroAnterior == numeroActual) {return;}
        } while(numeroActual != numeroAnterior);

    }

}
