/*
* 4. Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados.
*
* La clase contendrá los siguientes métodos:
Constructor por defecto.
Constructor con parámetros.
*
Métodos Setters/getters
*
Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar.
* Devuelve true si se ha podido realizar la operación y false en caso contrario.
*
Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado.
* Devuelve true si se ha podido realizar la operación y false en caso contrario.
*
Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.*/

package poo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio4 {

    static public class Libro {

        /*
        * Atributos*/
        private String titulo;
        private String autor;
        private int ejemplares;
        private int prestados;

        public Libro() {};
        public Libro(String titulo, String autor, int ejemplares, int prestados){
            this.titulo = titulo;
            this.autor = autor;
            this.ejemplares = ejemplares;
            this.prestados = prestados;
        }

        /*
        * Metodos setters y getters*/
        public void setTitulo(String titulo){
            this.titulo = titulo;
        }
        public void setAutor(String autor){
            this.autor = autor;
        }
        public void setEjemplares(int ejemplares){
            this.ejemplares = ejemplares;
        }
        public void setPrestados(int prestados){
            this.prestados = prestados;
        }

        public String getTitulo(){
            return titulo;
        }
        public String getAutor(){
            return autor;
        }
        public int getEjemplares(){
            return ejemplares;
        }
        public int getPrestados(){
            return prestados;
        }

        public boolean prestamo(int cantidad){
            boolean prestamo = true;
            if(ejemplares <= 0) {
                prestamo = false;
            } else {
                ejemplares -= cantidad;
                prestados += cantidad;
            }
            return prestamo;
        }

        public boolean devolucion(int cantidad){
            boolean devolucion = true;
            if(prestados > 0) {
                ejemplares += cantidad;
                prestados -= cantidad;
            } else if(prestados == 0) {
                devolucion = false;
            }
            else {
                devolucion = false;
            }
            return devolucion;
        }

        public String toString(){
            return "Titulo: " + getTitulo()+ "\n" +
                    "Autor: " + getAutor()+ "\n" +
                    "Ejemplares: " + getEjemplares()+ "\n" +
                    "Prestados: " + getPrestados()+ "\n";
        }
    }

    public static void main(String[] args) {

        //relleno del constructor por defecto, vacío.
        Scanner teclado = new Scanner(System.in);
        String autor, titulo;
        int ejemplares, prestados;

        System.out.print("Titulo: ");
        titulo = teclado.nextLine();
        System.out.print("Autor: ");
        autor = teclado.nextLine();
        System.out.print("Ejemplares: "); //9 ejemplares
        ejemplares = teclado.nextInt();
        System.out.print("Prestados: ");
        prestados = teclado.nextInt();

        Libro objeto1 = new Libro();
        objeto1.setAutor(autor);
        objeto1.setPrestados(prestados);
        objeto1.setEjemplares(ejemplares);
        objeto1.setTitulo(titulo);

        System.out.println();
        System.out.println(objeto1);

        //devolucion de 2 libros del objeto 1
        objeto1.devolucion(2);
        System.out.println("Se han devuelto 2 libros, los ejemplares deberian de subir de cantidad.");
        System.out.println();
        System.out.println(objeto1);

        //prestamo de dos libros del objeto 1
        objeto1.prestamo(2);
        System.out.println("se han tomado prestado 2 libros, los ejemplares deberian de bajar de cantidad y los prestados subir");
        System.out.println();
        System.out.println(objeto1);
        System.out.println();

    /*****************************************************************************************************************************************/

        //relleno del constructor formado por parametros
        Libro objeto2 = new Libro("Un mundo feliz", "Aldous Huxley", 0, 1);
        System.out.println(objeto2);
        System.out.println();

        //devolucion de 1 libro del objeto 2
        objeto2.devolucion(1);
        System.out.println("Se ha devuelto 1 libro, los ejemplares deberian de subir y los prestados bajar");
        System.out.println(objeto2);

        //el numero de libros prestados es 0, por lo tanto no puedes devolver libros que no hayan sido prestados, es decir, 0.
        objeto2.devolucion(2);
        System.out.println(objeto2);

        //prestamo del unico ejemplar del libro que hay
        objeto2.prestamo(1);
        System.out.println(objeto2);
    }




}
