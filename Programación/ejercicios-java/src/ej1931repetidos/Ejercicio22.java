/*22. Realiza un programa que lea desde teclado 10 números sin repetir. Si el usuario introduce
        algún número repetido se le debe notificar, y no ha de ser contabilizado.*/

package ej1931repetidos;

import java.util.*;
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int usuarioInput;
        Set<Integer> numeros = new HashSet<Integer>();


        do {
            System.out.print("Leyendo: ");
            usuarioInput = teclado.nextInt();
            if(numeros.contains(usuarioInput)) {
                System.out.println("Numero repetido");
            } else {
                numeros.add(usuarioInput);
            }

        } while(numeros.size() < 10);
        System.out.println("Tamaño: "+numeros.size());
        System.out.println("Elementos: "+Arrays.toString(numeros.toArray()));
    }

}
