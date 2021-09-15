//7. Programa que pide el número de calificaciones a introducir, y una nota de corte. A
//continuación   se   introducirán   las   calificaciones,   para   finalmente   indicar   cuántas
//calificaciones han igualado o superado la nota de corte.

package ej0118repetidos;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroNotas;
        System.out.print("Numero de notas: ");
        numeroNotas = teclado.nextInt();
        int [] vectorNotas = new int[numeroNotas];
        System.out.println("Se ha creado un vector de "+numeroNotas);

        System.out.print("Nota de corte: ");
        int notaCorte;
        notaCorte = teclado.nextInt();
        System.out.println("La nota de corte es de : "+notaCorte);

        for(int i = 0; i < vectorNotas.length; i++) {
            System.out.print("Leyendo: ");
            vectorNotas[i] = teclado.nextInt();
        }
        System.out.println("Vector completado!");

        int notaIgualada = 0;
        int notaSuperada = 0;
        for(int j=0; j < vectorNotas.length; j++) {
            if(vectorNotas[j] == notaCorte) {
                notaIgualada++;
            }
            if(vectorNotas[j] > notaCorte) {
                notaSuperada++;
            }
        }

        System.out.println("Notas igualadas: "+notaIgualada);
        System.out.println("Notas superadas: "+notaSuperada);

    }

}
