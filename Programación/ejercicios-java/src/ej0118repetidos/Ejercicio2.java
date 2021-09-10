//2. Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
//en el que algún número introducido no se encontrara dentro del rango permitido, se
//mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
//se hayan introducido 11 números válidos y mostrará el número máximo introducido de los
//11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.

package ej0118repetidos;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int numerosValidos = 0;
        int numeroMaximo = 0;
        int numerosInvalidos = 0;



        do {
            System.out.print("Leyendo numero: ");
            numero = teclado.nextInt();
            //este while es utilizado para ir en caso de error, pues la lectura del numero se hace arriba en el do.
            while(numero < 20 || numero > 40) {
                System.out.println("Numero fuera de rango.");
                numerosInvalidos++;
                break;
            }
            numerosValidos++;

            //chequear numero maximo
            if(numero > numeroMaximo) {
                numeroMaximo = numero;
            }

        } while(numerosValidos <= 11);

        System.out.println("Numeros invalidos: "+numerosInvalidos);
        System.out.println("Numero maximo: "+numeroMaximo);

    }

}
