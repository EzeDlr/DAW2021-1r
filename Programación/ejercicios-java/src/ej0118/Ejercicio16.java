package ej0118;
//16. Programa que genera los N primeros números de la serie de Fibonacci. El valor N deberá
//ser leído por el teclado. NOTA: Los dos primeros números son 1, y el resto se obtiene
//sumando los dos anteriores: 1,1,2,3,5,8,13,21..

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String args []) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Leyendo: ");
        int n = teclado.nextInt();
        int n1 = 0;
        int n2 = 1;
        int temporal;

        System.out.println(n1);
        System.out.println(n2);


        while (n1 + n2 <= 80) {
            temporal = n1;
            n1 = n2;
            n2 = temporal + n1;
            System.out.println(n2);
        }


    }

}
