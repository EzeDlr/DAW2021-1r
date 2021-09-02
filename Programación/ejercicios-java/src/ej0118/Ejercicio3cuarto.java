package ej0118;
//3. Programa que lee de manera consecutiva números hasta que se introducen dos números
//iguales seguidos.

import java.util.Scanner;

public class Ejercicio3cuarto {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int numeroActual;
        int numeroAnterior;

        System.out.print("Leyendo: ");
        numeroActual = teclado.nextInt();


        do {
           numeroAnterior = numeroActual;
           System.out.print("Leyendo: ");
           numeroActual = teclado.nextInt();

           if(numeroAnterior == numeroActual) {
               System.out.print("Numeros iguales, saliendo.");
               return;
           }
        } while(numeroActual != numeroAnterior);
    }

}
