/*2) Haz una clase llamada Persona que siga las siguientes condiciones:

    Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
    Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.
    Se implantaran varios constructores:
        Un constructor por defecto.
        Un constructor con el nombre, edad y sexo, el resto por defecto.
        Un constructor con todos los atributos como parámetro.
    Los métodos que se implementaran son:
        calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),
        significa que esta por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1.
        Te recomiendo que uses constantes para devolver estos valores.
            esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
            comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
            toString(): devuelve toda la información del objeto.
            generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
            Métodos set de cada parámetro, excepto de DNI.

Ahora, crea una clase ejecutable que haga lo siguiente:

    Pide por teclado el nombre, la edad, sexo, peso y altura.
    Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
    Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
    Indicar para cada objeto si es mayor de edad.
    Por último, mostrar la información de cada objeto.

Puedes usar métodos en la clase ejecutable, para que os sea mas fácil.*/

package poo;

import java.util.Scanner;

public class Ejercicio2 {

    static Scanner teclado = new Scanner(System.in);

    static class Persona {

        //Constante
        private final static char SEXO_DEFECTO = 'H';
        private final static int PESO_IDEAL = -1;
        private final static int DEBAJO_IDEAL = 0;
        private final static int SOBREPESO = 1;
        //Atributos
        private char sexo;
        private String nombre;
        private String DNI;
        private int edad;
        private double peso;
        private int altura;


        //Constructores
            //Constructor por defecto.
        public Persona() {
            this.nombre = "";
            this.sexo = SEXO_DEFECTO;
            this.edad = 0;
            this.peso = 0;
            this.altura = 0;
        }

            //Constructor con 3 parametros.
        public Persona(String nombre, char sexo, int edad) {
            this.nombre = nombre;
            this.sexo = sexo;
            this.edad = edad;
        }

            //Constructor con todos los atributos.
        public Persona(String nombre, char sexo, String DNI, int edad, float peso, int altura) {
            this.nombre = nombre;
            this.sexo = sexo;
            generarDNI();
            this.edad = edad;
            this.peso = peso;
            this.altura = altura;
        }

        /*Metodos privados*/
        /*generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente.
        Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
        Métodos set de cada parámetro, excepto de DNI.*/
        public String generarDNI() {
            //23 por que es el numero de letras que pueden ser opcion para el DNI.
            final int divisor = 23;
            /*Los metodos de Math() trabajan con tipo de dato 'double' para guardar este resultado dentro de una variable
              de tipo de dato int se hace uso de la conversion de tipos de datos: (int)*/
            int numeroDNI = (int) Math.floor(Math.random() * 100000000);
            int aleatorio = numeroDNI - (numeroDNI / divisor * divisor);
            char letra = generarLetraDNI(aleatorio);

            DNI = Integer.toString(numeroDNI) + letra;
            return DNI;
        }

        public char generarLetraDNI(int aleatorio) {
            char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                    'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                    'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

            return letras[aleatorio];
        }

        /*Metodos publicos*/
            public void setNombre(String nombre) {
                nombre = "ezequiel";
                this.nombre = nombre;
            }
            public void setEdad(int edad) {
            this.edad = edad;
            }
            public void setSexo(char sexo) {
            this.sexo = sexo;
            }
            public void setPeso(double peso) {
            this.peso = peso;
            }
            public void setAltura(int altura) {
            this.altura = altura;
            }

            //Calcular indice de masa corporal
        public int calcularIMC() {
            double pesoActual = peso/(Math.pow(this.altura, 2));
            if(pesoActual < 20) {
                return PESO_IDEAL;
            }
            else if(pesoActual >= 20 && pesoActual <= 25) {
                return DEBAJO_IDEAL;
            }
            else {
                return SOBREPESO;
            }
        }

            //Determinar si es mayor de edad
        public boolean esMayorDeEdad() {
            boolean mayor = false;
            if(this.edad >= 18) {
                mayor = true;
            } else {
                mayor = false;
            }
            return mayor;
        }

            //Comprobar si el sexo es correcto
        public String comprobarSexo(String sexo) {
            if(this.sexo == 'H') {
                sexo = "hombre";
            } else {
                sexo = "mujer";
            }
            return sexo;
        }

        //Metodo toString()
        public String toString() {
            return "Informacion de la persona:\n"
                    + "Nombre: " + nombre + "\n"
                    + "Sexo: " + sexo + "\n"
                    + "Edad: " + edad + " años\n"
                   + "DNI: " + DNI + "\n"
                    + "Peso: " + peso + " kg\n"
                    + "Altura: " + altura + " metros\n";

        }

    }

    public static void main(String[] args) {

        /*Ahora, crea una clase ejecutable que haga lo siguiente:

    Pide por teclado el nombre, la edad, sexo, peso y altura.
    Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores
    menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
    Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
    Indicar para cada objeto si es mayor de edad.
    Por último, mostrar la información de cada objeto.*/

        char sexo;
        String nombre;
        int edad;
        double peso;
        int altura;

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        System.out.print("NOMBRE: ");
        nombre = teclado.next();
        persona1.setNombre(nombre);
        //Establecer edad
        System.out.println("EDAD: ");
        edad = teclado.nextInt();
        persona1.setEdad(edad);
        //Establecer sexo
        System.out.println("SEXO (H/M): ");
        sexo = teclado.next().charAt(0);
        persona1.setSexo(sexo);
        System.out.println("PESO (kg): ");
        peso = teclado.nextFloat();
        persona1.setPeso(peso);
        System.out.println("ALTURA (cm): ");
        altura = teclado.nextInt();
        persona1.setAltura(altura);
        //Imprimir objeto
        System.out.println(persona1);
        nombre = teclado.next();




    }

}
