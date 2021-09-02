package ej1931;


/*20.Realiza un programa que lea desde teclado 9 números. A continuación nos pedirá que
        busquemos un número entre los introducidos, y nos dirá si ha sido encontrado o no. En el
        caso en el que haya sido encontrado, nos indicará cuántas veces se ha introducido. El
        programa nos preguntará si queremos seguir buscando más números o no: “¿Desea
        seguir buscando?(s/n)”.*/

import java.util.Scanner;

public class Ejercicio20segundo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[9];
        int numeroBusqueda;
        int contador = 0;
        String seguirBuscandoRespuesta = null;
        boolean booleanoSeguirBuscando = true;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Rellene el vector "+(i+1)+": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Vector completado!");
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");

        do {
                System.out.print("Numero a buscar repetido: ");
                numeroBusqueda = teclado.nextInt();

                for(int i=0; i < numeros.length; i++) {
                    if(numeros[i] == numeroBusqueda) {
                        contador++;
                    }
                }

                if(contador != 0) {
                    System.out.println("Hay numeros repetidos.");
                    System.out.println(numeroBusqueda + " se ha repetido " + contador + " veces.");

                    System.out.print("¿Desea buscar otro numero repetido? S/N ");
                    seguirBuscandoRespuesta = teclado.next();

                    if(seguirBuscandoRespuesta.equalsIgnoreCase("s")) {
                        contador = 0;
                    } else if(seguirBuscandoRespuesta.equalsIgnoreCase("n")) {
                        System.out.print("Saliendo.");
                        booleanoSeguirBuscando = false;
                    }
                }
            } while (booleanoSeguirBuscando);

        }


        }



