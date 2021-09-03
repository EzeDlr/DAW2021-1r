package poo;

import java.awt.*;
import java.util.Scanner;

public class Pruebas {

    static Scanner teclado = new Scanner(System.in);

    static public class Clase {

        String nombre;
        int cantidad;

        void setNombre (String nombre) {
            this.nombre = nombre;
        }

        void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public String getNombre() {
            System.out.println("Nombre: "+this.nombre);
            return nombre;
        }

        public String toString() {
            System.out.println();
            System.out.println("Cantidad: "+this.cantidad);
            return "Nombre: "+this.nombre;
        }
    }

    public static void main(String[] args) {

        String nombre;
        int cantidad;

        Clase objeto = new Clase();

        System.out.print("Nombre: ");
        nombre = teclado.next();
        objeto.setNombre(nombre);

        System.out.print("Cantidad: ");
        cantidad = teclado.nextInt();
        objeto.setCantidad(cantidad);

        System.out.println();
        System.out.println(objeto);

    }

}
