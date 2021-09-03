package poo;

import java.util.Scanner;

public class Basicos {


    //Declaracion de una 'clase'
    static class Bicicleta {
        //Declaracion de atributos 'atributos'
        /*Los atributos 'ruedas, asientos, manillar' ya tienen un valor definido que sera el mismo para todos los objetos instanciados
        de la clase 'Bicicleta'. Este valor establecido a los atributos recibe el nombre de 'estado'.*/
        int ruedas = 2;
        int asientos = 1;
        int manillar = 1;
        int velocidadMaxima;
        int velocidadActual;
        String color;
        String marca;
        boolean infoVelocidad = true;

        /*Declaración de métodos. Cada método recibirá un parámetro que será el valor que modificara los atributos
        iniciales de la clase. Cada parámetro pasado a un método será el nuevo valor del atributo de la clase
        asignado al valor pasado a ese parámetro. Los metodos son el comportamiento de una clase de objetos, aquellas
        acciones que puede realizarla un objeto.

        Los metodos se utilizan para alterar el estado de los atributos de los objetos. Dentro del metodo se llama al
        atributo a alterar y este obtenda el valor del parametro que le pasemos al metodo. Este es un metodo set,
        le 'set=asignar' y su funcion es pasarle el estado por parametro al atributo del objeto.*/
        void setVelocidades(int newVelocidadMaxima, int newVelocidadActual) {
            /*velocidadMaxima y velocidadActual son atributos definidos en la clase. Los objetos podran llamar a este metodo
            para establecerle un estado a estos atributos.*/
            velocidadMaxima = newVelocidadMaxima;
            velocidadActual = newVelocidadActual;
            if(velocidadActual > velocidadMaxima) infoVelocidad = false;
        }
        void setColor(String newColor) {
            color = newColor;
        }
        void setMarca(String newMarca) {
            marca = newMarca;
        }


        void getBicicletaInfo() {
            if(infoVelocidad) {
                System.out.println("Informacion bicicleta: "+ruedas+" ruedas; "+asientos+" asientos; "+manillar+" manillar; "+velocidadMaxima+" velocidad maxima; "+velocidadActual+" velocidad actual; "+color+" color; "+marca+" marca; ");
            } else {
                System.out.println("La velocidad actual no puede superar a la velocidad maxima, cambia los valores.");
            }
        }
        void getInfo() {
            System.out.println("Maxima velocidad"+velocidadMaxima);
        }
    }

    /*Esta nueva clase enrealidad es una subclase de la superclase 'Bicicleta'. Se utiliza la keyword 'extends' para heredar
     de una superclase sus atributos y metodos. Estos atributos heredados de la superclase pueden ser modificados
    dentro de la subclase. A la vez puede haber una subclase de otra subclase.*/
    static class Triciclo extends  Bicicleta {
        int ruedas = 4;
        void getInfoRuedas() {
            System.out.println("Ruedas: "+ruedas);
        }
    }

    //Esta es una subclase de una subclase, que a la vez hereda tanto los atributos como metodos de la superclase.
    static class TricicloDos extends Triciclo {
    }




    public static void main(String[] args) {


        Bicicleta b1 = new Bicicleta();
        b1.setVelocidades(8, 5);
        b1.setColor("Rojo");
        b1.setMarca("China");
        b1.getBicicletaInfo();
//        b1.getBicicletaInfo();

        Bicicleta b2 = new Bicicleta();
        b2.setVelocidades(4, 5);
        b2.setColor("Amarillo");
        b2.setMarca("Española");
        b2.getBicicletaInfo();
//        b2.getBicicletaInfo();

        Triciclo b3 = new Triciclo();
        b3.getInfoRuedas();

        TricicloDos b4 = new TricicloDos();
        b4.getInfoRuedas();

    }
}
