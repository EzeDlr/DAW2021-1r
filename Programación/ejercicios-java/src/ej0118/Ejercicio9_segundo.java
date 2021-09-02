package ej0118;
////9. Programa consistente en un juego en el que el Jugador1 introduce un número entre el 1 y
////el 100 y el Jugador2 tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento
////del Jugador2, y en el caso de no acertar, se mostrará el mensaje “Te pasaste”, o “No
////llegaste”,  según  corresponda.   De   la   misma  manera,  y  al  terminar  el  programa,  se
////mostrarán los mensajes “Acertaste” o bien “Intentos agotados”.

import java.util.Scanner;

public class Ejercicio9_segundo {

    public static void main(String args []) {

        Scanner teclado_jugador1 = new Scanner(System.in);
        Scanner teclado_jugador2 = new Scanner(System.in);

        int jugador1;
        int jugador2;
        int intentos = 0;

        System.out.print("Numero entre 1 y 100: ");
        jugador1 = teclado_jugador1.nextInt();

        if (jugador1 >= 1 && jugador1 <= 100) {

            do {

                System.out.print("Leyendo numero: ");
                jugador2 = teclado_jugador2.nextInt();

                if(jugador2 == jugador1) {
                    System.out.print("Acertaste");
                    return;
                }
                else if(jugador2 < jugador1) {
                    System.out.println("No llegaste");
                    intentos++;
                }
                else if(jugador2 > jugador1) {
                    System.out.println("Te pasaste");
                    intentos++;
                }
                if (intentos == 10) {
                    System.out.println("Intentos agotados");
                }

            } while (intentos < 10);

        } else {
            System.out.print("Tu numero no esta entre el 1 y el 100.");
        }

    }

}
