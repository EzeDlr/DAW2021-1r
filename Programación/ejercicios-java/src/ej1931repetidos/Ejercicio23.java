/*23. Realiza un programa que lea desde teclado 12 números y posteriormente los muestre. Los
        números que estuvieran repetidos solo se deben mostrar una vez*/

package ej1931repetidos;

import java.util.Scanner;
import java.util.*;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int [] vector = new int [11];

        for(int i=0; i < vector.length; i++){
            System.out.print("Leyendo: ");
            vector[i] = teclado.nextInt();
        }
        System.out.println("Vector completado");

        //creas una coleccion de tipo set, que por ahora esta vacia.
        Set<Integer> numeros = new HashSet(Arrays.asList(vector)); //dentro de la coleccion antes creada conviertes el vector a una
                                                        //lista con valores no repetidos.

    }

}
