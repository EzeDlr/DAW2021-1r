package ej1931;


//19. Realiza   un programa  que  lea  desde  teclado  10  números  y posteriormente  muestre
//                solamente los que sean pares.


import java.util.Scanner;

public class Ejercicio19_segundo {

    public static void main(String args []) {

        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int [10];

        for(int i=0; i < numeros.length; i++) {
            System.out.print("Leyendo: ");
            numeros[i] = teclado.nextInt();
        }

        for(int j:numeros) {
            if(numeros[j]%2==0) {
                System.out.println(numeros[j] + " es numero par.");
            }
        }

    }

}
