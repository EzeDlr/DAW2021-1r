//    19. Realiza   un programa  que  lea  desde  teclado  10  números  y posteriormente  muestre
//         solamente los que sean pares.

package ej1931repetidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int [] numeros = new int[9];
        List<Integer> pares = new ArrayList<Integer>();

        //relleno del array
        for(int i=0; i < numeros.length; i++) {
            System.out.println("Leyendo: ");
            numeros[i] = teclado.nextInt();
            System.out.println("Numero añadido.");
        }

        //añadir numeros pares a una lista
        for(int i=0; i < numeros.length; i++) {
            if (numeros[i]%2==0) {
                pares.add(numeros[i]);
            }
        }

        //mostrar la lista de numeros pares
        System.out.println("Numeros pares: ");
        for(int i=0; i < pares.size(); i++) {
            System.out.println(pares.get(i));
        }






    }

}
