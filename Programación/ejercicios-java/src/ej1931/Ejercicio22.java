package ej1931;
import java.util.*;
/*22. Realiza un programa que lea desde teclado 10 números sin repetir. Si el usuario introduce
        algún número repetido se le debe notificar, y no ha de ser contabilizado.*/

/*
https://www.it-swarm-es.com/es/java/como-eliminar-eficientemente-duplicados-de-una-matriz-sin-usar-set/1040636450/
*/

/*IMPORTANTE REPASAR*/


public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int usuarioInput;
        int contador = 1;
        int incorrectos = 0;

        Set<Integer> numeros = new HashSet<Integer>();

        System.out.print("Leyendo "+contador+": ");
        usuarioInput = teclado.nextInt();

        while(numeros.size() <= 10) {
            if(numeros.contains(usuarioInput)) {
                System.out.println("Hay numeros repetidos. Este numero no se ha contabilizado.");
                incorrectos++;
            }
            numeros.add(usuarioInput);

            if(numeros.size() == 10) {
                System.out.println("Ya se han leido 10 numeros.");
                break;
            }

            System.out.print("Leyendo "+(contador+1)+": ");
            usuarioInput = teclado.nextInt();
            contador++;

        }

        Iterator<Integer> iterador = numeros.iterator();
        while(iterador.hasNext()) {
            System.out.println("Numero: " +iterador.next());
        }

        System.out.print("Cantidad de numeros repetidos: "+incorrectos);

    }
}


