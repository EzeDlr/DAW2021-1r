package ej0118;
//4. Programa que muestra todos los divisores de un número introducido. Entre los divisores no
//se incluirá el propio número

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String args []) {

        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Numero: ");
        n = teclado.nextInt();

        for (int i = 1; i <= n/2; i++) {
            if(n%i==0) {
                System.out.println(i + " es divisor de " + n);
            }
        }
    }

}
