/*Realiza un programa que cargue desde teclado una tabla bidimensional de 2x3 de números
        enteros. Posteriormente el programa pedirá un número a buscar, y en caso de encontrarlo
        indicará el número de fila y columna donde se ha encontrado por primera vez. El programa
        ofrecerá al usuario la opción de seguir buscando más números:  “¿Desea  seguir
        buscando?(s/n)”.*/

package ej1931;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int [][] matrix = new int[2][3];
        int numero;
        String respuesta = new String();

        for(int i=0; i < 2; i++) {
            for(int j=0; j < 3; j++) {
                System.out.print("Leyendo posicion ["+i+"]"+"["+j+"]: ");
                matrix[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Matrix rellenada");


        do {
            System.out.print("Numero a buscar: ");
            numero = teclado.nextInt();
            for(int i=0; i < 2; i++) {
                for(int j=0; j < 3; j++) {
                    if(matrix[i][j] == numero) {
                        System.out.println(numero+" se encuentra en el indice: ["+i+"]"+"["+j+"]");
                    }
                }
            }

            System.out.print("¿Desea seguir buscando? S/N: ");
            respuesta = teclado.next();
            if(respuesta.equalsIgnoreCase("N")) {
                System.out.print("Saliendo");
                return;
            }

        } while(respuesta.equalsIgnoreCase("S"));

    }

}
