/*
1. Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

        El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

        Crea sus métodos get, set y toString.

        Tendrá dos métodos especiales:
        ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
        retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

*/

package poorepetidos;

public class Ejercicio1 {

    static class Cuenta {
        private String titular;
        private double cantidad;

        public void setTitular(String titular) {
            this.titular = titular;
        }
        public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
        }
        public String getTitular() {
            return titular;
        }
        public double getCantidad() {
            return cantidad;
        }

        @Override
        public String toString() {
            System.out.println();
            System.out.println("Cantidad: "+this.cantidad);
            return "Titular: "+this.titular+"\n"+"Cantidad: "+this.cantidad;
        }

        public void ingresar(double cantidad) {
            if(cantidad < 0) {
                System.out.println("Cantidad negativa.");
            } else {
                this.cantidad += cantidad;
                System.out.println(cantidad+" ingresados");
            }
        }
        public void retirar(double cantidad) {
           if(this.cantidad - cantidad < 0) {
               this.cantidad = 0;
           } else {
               this.cantidad -= cantidad;
               System.out.println(cantidad+" retirados");
           }
        }

    }

}
