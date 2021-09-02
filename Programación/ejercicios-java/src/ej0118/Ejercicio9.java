package ej0118;//Programa consistente en un juego en el que el Jugador1 introduce un número entre el 1 y
//el 100 y el Jugador2 tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento
//del Jugador2, y en el caso de no acertar, se mostrará el mensaje “Te pasaste”, o “No
//llegaste”,  según  corresponda.   De   la   misma  manera,  y  al  terminar  el  programa,  se
//mostrarán los mensajes “Acertaste” o bien “Intentos agotados”.

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String args[]) {

        Scanner teclado_Jugador1_numeros = new Scanner(System.in);
        Scanner teclado_Jugador2 = new Scanner(System.in);

        System.out.print("Jugador 1 elige un numero entre el 1 y el 100: ");
        int Jugador1_numeros = teclado_Jugador1_numeros.nextInt();
        int intentos = 0;

        if (Jugador1_numeros < 1 || Jugador1_numeros > 100) {
            System.out.print("Error");
            return;
        }

        do {
            System.out.print("Jugador 2 elige tu opcion: ");
            int Jugador2 = teclado_Jugador2.nextInt();
            if (Jugador1_numeros == Jugador2) {
                System.out.println("Acertaste");
                return;
            } if (Jugador2 > Jugador1_numeros) {
                System.out.println("Te pasaste");
                intentos++;
            } if (Jugador2 < Jugador1_numeros) {
                System.out.println("No llegaste");
                intentos++;
            } if (intentos == 10) {
                System.out.println("Intentos agotados");
                return;
            }

        } while (intentos < 10);
    }
}
