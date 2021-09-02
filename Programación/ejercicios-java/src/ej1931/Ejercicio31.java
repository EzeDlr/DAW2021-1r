//Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
//de 18 elementos. No se permitirán repetidos:
//Menú:
//1.- Introducir número entero.
//2.- Listar números.
//3.- Eliminar número.
//3.- Eliminar todos los números.
//4.- Salir.

package ej1931;

import java.util.*;

public class Ejercicio31 {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(3);
        set.add(1);
        set.add(2);
        set.add(1);



        Scanner teclado = new Scanner(System.in);
        int respuesta;
        int numero;
        String sn = null;


        do {

            System.out.println("Menu: ");
            System.out.println("1-. Introducir numero entero.");
            System.out.println("2-. Listar numeros.");
            System.out.println("3-. Eliminar numero.");
            System.out.println("4-. Eliminar todos los numeros");
            System.out.println("5-. Salir-");

            System.out.print("Elige una opcion: ");
            respuesta = teclado.nextInt();

            if(respuesta == 1) {
                System.out.println("Añadir numero:");
                numero = teclado.nextInt();
                set.add(numero);
                System.out.println("Numero añadido con exito!");
            }

            if(respuesta == 2){
                System.out.println(set);
            }

            if(respuesta == 3) {
                System.out.println(set);
                System.out.println("Eliminar numero: ");
                numero = teclado.nextInt();
                set.remove(numero);
                System.out.println("Numero eliminado");
                System.out.println(set);
            }

            if(respuesta == 4) {
                System.out.println("Se eliminar todos los numeros");
                System.out.println("¿Estas seguro? S/N");
                sn = teclado.next();
                if(sn.equalsIgnoreCase("s")) {
                    set.clear();
                } else {
                    System.out.println("Operacion suspendida");
                }
            }

            if(respuesta == 5) {
                System.out.println("Saliendo");
                return;
            }

        } while(respuesta!=0);

    }

}
