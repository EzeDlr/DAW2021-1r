package ej0118;
//11. Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
//        como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y
//        el nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el
//        año de nacimiento.

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombre = new String();
        Integer fecha;

        Map<String, Integer> map = new HashMap<String, Integer>();

        int numeroAlumnos;
        System.out.print("Cantidad de alumnos: ");
        numeroAlumnos = teclado.nextInt();
        int[] alumnos = new int[numeroAlumnos];

        for (int i = 0; i < alumnos.length; i++) {
                System.out.print("Leyendo nombre: ");
                nombre = teclado.next();

                if (nombre.equalsIgnoreCase("fin")) {

                    int suma = 0;
                    for (int j : map.values()) {
                        suma += j;
                    }

                    int media;
                    media = (suma / alumnos.length);

                    int fechaMenor;
                    String nombreMenor = new String();

                    fechaMenor = Collections.min(map.values());

                    for (Map.Entry<String, Integer> z : map.entrySet()) {
                        if (z.getValue() == fechaMenor) {
                            nombreMenor = z.getKey();
                        }
                    };

                    System.out.println("Media de edad: "+media);
                    System.out.println("Alumno menor: "+nombreMenor);
                    System.out.println("Año de nacimiento menor: " + fechaMenor);
                    System.out.println("Saliendo");
                    return;
                }

                System.out.print("Leyendo fecha: ");
                fecha = teclado.nextInt();
                map.put(nombre, fecha);

        }

        }
    }

