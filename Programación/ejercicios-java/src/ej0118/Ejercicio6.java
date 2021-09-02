package ej0118;
//Programa que lee 9 números, y en el caso en el que el primero introducido sea igual al
//último, nos muestra la media. En caso contrario, no se mostrará nada.

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int ultimo_numero;
        int media;
        int contador = 0;

        System.out.print("Leyendo numero: ");
        numero = teclado.nextInt();
        System.out.println(numero + " introducido.");

        do {
            ultimo_numero = numero;
            System.out.print("Leyendo numero: ");
            numero = teclado.nextInt();
            System.out.println(numero + " introducido.");

            contador++;

            if (ultimo_numero == numero) {
                System.out.println("Fin");
                media = (ultimo_numero + numero) / contador;
                System.out.println("Media: " + media);
            }

        } while(contador < 9 && ultimo_numero != numero);
    }
}
