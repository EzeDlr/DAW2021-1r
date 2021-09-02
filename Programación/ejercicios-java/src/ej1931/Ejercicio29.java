/*29. Realiza un programa que muestre 10 números aleatorios enteros sin repetir de entre el 1 y
        el 100, ambos inclusive.*/

package ej1931;

public class Ejercicio29 {

    public static void main(String[] args) {

        int a = (int) (Math.random()*100);

        for(int i=0; i < 10; i++) {
            System.out.println((int) (Math.random()*100));
        }
    }

}
