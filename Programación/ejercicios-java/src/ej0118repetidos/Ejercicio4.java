//4. Programa que muestra todos los divisores de un número introducido. Entre los divisores no
//se incluirá el propio número

package ej0118repetidos;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Numero: ");
        numero = teclado.nextInt();

        System.out.println("Mostrando todos los divisores de "+numero);
        for(int i = 1; i < numero; i++) {
            if(numero%i == 0) {
                System.out.println(i);
            }
        }

    }

}
