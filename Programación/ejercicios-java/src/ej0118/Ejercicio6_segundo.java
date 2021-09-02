package ej0118;
//Programa que lee 9 números, y en el caso en el que el primero introducido sea igual al
//último, nos muestra la media. En caso contrario, no se mostrará nada.
import java.util.Scanner;


public class Ejercicio6_segundo {

    public static void main(String args []) {

        Scanner teclado = new Scanner(System.in);
        int lista[] = new int[9];

        for (int i = 0; i < 9; i++) {
            System.out.print("Introduce numero: ");
            lista[i] = teclado.nextInt();

            if (lista[0] == lista[8]) {
                int media = lista.length / i;
                System.out.print(media);
            }

        }
        System.out.print("Fin.");
    }
}
