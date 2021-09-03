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


        //Metodos

        /*Esto es un constructor. Un constructor es un metodo especial de las clases que se llama automaticamente cada vez
        que se instancia un objetod de la clase. Siempre que se inicializa un objeto de una clase el constructor es el metodo
        que le asignara los valores iniciales  alos atributos de la clase.*/
        public Cuenta(String titular, double cantidad) {
            this.titular = titular;
            //Cuando instancies un nuevo objeto este bloque de codigo se ejecutara sobre el valor del atributo pasado por parametro al constructor
            if(cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad = cantidad;
            }
        }

        /*Leer mas sobre metodos setters y getters
         *
         * Este metodo es un setter o tambien llamado metodo mutador(algo mutable es que puede cambiar/variar).*/
        private void setCuentaInformacion(String titular, double cantidad) {
            this.titular = titular;
            this.cantidad = cantidad;
        }

        private String getCuentaTitular() {
            return titular;
        }
        private double getCuentaCantidad() {
            return cantidad;
        }

        /*Este metodo lo que permite es sobreescribir sobre el metodo toString() perteneciente de la clase Object (una superclase)
        de las que derivan todas las clases. Object es una superclase de cualquier clase.

        Cada vez que llame al metodo toString() <'asociado a System.out.println();'> me devolvere un 'template' de como se
        imprimira el codigo. Este metodo si le pasas por parametro el objeto lo imprimira junto a los valores del objeto.*/
        public String toString() {
            System.out.println();
            System.out.println("Cantidad: "+this.cantidad);
            return "Titular: "+this.titular+" Cantidad: "+this.cantidad;
        }

        public void ingresar(double cantidad) {
            this.cantidad = this.cantidad + cantidad;
            if(cantidad < 0) return;
        }

        public void retirar(double cantidad) {
            this.cantidad = this.cantidad - cantidad;
            if(this.cantidad < 0) this.cantidad = 0;
        }
    }

 /*   Leer sobre este bloque de codigo. Keyword super y porque se crea un constructor de la clase.

    public static class Prueba extends Cuenta {

        public Prueba(String titular, double cantidad) {
            super(titular, cantidad);
        }
    }*/


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
            /*Aqui se llama al metodo toString() que antes fue comentado. Este metodo nos devolvera los valores de los atributos
            * del objeto pasado por parametrol.*/
            System.out.println(cuenta_1); // 0 euros
            System.out.println(cuenta_2); // 600 euros

            //Ejemplo del metodo setter para actualizar la estado de los atributos del objeto cuenta_1. Tambien otra llamado el metodo toString()
            cuenta_1.setCuentaInformacion(cuenta_1.titular, 200);
            System.out.println(cuenta_1);


        }


}
