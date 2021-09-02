///*27. Realiza un programa que cargue desde teclado una tabla de enteros de dimensión 3x3. El
//        programa mostrará la columna en la que la suma de sus elementos sea menor.*/

package ej1931;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;

public class Ejercicio27segundo {

    public static void main(String[] args) {

        int [][] matrix = new int [3][3];
        matrix[0][0] = 4;
        matrix[0][1] = 4;
        matrix[0][2] = 4;

        matrix[1][0] = 2;
        matrix[1][1] = 2;
        matrix[1][2] = 2;

        matrix[2][0] = 3;
        matrix[2][1] = 3;
        matrix[2][2] = 3;

        int suma = 0;
        int suma1 = 0;
        int suma2 = 0;

        for(int i=0; i < matrix.length; i++) {
            suma += matrix[0][i];
        }
        for(int i=0; i < matrix.length; i++) {
            suma1 += matrix[1][i];
        }
        for(int i=0; i < matrix.length; i++) {
            suma2 += matrix[2][i];
        }

        int menor = 0;

        menor = suma;
        if(suma1 < menor) {
            menor = suma1;
            System.out.println(menor+" es el mas pequeño.");
        } else if(suma2 < menor) {
            menor = suma2;
            System.out.println(menor+" es el mas pequeño.");
        } else {
            System.out.println(menor+" es el mas pequeño.");
        }

    }

}
