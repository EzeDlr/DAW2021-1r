package ej1931;
//31. Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
//de 18 elementos. No se permitirán repetidos:
//Menú:
//1.- Introducir número entero.
//2.- Listar números.
//3.- Eliminar número.
//3.- Eliminar todos los números.
//4.- Salir.

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        List<Integer> lista = new ArrayList<>();

        for(int i=0; i < 10; i++) {
            System.out.println("Escribe un numero entre 0 y 5");
            numero = teclado.nextInt();
            if(numero >= 0 && numero <= 5) {
                lista.add(numero);
            } else {
                System.out.println("Numero fuera de rango");
            }
        }
        System.out.println(lista);

        Set<Integer> set = new HashSet<Integer>(lista);
        for(int i:set) {
            System.out.println(i +" frecuencia: "+ Collections.frequency(lista, i));
        }

    }

}
