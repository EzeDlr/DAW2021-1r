package ej0118;
//12. Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
//número es primo si tiene dos únicos divisores que son el 1 y él mismo

public class Ejercicio12 {

    public static void main(String args []) {

        for (int i=1; i < 50; i++) {
            int contador = 0; //Contador son las posiblidades de que el modulo entre la división sea 0.
            for(int j=1; j < i; j++) {
                if(i % j == 0) {
                    contador++;
                } //Como solo hay dos posibilidades para que sea primo (1 y el mismo numero) las posibilidades se reducen a 2.
            }
            if(contador == 2) System.out.println(i);
        }

    }
}
