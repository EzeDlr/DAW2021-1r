/*23. Realiza un programa que lea desde teclado 12 números y posteriormente los muestre. Los
        números que estuvieran repetidos solo se deben mostrar una vez*/

package ej1931;
import java.util.*;
import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Integer [] vector = new Integer[12];

        for(int i=0; i < vector.length; i++) {
            System.out.print("Leyendo "+i+": ");
            vector[i] = teclado.nextInt();
        }

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(vector));

        Iterator<Integer> iterador = set.iterator();
        while(iterador.hasNext()) {
            System.out.println("Numero: "+iterador.next());
        }

    }

}
