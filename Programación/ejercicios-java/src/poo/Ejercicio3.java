/*
* 3. Escribe una clase Cuenta para representar una cuenta bancaria. Los datos de la cuenta son: nombre del cliente (String), número de cuenta (String), tipo de interés (double) y saldo (double).
La clase contendrá los siguientes métodos:
*
Constructor por defecto
Constructor con todos los parámetros
Constructor copia.
*
Métodos setters/getters para asignar y obtener los datos de la cuenta.
*
Métodos ingreso y reintegro. Un ingreso consiste en aumentar el saldo en la cantidad que se indique. Esa cantidad no puede ser negativa.
* Un reintegro consiste en disminuir el saldo en una cantidad pero antes se debe comprobar que hay saldo suficiente.
* La cantidad no puede ser negativa. Los métodos ingreso y reintegro devuelven true si la operación se ha podido realizar o false en caso contrario.

* Método transferencia que permita pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero suficiente para poder hacerla. Ejemplo de uso del método transferencia:
    cuentaOrigen.transferencia(cuentaDestino, importe);
que indica que queremos hacer una transferencia desde cuentaOrigen a cuentaDestino del importe indicado.*/

package poo;

import java.util.Scanner;

public class Ejercicio3 {

    static class Cuenta {

        private String nombreCliente;
        private String numeroCuenta;
        private double interes;
        private double saldo;

        /*Constructores*/

            /*
             * Puedes utilizar su creación para definir de que forma le puedes pasar valores a los atributos
             * de un objetol. Por teclado(scanner), por parametros...*/

            /*Constructor por defecto, sin parametros, los valores de los atributos estan vacios
            * Los valores se pasaran a este constructor mediante un Scanner*/
        public Cuenta() {
            /*
             * Al crear un objeto sin pasarle parametros estas llamando a este constructor(metodo) por defecto
             * que se inicializa al instanciar un objeto de la clase. El constructor esta vacio, le pasas
             * los valores mediante los metodos set del la propia clase, y el valor del parametro de esos
             * métodos se los pasas por teclado(Scanner).*/
        }



        /*Constructor que recibe parametros, los valores pasados por parametros se declararan en la creación de
        * instancia de un nuevo objeto.*/
        public Cuenta(String a, String b, double c, double d) {
            nombreCliente = a;
            numeroCuenta = b;
            interes = c;
            saldo = d;
        }
            //Constructor copia utilizado para hacer copias entre los objetos.
        public Cuenta(final Cuenta x) {
            nombreCliente = x.nombreCliente;
            numeroCuenta = x.numeroCuenta;
            interes = x.interes;
            saldo = x.saldo;
        }


        /*this es para hacer referencia a los miembros/atributos de la clase
         * y no del constructor. Como el nombre de los parametros es diferente al de
         * los atributos, no hace falta diferenciarlos con this.
         *
         * this se utiliza para hacer referencia a los miembros de la clase, a los
         * atributos en si. this==este objeto*/

        /*Metodos setters/getters*/
        public void setNombreCliente(String nombreCliente) {
            this.nombreCliente = nombreCliente;
        }
        public void setNumeroCuenta(String numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }
        public void setInteres(double interes) {
            this.interes = interes;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public String getNombreCliente() {
            return nombreCliente;
        }
        public String getNumeroCuenta() {
            return numeroCuenta;
        }
        public double getInteres() {
            return interes;
        }
        public double getSaldo() {
            return saldo;
        }

        /*Metodos*/
        public boolean ingreso(double ingreso) {
            if(ingreso < 0) {
                return false;
            } else {
               saldo += ingreso;
            }
            return true;
        }
        public boolean reintegro(double reintegro) {
            if(saldo <= 0) {
                return false;
            }
            if(reintegro < 0) {
                return false;
            }
             else {
                saldo -= reintegro;
            }
            return true;
        }

        /*
         * Mira que importante el uso de metodos dentro de otros metodos.
         * Al método transferencia le estas pasando como parametro un objeto de tipo cuenta y un objeto de tipo double.
         * Cuente en la clase main se llame a este metodo, como valor de parametro se le tendra que pasar un objeto
         * de tipo cuenta y un objeto de tipo double.
         *
         * Dentro del mismo metodo transferencia estas llamando a otros metodos que realizan una funcion. Llamas al metodo
         * reintegro(valor parametro) y este afectara al objeto del cual estes haciendo la llamada a la función.
         * Utilizas la instancia de la clase Cuenta objeto para darle un valor que sera otro objeto, y de ese otro objeto
         * llamas al metodo ingreso y le sumas al saldo del objeto pasado por parametro el ingreso de importe.   */
        public boolean transferencia(Cuenta objeto, double importe) {
            if(saldo < 0) {
                return false;
            } else if(saldo >= importe) {
                reintegro(importe);
                objeto.ingreso(importe);
            } else {
                return false;
            }
            return true;
        }

        public String toString() {
            System.out.println(getNombreCliente());
            System.out.println(getNumeroCuenta());
            System.out.println(getSaldo());
            System.out.println(getInteres());
            return "Listo";

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        //se crea objeto cuenta1 sin parámetros
        //se ejecuta el constructor por defecto
        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Tipo de interes : ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        cuenta1.setNombreCliente(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setInteres(tipo);
        cuenta1.setSaldo(importe);

        //se crea el objeto cuenta2 con los valores pasados por parametro
        //se ejecuta el constructor con parámetros
        Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

        //se crea cuenta3 como copia de cuenta1
        //se ejecuta el constructor copia
        Cuenta cuenta3 = new Cuenta(cuenta1);

        //mostrar los datos de cuenta1
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombreCliente());
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta1.getInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        //se realiza un ingreso en cuenta1
        cuenta1.ingreso(4000);

        //mostrar el saldo de cuenta1 después del ingreso
        System.out.println("Saldo: " + cuenta1.getSaldo());

        //mostrar los datos de cuenta2
        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getNombreCliente());
        System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta2.getInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //mostrar los datos de cuenta3
        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre del titular: " + cuenta3.getNombreCliente());
        System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta3.getInteres());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

        //realizar una transferencia de 10€ desde cuenta3 a cuenta2
        cuenta3.transferencia(cuenta2, 10);

        //mostrar el saldo de cuenta2
        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //mostrar el saldo de cuenta3
        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

    }



    }


