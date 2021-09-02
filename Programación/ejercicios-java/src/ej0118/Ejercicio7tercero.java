package ej0118;
//7. Programa que pide el número de calificaciones a introducir, y una nota de corte. A
//continuación   se   introducirán   las   calificaciones,   para   finalmente   indicar   cuántas
//calificaciones han igualado o superado la nota de corte

import java.util.Scanner;

public class Ejercicio7tercero {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.print("Cantidad de calificaciones: ");
        int numeroCalificaciones = teclado.nextInt();
        int [] calificaciones = new int[numeroCalificaciones];

        System.out.println("Leyendo nota de corte: ");
        int notaCorte = teclado.nextInt();

        int notaSuperada = 0;
        int notaIgualada = 0;

        for(int i=0; i < calificaciones.length; i++) {
            System.out.print("Leyendo calificacion: ");
            calificaciones[i] = teclado.nextInt();
                if(calificaciones[i] > notaCorte) notaSuperada++;
                if(calificaciones[i] == notaCorte) notaIgualada++;
        } System.out.println("Calificaciones completadas");

        System.out.println("Notas que han superado la nota de corte: "+notaSuperada);
        System.out.print("Notas que han igualado a la nota de corte: "+notaIgualada);



    }

}
