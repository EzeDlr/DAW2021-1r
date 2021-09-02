package ej0118;
//14. Programa que lee una secuencia de 10 números y muestra el mayor de los múltiplos de 5,
//y el menor de los múltiplos de 3. Si no hubiera ningún múltiplo, el programa lo indicaría.

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        int lista[] = new int[10];
        int maximo = 0;
        int minimo = 0;
        boolean mul5 = false;
        boolean mul3 = false;

        for (int i = 1; i < lista.length; i++) {
            System.out.print("Leyendo: ");
            lista[i] = teclado.nextInt();

                if(lista[i] % 5 == 0) {
                    mul5 = true;
                    if(lista[i] > maximo) {
                        maximo = lista[i];
                    }
                }
                if(lista[i] % 3 == 0) {
                    mul3 = true;
                    if(lista[i] < maximo) {
                        minimo = lista[i];
                    }
                }

            }

            if(mul3 == false && mul5 == false) {
                System.out.print("No hay multiplos");
            }
            else {
                System.out.println("Maximo de los multiplos de 5: " + maximo);
                System.out.print("Minimo de los multiplos de 3: " + minimo);
            }
        }

    }

