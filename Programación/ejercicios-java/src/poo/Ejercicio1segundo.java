/*
1. Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

        El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

        Crea sus métodos get, set y toString.

        Tendrá dos métodos especiales:
        ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
        retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

*/

package poo;

public class Ejercicio1segundo {

   static class Cuenta {

        private String titular;
        private float cantidad;


        //Metodos
            //Constructor
        public Cuenta(String titular, float cantidad) {
            this.titular = titular;
            this.cantidad = cantidad;
            if(cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad = cantidad;
            }

        }

        public void setTitular(String titular) {
            this.titular = titular;
        }
        public void setCantidad(float cantidad) {
            this.cantidad = cantidad;
        }

        public String getTitular(){
            return titular;
        }
        public float getCantidad(){
            return cantidad;
        }

        public void retirar(float retirar) {
            this.cantidad = this.cantidad - retirar;
            if(this.cantidad < 0) {
                this.cantidad = 0;
            }
        }

        public void ingresar(float ingresar) {
            this.cantidad = this.cantidad + ingresar;
            if(ingresar < 0) {
                return;
            }
        }

        public String toString() {
            System.out.println();
            System.out.println("Titular: "+getTitular());
            return "Cantidad: "+getCantidad();
        }

    }

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta("Eze", 200);
        System.out.println(cuenta);
        cuenta.ingresar(200);
        cuenta.retirar(100);
        System.out.println(cuenta);

    }

}
