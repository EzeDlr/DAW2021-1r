package ej0118;
//3. Programa que lee de manera consecutiva números hasta que se introducen dos números
//iguales seguidos.
import java.util.Scanner;

public class Ejercicio3tercero {

    public static void main(String[] args) {



        Scanner teclado = new Scanner(System.in);
        int numeroAnterior;
        int numeroActual;
        //Solo un scanner

        /**** REVISAR REPASAR ****/

        System.out.print("Numeros Leyendo: ");
        numeroActual = teclado.nextInt();
        do {
            numeroAnterior = numeroActual;

            System.out.print("Numeros Leyendo: ");
            numeroActual = teclado.nextInt();

        } while (numeroActual != numeroAnterior);
        System.out.print("STOP!");
    }
}
