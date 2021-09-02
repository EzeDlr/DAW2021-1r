package ej0118;
//Programa que pide el número de calificaciones a introducir, y una nota de corte. A
//continuación   se   introducirán   las   calificaciones,   para   finalmente   indicar   cuántas
//calificaciones han igualado o superado la nota de corte

import java.util.Scanner;

public class Ejercicio7_segundo {

    public static void main(String args []) {


        int numeroCalificaciones;
        int calificaciones;
        int notaCorte;

        Scanner teclado_numeroCalificaciones = new Scanner(System.in);
        Scanner teclado_calificaciones = new Scanner(System.in);
        Scanner teclado_notaCorte = new Scanner(System.in);

        int superado = 0;
        int igualado = 0;

        System.out.print("¿Cantidad de calificaciones? ");
        numeroCalificaciones = teclado_numeroCalificaciones.nextInt();
        System.out.print("¿Nota de corte? ");
        notaCorte = teclado_notaCorte.nextInt();

        for (int i = 0; i < numeroCalificaciones; i++) {
            System.out.print("Calificacion: ");
            calificaciones = teclado_calificaciones.nextInt();

            if (calificaciones == notaCorte) {
                igualado++;
            } else if (calificaciones > notaCorte) {
                superado++;
            }
        }



        System.out.println(superado + " superaron la nota de corte (" + notaCorte + ")");
        System.out.println(igualado + " igualaron la nota de corte (" + notaCorte + ")");

    }

}
