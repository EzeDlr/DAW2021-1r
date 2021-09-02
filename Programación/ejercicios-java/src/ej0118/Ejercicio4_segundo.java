package ej0118;
//4. Programa que muestra todos los divisores de un número introducido. Entre los divisores no
//se incluirá el propio número

import java.util.Scanner;

public class Ejercicio4_segundo {

    public static void main (String args []) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero para saber sus divisores: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero/2; i++) {
            if (numero%i==0) {
                System.out.println(i + " es divisor de " + numero);
            }
        }

    }

}
