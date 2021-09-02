package ej0118;
//3. Programa que lee de manera consecutiva números hasta que se introducen dos números
//iguales seguidos.
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        int numeroUno;
        int numeroDos;

        do {
            System.out.print("Primero numero: ");
            numeroUno = teclado.nextInt();
            System.out.print("Segundo numero: ");
            numeroDos = teclado2.nextInt();

            if (numeroUno != numeroDos) {
                System.out.println("Numeros diferentes, se repetira");
            }

        } while (numeroUno != numeroDos);
        System.out.print("Numeros iguales, Fin.");
    }
}