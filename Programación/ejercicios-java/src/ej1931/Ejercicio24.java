package ej1931;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

/*24. Realiza un programa que lea 25 números para posteriormente mostrarlos en orden
        ascendente.*/

public class Ejercicio24 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int input;
        List<Integer> lista = new ArrayList<Integer>();

        for(int i=0; i < 3; i++) {
            System.out.print("Leyendo: ");
            input = teclado.nextInt();
            lista.add(input);
        }

        Collections.sort(lista);
        System.out.print(lista);

    }

}

