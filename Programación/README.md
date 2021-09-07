# Programación

# Tabla de contenidos
- [¿Qué es programar?](#qué-es-programar)
  - [Lenguajes de programación, algoritmos y pseudocódigo](#lenguajes-de-programación-algoritmos-y-pseudocódigo)
  - [Tipos de lenguajes](#tipos-de-lenguajes)
  - [Traductores, compiladores e intérpretes](#traductores-compiladores-e-intérpretes)
  - [Paradigmas de programación](#paradigmas-de-programación)
- [Pseudocódigo](#pseudocódigo)
- [Convenciones de Java](#convenciones-de-java)
- [Uso de estructuras de control](#uso-de-estructuras-de-control)
  - [Operadores](#operadores)
  - [Estructuras condicionales](#estructuras-condicionales)
  - [Estructuras de repetición](#estructuras-de-repetición)
  - [Instrucciones de salto](#instrucciones-de-salto)
- [Aplicación de las estructuras de almacenamiento](#aplicación-de-las-estructuras-de-almacenamiento)
  - [Arrays](#arrays)
  - [Colecciones](#colecciones)
  - [Declaración de colecciones](#declaración-de-colecciones)
  - [Iterar sobre una colección](#iterar-sobre-una-colección)
  - [Ordenar elementos de una colección](#ordenar-elementos-de-una-colección)
  - [Interfaz Set](#interfaz-set)
  - [Interfaz list](#interfaz-list)

## ¿Qué es programar?

Los ordenadores son máquinas muy obedientes, con cero capacidad de decisión propia y programar es la capacidad que tenemos de dictar al ordenador realizar tareas específicas. Lo hacemos mediante instrucciones que están escritas en algún lenguaje de programación.

### Lenguajes de programación, algoritmos y pseudocódigo

Un lenguaje de programación es un lenguaje artificial(lenguaje construido con un léxico y gramática limitado) con reglas gramaticales bien definidas que sirve como herramienta para el programador al poder comunicarse y dar órdenes a la computadora de la tarea a realizar.

El programador escribe una serie de instrucciones o ***algoritmos*** en un lenguaje de programación que tiene unas reglas gramaticales muy definidas y estrictas que se han de respetar.

Un ***algoritmo*** es un conjunto de instrucciones/reglas definidas, no-ambiguas(no cambian), ordenadas y finitas(tienen un límite) que permite resolver un problema, procesar datos, realizar un cómputo y otras tareas  [Ejercicios resueltos de creación de algoritmos. Más explicación sobre el pseudocódigo.](http://www.profmatiasgarcia.com.ar/uploads/tutoriales/Ej_resueltos_algoritmos.pdf)

no-ambiguo == es lo que es, no cambia, algo ambiguo [[comportamiento, expresión, palabra] Que puede entenderse o interpretarse de diversas maneras]]

### Tipos de lenguajes

El ***lenguaje máquina*** es el más primitivo de todos y funciona mediante 0 y 1, y es el único lenguaje que la computadora entiende. Las instrucciones nativas (*código nativo es aquel que fue escrito específicamente para un determinado procesador*) de una computadora se escriben en lenguaje máquina.

El ***lenguaje ensamblador*** aparece como sustitución del lenguaje máquina para acercarlo más al utilizado por el humano, se almacena como texto y está formado por una serie de instrucciones ejecutables por un microprocesador.

***Los lenguajes de alto nivel*** tienen como objetivo facilitar el trabajo al programador ya que utilizan una sintaxis entendible para el ser humano. *Java es un lenguaje de alto nivel.*

***Los lenguajes de bajo nivel*** son totalmente dependientes de la máquina, los programas escritos en este tipo de lenguajes no pueden ser utilizados en otras máquinas. Estos lenguajes están diseñados a medida para el hardware por lo tanto aprovechan al máximo sus características. *C es un lenguaje de bajo nivel.*

Para que la computadora entienda y ejecute este lenguaje(lenguaje de alto nivel, de bajo nivel o ensamblador), se traduce mediante *traductores*, intérpretes o compiladores*;*

### Traductores, compiladores e intérpretes

Los ***traductores*** son programas que traducen un programa que esté escrito en un lenguaje de programación a otro lenguaje distinto para luego ser ejecutado; el archivo original se hace llamar *código fuente* y el resultado código objetivo. Los traductores son ***compiladores e intérpretes.***

El ***compilador t***raduce el lenguaje de alto nivel a lenguaje máquina haciendo una ejecución más rápida ya que traduce todo el programa como un único bloque generando un *código objeto*

traducido a lenguaje máquina.

*El programa/código fuente pasa por el compilador y este lo traduce en bloque (todo el archivo y todas las instrucciones al mismo tiempo) y se compila a código objeto/programa objeto entendible por la máquina en lenguaje máquina.*

La ***compilación*** es el proceso que traduce un código escrito de un lenguaje de programación (código fuente) a otro lenguaje de programación generando un resultado que pueda ser interpretado por la máquina (código objeto >> lenguaje maquina).

El ***intérprete*** traduce el código fuente a lenguaje maquina linea a linea después de su ejecución. *Al encontrar una instrucción el intérprete la traduce a lenguaje máquina y la ejecuta, a partir de aquí se detiene la traducción, vuelve a encontrar la siguiente instrucción, la traduce y la ejecuta y nuevamente se vuelve a detener la traducción. **Traduce una línea a lenguaje máquina y la ejecuta, pasa a la siguiente instrucción y el mismo proceso, traducción y ejecución todo línea a línea.***

### Paradigmas de programación

Un paradigma es un conjunto de características comunes que agrupan lenguajes de programación y los identifica para formar parte de ese paradigma. Es un método para resolver el problema, los paradigmas están formados por mecanismos que te inducen a un estilo de programación.

Los paradigmas son formas de resolver un problema, permiten clasificar los lenguajes y estudiarlos ya que cuando estudias un paradigma estás estudiando los lenguajes que están dentro de él.

## Pseudocódigo

Todos los ejercicios fueron creados en PSeInt.

Pseudocódigo para un programa que nos sume dos número introducidos por el teclado

```java
Algoritmo Suma
Escribir "Introduce un número: "
Leer primer_numero

primer_numero<-primer_numer
Escribir  "Introduce un numero: "
Leer segundo_numero
segundo_numero<-segundo_numero
resultado<-primer_numero + segundo_numero
Escribir "Resultado: ", resultado
FinAlgoritmo
```

Pseudocódigo para un programa que nos diga la tabla de multiplicar del número que le digamos (introducido por el teclado)

```java
Algoritmo multiplicar
	Definir x, i Como Entero
	Escribir "Numero: "
	Leer x
	x<-x
	i<-0
	Mientras que i<=10 Hacer
		Escribir x " x " i " = " x*i 
		i = i + 1
	Fin Mientras
FinAlgoritmo
```

Escribir Pseudocódigo que calcule el área de un círculo.

```java
Algoritmo areaDeCirculo
	Definir x Como Entero
	Definir p Como Real
	Escribir "Radio: "
	Leer x
	x<-x
	p<-3.14
	a<-(x * x) * p
	Escribir "Area: ", a
FinAlgoritmo
```

Escribir un Pseudocódigo que calcule el área de un triángulo recibiendo como entrada el valor de base y altura.

```java
Algoritmo areaTriangulo
	Definir area, base, altura Como Real
	Escribir "Base: "
	Leer base
	base<-base
	
	Escribir "Altura: "
	Leer altura
	altura<-altura
	
	area<-(base * altura) / 2
	
	Escribir "Area: ", area
FinAlgoritmo
```

Crear un pseudocódigo que proporcione el volumen de un cilindro, conocidos su altura y diámetro.

```java
Algoritmo VolumenCilindro
	
	Definir altura, diametro, x Como Real
	
	Escribir "Altura: "
	Leer altura
	altura<-altura
	
	Escribir "Diámetro: "
	Leer diametro
	diametro<-diametro
	
	x<-3.14
	
	resultado<-x * ((diametro^2) * altura)
	Escribir resultado
	
FinAlgoritmo
```

Pseudocódigo para introducir un número por teclado y que nos diga si es positivo o negativo.

```java
Algoritmo PosiNega
	Definir x Como Entero
	Escribir "Escribe un numero: "
	Leer x
	x<-x
	
	Si x>0 Entonces
		Escribir "Positivo"
	SiNo
		Escribir "Negativo"
	Fin Si
	
FinAlgoritmo
```

Realizar el pseudocódigo de un programa que permita saber si un número es mayor, menor o igual a cero.

```java
"Es un Sí-SiNo dentro de un SiNo"

Algoritmo PosiNegaCero
	Definir x Como Entero
	Escribir "Numero: "
	Leer x
	x<-x
	
	Si x=0 Entonces
		Escribir "Igual a cero"
	SiNo
		Si x<0 Entonces				
			Escribir "Negativo"
		SiNo
			Escribir "Positivo"
		Fin Si
	Fin Si
	
FinAlgoritmo
```

# Convenciones de Java

# Uso de estructuras de control

## Operadores

### Operadores relacionales

Los **operadores de igualdad o relacionales** son aquellos que nos permiten comparar el valor de una variable con otra.

**== y !=** son operadores de igualdad, **<, <=, >, >=** son operadores relacionales.

[Operadores relacionales](https://www.notion.so/25ebe8abf11c4852b07434836b2440b2)

### Operadores lógicos

Los **operadores lógicos** se utilizan para comprar expresiones y *devuelve como resultado un valor booleano.*

[Operadores logicos](https://www.notion.so/bc133821ea43420292c758d700d31ff2)

## Estructuras condicionales

Las estructuras condicionales permiten al programa realizar una función u otra dependiendo de una condición.

### if

Ejecuta un bloque de codigo si el valor de la condicion es ***true***.

```java
if(condicion){
	bloque a ejecutar;
}
```

### if/else

Si la condicion del if equivale a ***false*** se ejecutara el bloque de codigo dentro del else.

```java
if(condicion){
	bloque de codigo que no se ejecutara;
} else {
		bloque de codigo que si se ejecutara;
}
```

### if/else-if/else

Se utiliza cuando se tienen que realizar varias condicionales.

Si la condicion del primer ***if** es* **false** *pasara al **else-if*** si esta es ***true*** se ejecutara su bloque de codigo si no pasara al ***else.***

```java
if(condicion){
	bloque de codigo;
}
else if(condicion) {
	bloque de codigo;
}
else {
	bloque de codigo;
}
```

Si la primera condición equivale a ***true*** el programa no seguirá evaluando las siguientes condiciones.

```java
int a = 1;
if(a > 0) {
	a = 0;
} 
else if(a==0) {
		este bloque de codigo no se ejecutara pues ya se evaluo
		una condición que dio ***true.***
}
else {
	bloque de codigo;
}
```

## Estructuras de repetición

Las estructuras de repeticion permiten realizar tareas repetitivas dada una condición.

### Bucle for

Este tipo de bucle se utiliza cuando sabemos que numero de veces queremos que se repita un bloque de codigo.

```java
Declaracion de un bucle for
for(int Liui=0; i < 10; i++){
	bloque de codigo
}
```

### Bucle for inverso

Este bucle es un for normal y corriente pero inverso.

Si restamos 1 a ***0,*** nos dara como resultado el numero negativo ***-1.***

```java
int numero = 0;
        numero--;
        System.out.print(numero);

-1
```

Para recorrer un elemento como por ejemplo un ***array*** desde atras hacia adelante se hace de la siguiente forma.

```java
for(int j = numeros.length - 1; j >=0; j--) {
            System.out.print(numeros[j]);
        }
```

### Bucle while

Este tipo de bucle se utiliza cuando no sabemos especificamente el numero de veces que queremos que un bloque de codigo se ejecute.

El bloque de codigo se ejecutara siempre y cuando la condición sea cierta.

```java
while(condicion){
	bloque de codigo;
}
```

Enrealidad un bucle while es equivalente a un bucle for, simplemente con una diferencia de sintaxis.

En un bucle for se utiliza una variable de incremento para despues de unas iteraciones parar la condición y asi el bloque de codigo no se ejecute mas, esto se puede simular en un bucle while.

```java
int i es la variable de incremento.

for(int i=0; i < 10; i++){
	bloque de codigo:	
}

int x es la variable de incremento

int x = 0;
while(x < 10) {
	bloque de codigo;
	x++;
}
```

### Bucle do-while

Este tipo de bucle se utiliza cuando al menos se quiere ejecutar el bloque de codigo una vez antes de evaluar una condicion.

Se ejecutara una vez el bloque de codigo dentro del ***do*** y si la condición de ***while*** equivale a ***true*** se volvera a ejecutar el bloque de codigo del ***do.***

```java
do {
	este bloque de codigo se ejecutara almenos una vez;
} while (condicion);
	si la condicion equivale a ***true*** el bloque de codigo se
	volvera a ejecutar.
```

### Bucle for-each

Este tipo de bucle se utiliza para iterar sobre un array. Lo hace iterando sobre cada elemento del array y asignando el valor de su index a una variable y asi consecutivamente hasta recorrer todos los indices.

```java
int array [] = new int[10]
for(int i:array) {
	System.out.print(i)
}
```

## Instrucciones de salto

Las estructuras de salto son instrucciones que nos permiten romper con el orden natural de ejecución de un programa, pudiendo salir de un bucle, saltar una línea de ejecución o guardar el valor de un método/función.

Las instrucciones de salto son ***break, continue, return.***

### break

***break;*** permite salir de un bucle y ejecutar las siguientes instrucciones que vengan después de este.

```java
for (int i = 1; i < 5; i++) {
            if (i == 3) {
                //Se saldrá del bucle y se ejecutará la siguiente línea fuera del bucle
                break;
            }
//imprimira hasta 2
            System.out.print(i);

        }
        //Siguiente instrucción a ejecutar al salir del bucle con break
        System.out.print("Fuera del bucle");
```

### continue

***continue;*** permite saltarse una línea de ejecución volviendo al bucle inicial dejando esa línea sin ejecutar.

```java
for(int i=0; i < 10; i++) {
            if(i == 3) {
									//esta linea se imprimira y no imprimira
										un 3
                System.out.print("STOP!");
                continue;
								//volvera al bucle inicial
            }
            System.out.println(i);
        }
```

### **return**

***return;*** permite que al llamar a un método, esa llamada almacene un valor. También nos permite finalizar la ejecución del programa en el punto que queremos.

```java
public static String MyClass(String s) {
        String x = "Ezequiel";
        System.out.print(x);
        //return marca el final de ejecución de un método/funcione 
					y poder almacenar el resultado para asignarlo a una variable
        return s;

    }

        public static void main (String [] args){
            String saludo = MyClass(" que tal");
            System.out.print(saludo);
        }

    }
```

# Aplicación de las estructuras de almacenamiento

## Arrays

Un array es una estructura de datos que contiene una colección del mismo tipo de dato. Se utilizan para almacenar datos del mismo tipo y la posición de sus elementos se organiza de forma indexada, es decir, empezando por la posición 0.

Un array unidimensional se hace llamar vector. Este tipo de arrays unicamente son de una dimension.

Un array bidimensional se le hace llamar matrices. Este tipo de arrays esta formado por dos dimensiones y se puede organizar en forma de columnas y tablas.

### Arrays unidimensionales - vector

```java
Declaracion de un array unidimensional.
 
int [] nombreArray = new int [*tamaño del array*]
```

Primero declaras el tipo de dato del array junto a [] para declarar un objeto de clase array.

Instancias un nuevo objeto de dicha clase con el operador new, seguido del tipo de dato del array y por ultimo su tamaño.

### Arrays bidimensionales - matrices

Las arrays bidimensionales estan hechas por filas y se debe de leer asi

colum - colum - colum

fila - fila - fila

```java
int[ ][ ] a = new int[2][4];  // Two rows and four columns.

a[0][0] a[0][1] a[0][2] a[0][3]

a[1][0] a[1][1] a[1][2] a[1][3]
```

```java
int [filas][columnas] nombreArray_bidimensional = new int[**numero de filas**][**numero de columnas**]

//[arrow][column] >> arr-ay

int [][] nombreArray_bidimensional = new int[5][2] //5 filas y 2 columnas.
```

```java
Columna 0

nombreArray_bidimensional[0][0] = 1;
nombreArray_bidimensional[0][1] = 2;
nombreArray_bidimensional[0][2] = 3;
nombreArray_bidimensional[0][3] = 4;
nombreArray_bidimensional[0][4] = 5;

Columna 1

nombreArray_bidimensional[1][0] = 6;
nombreArray_bidimensional[1][1] = 7;
nombreArray_bidimensional[1][2] = 8;
nombreArray_bidimensional[1][3] = 9;
nombreArray_bidimensional[1][4] = 10;
```

### Iterar sobre un arrray

```java
Metodo for loop
for(int i = 0; i < arrray.lenght; i++){
    //codigo
}

Metodo forEach loop
for(int i:array){
  //codigo
}

Metodo for loop inverso
for(int j = numeros.length - 1; j >= 0; j--) {
   System.out.print(numeros[j]) 
}
```

### Iterar sobre un array bidimensional

Al iterar sobre un array bidimensional o matrix se hace uso de dos bucles for, pues debemos de recorrer las filas y las columnas.

```java
for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix.length; j++) {
                //codigo
            }
        }
```

# Colecciones

Las colecciones ***"framework"*** son almacenes de objetos dinamicos. Lo especial de una coleccion es que es un almacen dinamico, es decir, que su capacidad puede crecer o disminuir durante la ejecución de un programa.

> Un array tiene un tamaño fijo que no cambiara. Una colección puede tener un tamaño de 10 y si durante la ejecucion del programa se necesita que este tamaño aumente, lo hara. Es un almacén ***dinámico.***

- Cambia de tamaño dinamicamente.
- Pueden ordenarse.
- Se puede insertar y eliminar elementos.
- Se puede iterar sobre los elementos de la colección y mostrarlos.
- Se puede obtener el numero de elementos que forman un colección.

***Una colección no puede almacenar datos primitivos.***


## Declaración de colecciones

Para declarar una colección se debe de importar el paquete de ***java.util***.

```java
import java.util.*;
```

Podemos declarar el tipo de colección que queremos junto a la clase y esta ya implementara los métodos abstractos de si misma.

> Un método abstracto es aquel que unicamente sabemos su declaración pero no su implementación. En estos métodos solo se escribe su ***nombre, parametros y tipo devuelto.***

```java
import java.util.*;

Interfaz<Tipo de dato> nombre = new Clase<Tipo de dato>(*capacidad inicial [no obligatorio]*);

Set<String> variable = new HashSet<Tipo de dato>();
List<Integer> variable = new ArrayList<Tipo de dato>();
...
...
```

## Iterar sobre una colección

```java
Interfaz<Tipo de dato> iterador = coleccionIterar.iterator();
while(iterador.hasNext()){
	//codigo
}
```

[Métodos de iteración](https://www.notion.so/3c259b376e224f8f9bae2e1a6fb654ab)

## Frecuencia de elementos dentro de una colección

Podemos ver cuantas veces aparece un numero repetido dentro de una colección el el metodo ***frequency().***

```java
Set<Integer> set = new HashSet<Integer>(lista);
        for(int i:set) {
            System.out.println(i +" frecuencia: "+ Collections.frequency(lista, i));
        }
```

## Interfaz Set

La interfaz Set representa una colección de objetos donde cada objeto es único, es decir, ***los objetos no se pueden repetir dentro de esta colección***. Los elementos dentro de una colección Set ***no tienen ningún orden***.

### El tamaño de una colección set

```java
import java.util.*;
import java.util.Scanner;

Set<Integer> set = HashSet<Integer>();

set.add(1);
set.add(2);
set.add(3);//repetido
set.add(3);//repetido
set.add(3);//repetido
set.add(4);
set.add(5);
set.add(6);
set.add(7);
set.add(8);

set.size(); //8
```

- Se han añadido 10 elementos a la colección set.
- El elemento 3 se ha repetido 3 veces, la interfaz set ***eliminara las repeticiones de dicho elemento contabilizando solo una.***
- El tamaño de la colección sera 8 y no 10, pues los elementos repetidos han sido eliminados.

Este ejemplo muestra cuando se te pide que leas una ***cantidad especifica*** de elementos y que los repetidos sean eliminados.

Seria fácil simplemente realizando una colección Set pero hay un problema, y es que se nos pide que leamos una cantidad limitada de elementos.

Podríamos leer dicha cantidad de elementos son Set, pero este no tiene un limite

```java
import java.util.*;
import java.util.Scanner;

Set<Integer> set = new HashSet<Integer>(5); //capacidad de 5.
int x;

//la condicion se ejecutara hasta que haya 6 elementos
for(int i=0; i < 6; i++){
		x = teclado.nextInt();
		set.add(x);
}
System.out.print(set.size()); //6
```

- La capacidad inicial de la coleccion es de 5.
- El bucle se ejecuta hasta que hayan 6 elementos, por lo tanto la capacidad inicial queda anulada y esta aumenta.
- La colección adquiere un nuevo tamaño.

Una forma de leer una cantidad especifica de elementos y luego eliminar los repetidos puede ser creando un array, rellenarla, convertirla en una lista dentro de una colección Set.

```java
Scanner teclado = new Scanner(System.in);
        Integer [] vector = new Integer[12];

        for(int i=0; i < vector.length; i++) {
            System.out.print("Leyendo "+i+": ");
            vector[i] = teclado.nextInt();
        }

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(vector));
```

## Interfaz List

La interfaz List almacena objetos que podemos ordenar y los cuales pueden estar repetidos.

```java
List<Tipo de dato> lista = new ArrayList<Tipo de dato>();
```

## Ordenar elementos de una colección 

La interfaz *Collections* consta de dos métodos para ordenar los elementos almacenados por una lista.

### sort()

Es el método utilizado para organizar de forma ascendente los elementos de una lista.

```java
List<Integer> lista = new ArrayList<Integer>();
lista.add(3);
lista.add(2);
lista.add(1);

Collections.sort(lista);
System.out.print(lista);

//1
//2
//3
```

### reverseOrder()

Es el método utilizado para organizar de forma descendiente los elementos de una lista

```java
List<Integer> lista = new ArrayList<Integer>();
lista.add(1);
lista.add(2);
lista..ad(3);

Collections.sort(lista, reverseOrder());
System.out.print(lista);

//3
//2
//1
```

## Interfaz Map y SortedMap

Llamados *diccionarios o arrays relacionales* la interfaz ***Map*** en Java permiten definir una ***key*** y mapearla con un ***value.*** A diferencia de las colecciones, esta interfaz no almacena objetos si no colecciones de ***llave→valor.***

***Map*** es la interfaz donde los valores que mapean hacia una llave ***no estan ordenados***  que esta formada por las siguientes clases. Por otro lado tenemos la interfaz ***SortedMap*** que es lo mismo que la interfaz Map con la diferencia de que *devuelve los valores ordenados*.

### Declaración de map

```java
import java.util.Map;
import java.util.HashMap;

Map variable = new Clase();
////////////////////////////////////////////////////////////////

	Map <Tipo de dato de llave, Tipo de dato de valor> variable = new HashMap<Tipo de dato de llave, Tipo de dato de valor>();

```

### Mapeo ordenado y sin ordenar

```java
import java.util.Map;
import jav.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;

Map <String, Integer> desordenado = new HashMap<String, Integer>();
        SortedMap<String, Integer> ordenados = new TreeMap<String, Integer>();

        desordenado.put("Uno", 1);
        desordenado.put("Dos", 2);
        desordenado.put("Tres", 3);

        ordenados.put("Uno", 1);
        ordenados.put("Dos", 2);
        ordenados.put("Tres", 3);
		
				//Desordenado
        for(Integer key:desordenado.values()) {
            System.out.println(key);
        }

        System.out.print("//////////////////////////////////////////////////////////////////////////////////////////////");
				
				
					//Ordenado
        for(Integer key:ordenados.values()) {
            System.out.println(key);
        }
```
# Programación orientada a objetos

La programación orientada a objetos es un paradigma de programación o estilo de programación donde se construyen elementos ***(objetos)*** del problema a resolver, estos objetos tienen caracteristicas ***(atributos)*** y funciones ***(métodos).***

Este paradigma permite *separar los diferentes componentes del programa* y así facilitar su creación y mejorías futuras.

> *En este paradigma se debe de tener siempre en mente que se intenta representar el mundo real en código diferenciando las clases como un conjunto de objetos genéricos y los objetos como tipos de objetos de esta clase mas específicos.*

## Encapsulación, modificadores de acceso

El acceso a las propiedades y métodos entre clases se determina mediante las palabras reservadas de los ***modificadores de acceso.***

- ***private*** la propiedad o método unicamente es accesible desde la propia clase.
- ***package private*** es el valor por defecto que se le asigna a una propiedad o método, establece que estas puedan ser accesibles desde cualquier clase que este dentro del mismo ***package***.
- ***protected*** es accesible desde la misma clase, una clase en el mismo paquete o una clase instanciada desde otro ***package***.
- ***public*** es accesible tanto en las clases de fuera como de dentro del ***package***.

![Untitled](Programacio%CC%81n%20697a1b389ca54460b4a7f461431f6f4a/Untitled.png)

> *Es muy importante la distinción entre los **packages**.*

```java
public class Clase {
	private String nombre;
	
	public void metodo() {
		
}	
}

public class Clase2 {
	Clase objeto = new Clase();
	objeto.nombre; //dara error pues el atributo 'nombre' de la clase 'Clase' es
	privado.

	objeto.metodo(); //se ejecutara puesto que el metodo es publico.
}
```

## Clases

En POO una clase es un plano del cual se formaran los objetos individuales instanciados de esta clase.

```java
//Declaracion de una clase con la keyword *'Class'*
class Clase {
	//atributos
	//metodos
} 
```

### Atributos y métodos

Dentro de una clase existen los ***atributos*** y los ***metodos.*** Los *atributos* se le hacen llamar *'estado del objeto'* y son simples variables que representan el *estado* del objeto. Por otro lado los ***metodos*** son *funciones* que sirven para interactuar y cambiar el estado de los *atributos.*

```java
//Declaracion de atributos 'atributos'
 /*Los atributos 'ruedas, asientos, manillar' ya tienen un valor definido que sera 
el mismo para todos los objetos instanciado de la clase 'Bicicleta'. 
Este valor establecido a los atributos recibe el nombre de 'estado'.*/
        int ruedas = 2;
        int asientos = 1;
        int manillar = 1;
        int velocidadMaxima;
        int velocidadActual;
        String color;
        String marca;
        boolean infoVelocidad = true;
```

Cada método recibirá un parámetro que será el valor que modificara los atributos iniciales de la clase. Cada parámetro pasado a un método será el nuevo valor del atributo de la clase asignado al valor pasado a ese parámetro. Los métodos son el comportamiento de una clase de objetos, aquellas acciones que puede realizarla un objeto.

Los métodos se utilizan para alterar el estado de los atributos de los objetos. Dentro del método se llama al atributo a alterar y este obtendra el valor del parámetro que le pasemos al método.

```java
//Este es un metodo set, le 'set=asignar' y su funcion es pasarle el estado por 
//parametro al atributo del objeto.
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
```

### Método constructor

Esto es un constructor. Un constructor es un método especial de las clases que se llama automáticamente cada vez que se instancia un objeto de la clase. Siempre que se inicializa un objeto de una clase el constructor es el método que le asignara los valores iniciales  a los atributos de la clase.

```java
static public class Cuenta {

        private String nombreCliente;
        private String numeroCuenta;
        private double interes;
        private double saldo;

        /*Constructores*/

            /*
             * Puedes utilizar su creación para definir de que forma le puedes pasar
								 valores a los atributos
             * de un objeto. Por teclado(scanner), por parametros...*/

            /*Constructor por defecto, sin parametros, los valores de los atributos 
								que estan vacios
            * Los valores se pasaran a este constructor mediante un Scanner*/
        public Cuenta() {
            /*
             * Al crear un objeto sin pasarle parametros estas llamando a este 
								constructor(metodo) por defecto
             * que se inicializa al instanciar un objeto de la clase. 
								El constructor esta vacio, le pasas
             * los valores mediante los metodos set del la propia clase, y 
								el valor del parametro de esos
             * métodos se los pasas por teclado(Scanner).*/
        }

        /*Constructor que recibe parametros, los valores pasados por parametros se 
						declararan en la creación de instancia de un nuevo objeto.*/
        
        /*Como el nombre de los parametros es diferente al de
         * los atributos, no hace falta diferenciarlos con this.*/
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
```

### Paso de valores a los constructores

En el anterior apartado se definieron tres constructores; ***constructor por defecto vacío, constructor con parámetros y un constructor copia.*** A los dos primeros constructores la forma de pasarle valores es diferente.

Al constructor que esta vacío se le deberán de pasar los valores por el teclado, recogiendo un input del usuario mediante *Scanner.* Con ese valor obtenido mediante input podemos utilizar los métodos **set (explicado abajo)** para asignarle estos valores.

```java
//Constructor por defecto, vacio

Scanner sc = new Scanner(System.in);
        String nombre; 
        String numero;
        double tipo; 
        double importe;

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
```

El siguiente constructor que tenemos esta realizado con parámetros, unicamente le pasamos valores a estos parámetros cuando instanciemos un nuevo objeto.

```java
//Constructor con valores pasados por parametro
Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
```

### Métodos setter y getter

Normalmente los atributos de una clase suelen ser privados por lo que para cambiar su estado se hace uso de los métodos ***set y get.*** Es decir, al proteger variables dentro de una clase que unicamente podrán ser invocadas y manipuladas dentro de la clase y para se hace uso de estos métodos.

***setter*** significa establecer y son los métodos encargados de asignar un valor a un atributo. Estos métodos nunca devuelven un valor, unicamente lo establecer, por lo que suelen ser en general de tipo **void.**

> *Este es el método utilizado para pasar valores a un constructor por defecto, vacío.*

```java
//Suelen recibir por parametro que sera el valor a establecer al atributo de la clase.
public void setNombre(String n){
	this.nombre = n;
}
```

***getter*** significa obtener y son los encargados de acceder, obtener y devolver un valor que ya ha sido asignado a un atributo. Estos métodos devuelven un valor y el método sera del tipo de dato del atributo que tenga el valor.

> *Por ejemplo; si el atributo del cual se quiere devolver su valor es de tipo **int** el valor de retorno del método también sera de tipo **int.***

```java
String name = "Ezequiel";

public String getName(){
	return name;
}

//Ezequiel
```

### Keyword 'this'

***this.*** es una keyword utilizada para hacer referencia a los miembros/atributos de la clase y no del constructor o los parámetros. Si creamos un método que tiene parámetros con el mismo nombre de los atributos de la clase, necesitaríamos la keyword ***this*** para diferenciarlos uno del otro.

```java
String nombre;
String apellido;
int edad;

public void(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
}
```

En el ejemplo anterior, la keyword ***this*** es necesaria, pues los parámetros del método tienen el mismo nombre que los atributos de la clase y habrá que diferenciarlos.

```java
String nombre;
String apellido;
int edad;

public void(String n, String a, int e) {
		nombre = n;
		apellido = a;
		edad = e;
}
```

En el ejemplo anterior la keyword ***this*** no haría falta, pues los parámetros tienen distinto nombre a los atributos de la clase y no hace falta diferenciación.

### Sobrescribir un método

Este método lo que permite es sobrescribir sobre el método toString() perteneciente de la clase Object (una superclase) de las que derivan todas las clases. Object es una superclase de cualquier clase.

Cada vez que llame al método toString() <'asociado a System.out.println();'> me devolveré un 'template' de como se imprimirá el código. Este método si le pasas por parámetro el objeto lo imprimirá junto a los valores del objeto.

```java
public String toString() {
            System.out.println();
            System.out.println("Cantidad: "+this.cantidad);
            return "Titular: "+this.titular+" Cantidad: "+this.cantidad;
        }
```

### Subclases

Esta nueva clase en realidad es una subclase de la superclase 'Bicicleta'. Se utiliza la keyword 'extends' para heredar
de una superclase sus atributos y metodos. Estos atributos heredados de la superclase pueden ser modificados
dentro de la subclase. A la vez puede haber una subclase de otra subclase.

```java
static class Triciclo extends  Bicicleta {
        int ruedas = 4;
        void getInfoRuedas() {
            System.out.println("Ruedas: "+ruedas);
        }
    }
```

Esta es una subclase de una subclase, que a la vez hereda tanto los atributos como metodos de la superclase.

```java
static class TricicloDos extends Triciclo {
    }
```