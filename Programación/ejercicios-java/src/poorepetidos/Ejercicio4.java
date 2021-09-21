/*
* 4. Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, 
número de ejemplares del libro y número de ejemplares prestados.
*
* La clase contendrá los siguientes métodos:
Constructor por defecto.
Constructor con parámetros.
*
Métodos Setters/getters
*
Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden 
ejemplares disponibles para prestar.
* Devuelve true si se ha podido realizar la operación y false en caso contrario.
*
Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan
 prestado.
* Devuelve true si se ha podido realizar la operación y false en caso contrario.
*
Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.*/


package poorepetidos;

public class Ejercicio4 {

    static class Libro{
        
        private String titulo;
        private String autor;
        private int ejemplares;
        private int ejemplaresPrestados;

        public Libro(){};
        public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
            this.titulo = titulo;
            this.autor = autor;
            this.ejemplares = ejemplares;
            this.ejemplaresPrestados = ejemplaresPrestados;
        }

        public void setTitulo(String titulo){
            this.titulo = titulo;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }
        public void setEjemplares(int ejemplares) {
            this.ejemplares = ejemplares;
        }
        public void setEjemplaresPrestados(int ejemplaresPrestados) {
            this.ejemplaresPrestados = ejemplaresPrestados;
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
        public int getEjemplaresPrestados(){
            return ejemplaresPrestados;
        }

        public boolean Prestamo(int cantidad){
            if(ejemplares > 0){
                ejemplares = ejemplares - cantidad;
                ejemplaresPrestados += cantidad;
            }else {
                System.out.println("No hay ejemplares disponibles");
                return false;
            }
            return true;
        }

        public boolean Devolucion(int cantidad){
            if(ejemplaresPrestados > 0){
                ejemplaresPrestados = ejemplaresPrestados - cantidad;
                ejemplares += cantidad;
            } else {
                System.out.println("No hay libros que devolver");
                return false;
            }
            return true;
        }

        public String toString(){
            System.out.println();
            return "Titulo: "+titulo+"\n"+"Autor: "+autor+"\n"+"Ejemplares: "+ejemplares+"\n"+"Ejemplares prestados: "+ejemplaresPrestados+"\n";
        }

    }

    public static void main(String[] args) {
        
     Libro libro = new Libro();

        libro.setEjemplares(0);
        libro.Prestamo(1);

        System.out.println(libro);

    }

}
