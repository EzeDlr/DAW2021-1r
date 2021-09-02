package ej0118;
//7. Programa que pide el número de calificaciones a introducir, y una nota de corte. A
//continuación   se   introducirán   las   calificaciones,   para   finalmente   indicar   cuántas
//calificaciones han igualado o superado la nota de corte.

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String args []) {

        Scanner teclado_corte = new Scanner(System.in);
        Scanner teclado_numero_de_calificaciones = new Scanner(System.in);
        Scanner teclado_calificaciones = new Scanner(System.in);

        System.out.print("Introduce la nota de corte: ");
        int nota_corte = teclado_corte.nextInt();

        int igualado = 0;
        int superado = 0;

        System.out.print("Numero de calificaciones: ");
        int numero_de_calificaciones = teclado_numero_de_calificaciones.nextInt();

        for (int i=0; i < numero_de_calificaciones; i++) {
            System.out.print("Calificación: ");
            int calificaciones = teclado_calificaciones.nextInt();

            if (calificaciones == nota_corte) {
                igualado++;
            };
            if (calificaciones > nota_corte) {
                superado++;
            }

        }

        System.out.println("Calificaciónes iguales: " + igualado);
        System.out.print("Calificaciónes superadas: " + superado);
    }

}
