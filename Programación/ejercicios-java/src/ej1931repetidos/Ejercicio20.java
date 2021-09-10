/*20.Realiza un programa que lea desde teclado 9 números. A continuación nos pedirá que
        busquemos un número entre los introducidos, y nos dirá si ha sido encontrado o no. En el
        caso en el que haya sido encontrado, nos indicará cuántas veces se ha introducido. El
        programa nos preguntará si queremos seguir buscando más números o no: “¿Desea
        seguir buscando?(s/n)”.*/

package ej1931repetidos;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int [] numeros = new int[9];
        int numeroBusqueda;
        int contador = 0;
        boolean repetir = true;
        String respuesta;

        //rellenar array
        System.out.println("Relleno de array.");
        for(int i=0; i < numeros.length; i++) {
            System.out.print("Leyendo: ");
            numeros[i] = teclado.nextInt();
            System.out.println("Añadido");
        }

        do {
            System.out.println("Numero a buscar: ");
            numeroBusqueda = teclado.nextInt();

            //recorrer array y compararlo al numero en busqueda
            for(int j=0; j < numeros.length; j++) {
                if(numeros[j] == numeroBusqueda) {contador++;}
            }
            System.out.println(numeroBusqueda+" se ha repetido "+contador+" veces.");

            System.out.println("¿Desea seguir buscando otro numero? (s/n)");
            respuesta = teclado.next();
            if(respuesta.equalsIgnoreCase("s")) {
                contador = 0;
                repetir = true;
            } else if(respuesta.equalsIgnoreCase("n")){
                System.out.println("Saliendo");
                repetir = false;
            }

        } while(repetir);
    }

}
