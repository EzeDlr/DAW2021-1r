package ejercicios.ej1931;

/*27. Realiza un programa que cargue desde teclado una tabla de enteros de dimensión 3x3. El
        programa mostrará la columna en la que la suma de sus elementos sea menor.*/

public class Ejercicio27 {

    public static void main(String[] args) {


        int[][] matrix = new int[3][3];
        int[] vector = new int[matrix.length];
        int suma0 = 0;
        int suma1 = 0;
        int suma2 = 0;

        //columna - fila
        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;

        matrix[1][0] = 2;
        matrix[1][1] = 2;
        matrix[1][2] = 2;

        matrix[2][0] = 3;
        matrix[2][1] = 3;
        matrix[2][2] = 3;

        for (int i = 0; i < matrix.length; i++) {
            suma0 += matrix[0][i];
        }
        for(int j = 0; j < matrix.length; j++) {
            suma1 += matrix[1][j];
        }
        for(int z = 0; z < matrix.length; z++) {
            suma2 += matrix[2][z];
        }

        int pequeño = suma0;

        if(suma1 < pequeño) {
            pequeño = suma1;
            System.out.println(pequeño+" es el menor.");
        } else if (suma2 < pequeño) {
            pequeño = suma2;
            System.out.println(pequeño+" es el menor.");
        } else {
            System.out.println(pequeño+" es el menor.");
        }


        System.out.println(suma0);
        System.out.println(suma1);
        System.out.println(suma2);



    }
}
