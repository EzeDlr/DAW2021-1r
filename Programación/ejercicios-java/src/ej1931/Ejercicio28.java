package ej1931;
/*
28. Realiza un programa que cargue una tabla de 5 filas y 7 columnas con los siguientes
        números, para finalmente mostrarla:*/

import java.util.SortedMap;

public class Ejercicio28 {

    public static void main(String[] args) {

        int[][] matrix = new int[5][7];
        int contador = 35;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = contador;
                contador--;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }
}