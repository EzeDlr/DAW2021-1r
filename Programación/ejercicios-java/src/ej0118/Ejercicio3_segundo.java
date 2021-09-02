package ej0118;
//3. Programa que lee de manera consecutiva números hasta que se introducen dos números
//iguales seguidos.

import java.util.Scanner;
import java.util.SortedSet;

public class Ejercicio3_segundo {

    public static void main (String args []) {

            int numerouno;
            int numerodos;

            Scanner tecladouno = new Scanner(System.in);
            Scanner tecladodos = new Scanner(System.in);

            do {
                System.out.print("Leyendo: ");
                numerouno = tecladouno.nextInt();
                System.out.println(numerouno);
                numerodos = tecladodos.nextInt();
                System.out.println(numerodos);

            } while (numerouno != numerodos);
              System.out.println("Fin.");

    }

}
