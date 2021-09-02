package ej0118;
//Programa que lee 87 números. Al finalizar mostrará el máximo introducido, y cuántas veces
//se repite dicho máximo.

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String args []) {

        Scanner teclado_numeros = new Scanner(System.in);
        int numeros;
        int repetidos = 0;
        int maximo = 0;

        for (int i=0; i <= 5; i++) {
            System.out.print("Leyendo numero: ");
            numeros = teclado_numeros.nextInt();

            if (numeros > maximo) {
                maximo = numeros;
            }
            if (numeros == maximo) {
                repetidos++;
            }
        }

        System.out.println("Numero maximo: " + maximo);
        System.out.println("Veces repetido: " + repetidos);





    }

}
