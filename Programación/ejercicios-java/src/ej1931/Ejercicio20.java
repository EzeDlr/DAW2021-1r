package ej1931;


/*20.Realiza un programa que lea desde teclado 9 números. A continuación nos pedirá que
        busquemos un número entre los introducidos, y nos dirá si ha sido encontrado o no. En el
        caso en el que haya sido encontrado, nos indicará cuántas veces se ha introducido. El
        programa nos preguntará si queremos seguir buscando más números o no: “¿Desea
        seguir buscando?(s/n)”.*/

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String args []) {

        Scanner teclado = new Scanner(System.in);
        Scanner buscarRepetido = new Scanner(System.in);

        int[] numeros = new int[9];
        int contador = 0;
        int buscarNumero;

        Scanner tecladoRespuesta = new Scanner(System.in);
        String respuesta = new String();

        do {
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = teclado.nextInt();
                }
                System.out.print("Numero a buscar repetido: ");
                buscarNumero = buscarRepetido.nextInt();
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[j] == buscarNumero)
                        contador++;
                }
                System.out.println("Veces repetido: " + contador);

                System.out.println("Repetir[S/N]");
                respuesta = tecladoRespuesta.next();

        }  while (respuesta.equalsIgnoreCase("S"));
    }

}
