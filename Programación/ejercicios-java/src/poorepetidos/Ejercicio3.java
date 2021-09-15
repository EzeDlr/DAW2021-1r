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

package poorepetidos;

public class Ejercicio3 {

    static class Cuenta {

        private String titular;
        private String cuenta;
        private double interes;
        private double saldo;

        public Cuenta() {
        }

        ;

        public Cuenta(String titular, String cuenta, double interes, double saldo) {
            this.titular = titular;
            this.cuenta = cuenta;
            this.interes = interes;
            this.saldo = saldo;
        }

        public Cuenta(Cuenta x) {
            titular = x.titular;
            cuenta = x.cuenta;
            interes = x.interes;
            saldo = x.saldo;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public void setCuenta(String cuenta) {
            this.cuenta = cuenta;
        }

        public void setInteres(double interes) {
            this.interes = interes;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String getTitular() {
            return titular;
        }

        public String getCuenta() {
            return cuenta;
        }

        public double getInteres() {
            return interes;
        }

        public double getSaldo() {
            return saldo;
        }

        public boolean ingreso(double cantidad) {
            boolean exito = true;
            if (cantidad < 0) {
                System.out.println("Cantidad negativa");
                exito = false;
            } else {
                saldo += cantidad;
                System.out.println(cantidad + " ingresados");
                exito = true;
            }

            return exito;
        }

        public boolean reintegro(double cantidad) {
            boolean exito = true;
            if (saldo < 0) {
                exito = false;
                System.out.println("Saldo insuficiente para realizar un retiro");
            } else {
                saldo -= cantidad;
                System.out.println(cantidad + " retirados");
                exito = true;
            }
            return exito;
        }

//        * Método transferencia que permita pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero suficiente para poder hacerla. Ejemplo de uso del método transferencia:
//                cuentaOrigen.transferencia(cuentaDestino, importe);
//        que indica que queremos hacer una transferencia desde cuentaOrigen a cuentaDestino del importe indicado.*/

        public void transferencia(Cuenta objeto, double cantidad) {
            if (saldo > 0) {
                saldo -= cantidad;
                objeto.ingreso(cantidad);
            } else {
                System.out.println("No hay saldo suficiente en la cuenta de origen");
            }
        }

        public String toString() {
            System.out.println();
            return "Titular: " + titular + "\n" + "Cuenta: " + cuenta + "\n" + "Saldo: " + saldo + "\n" + "Interes: " + interes + "\n";

        }

        public static void main(String[] args) {

            Cuenta objeto = new Cuenta("Ezequiel", "sdjuhfuidshf", 0, 100);
            Cuenta objeto2 = new Cuenta("Leandro", "sdjuhfuidshf", 0, 200);

            System.out.println(objeto2);

        }

    }
}
