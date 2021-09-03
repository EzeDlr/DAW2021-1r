/*
1. Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

        El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

        Crea sus métodos get, set y toString.

        Tendrá dos métodos especiales:
        ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
        retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

*/
package poo;

public class Ejercicio1 {

    public static class Cuenta {

        //Atributos
        private String titular;
        private double cantidad;

        //Constructor
        public Cuenta(String titular, double cantidad) {
            this.titular = titular;
            if(cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad = cantidad;
            }
        }

        //Metodos
        private String getCuentaTitular() {
            return titular;
        }
        private double getCuentaCantidad() {
            return cantidad;
        }
        public String toString() {
            System.out.println();
            System.out.println("Cantidad: "+this.cantidad);
            return "Titular: "+this.titular+" Cantidad: "+this.cantidad;
        }

        private void setCuentaTitular(String titular) {
            this.titular = titular;
        }
        private void setCuentaCantidad(double cantidad) {
            this.cantidad = cantidad;
        }
        private void ingresar(double cantidad) {
            this.cantidad = this.cantidad + cantidad;
            if(cantidad < 0) return;
        }

        private void retirar(double cantidad) {
            this.cantidad = this.cantidad - cantidad;
            if(this.cantidad < 0) this.cantidad = 0;
        }
    }

        public static void main(String[] args) {
            Cuenta cuenta_1 = new Cuenta("DiscoDurodeRoer", 0);
            Cuenta cuenta_2 = new Cuenta("Fernando", 300);

            //Ingresa dinero en las cuentas
            cuenta_1.ingresar(300);
            cuenta_2.ingresar(400);

            //Retiramos dinero en las cuentas
            cuenta_1.retirar(500);
            cuenta_2.retirar(100);

            //Muestro la informacion de las cuentas
            System.out.println(cuenta_1); // 0 euros
            System.out.println(cuenta_2); // 600 euros

        }


}
