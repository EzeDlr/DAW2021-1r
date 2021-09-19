# Bases de datos

# Tabla de contenidos
- [Bases de datos básicos](#bases-de-datos-básicos)
- [Conceptos](#conceptos)
- [Modelo relacional](#modelo-relacional)
	- [Diseño de una base de datos relacional](#dise-o-de-una-base-de-datos-relacional)
	- [Tabla intermedia](#tabla-intermedia)
- [Modelo no relacional](#modelo-no-relacional)
- [SQL](#sql)
 	- [Definición de datos](#definición-de-datos)
 	- [CREATE](#create)
 	- [ALTER TABLE](#alter-table)
 	- [DROP](#drop)
 	- [PRIMARY KEY](#primary-key)
 
 - [Manipulación de datos]
 	- [SELECT FROM](#select-from)
 	- [INSERT INTO](#insert-into)
 	- [DELETE FROM](#delete-from)
 	- [UPDATE](#update)

# Bases de datos básicos

Una base de datos es una coleccion de informacion sobre un contexto o problema. Las bases de datos se organizan mediante tablas que almacenan informacion relacionada a un objeto, las tablas se relacionan formando *relaciones* que mantienen la informacion de los diversos objetos de forma ordenada y coherente.

Las tablas estan formadas por una estructura donde cada fila almacena un *registro* (un objeto) con tantos *campos* (dato de la informacion) como columnas haya. ***Las filas almacenan los registros y las columnas los campos.***

[Campos y registros](https://www.notion.so/97664e6bb51c4ecbbe9959809227f6f5)

Las *columnas* corresponden a los *campos* de ***nombre y apellido*** y las *filas* corresponden a los *registros* que corresponde a ***ezequiel, leandro, de la rosa, del rosario.***

# Conceptos

- ***Tabla:*** es un conjunto de registros que se representan todos bajo un mismo nombre. Por ejemplo: todos los registros sobre clientes en una base de datos perteneceran a la tabla clientes.
- ***Datos:*** es informacion concreta/especifica sobre un concepto. Por ejemplo: al rellenar los registros de una tabla estamos ingresando datos que son especificos.
- ***Tipos de datos:*** indican la naturaleza del campo y que tipo de dato se puede insertar en los registros que corresponden a ese campo. Por ejemplo: un campo con tipo de datos numeros, sus registros unicamente pueden ser rellenados con este tipo de datos, es decir; numeros.
- ***Campos/columnas:*** es un identificador para todo un conjunto de datos *(para dato un conjunto de registros).*
- ***Registros/filas:*** son una recolección de datos referentes a un mismo concepto. Por ejemplo: los registros de una persona podrian ser sus datos como *nombre, apellido, dni, fecha de nacimiento.*
- ***Consulta:*** son instrucciones para hacer peticiones a bases de datos. Hay consultas de busqueda de registro, insercion, modificacion, actualizacion o eliminacion de registros y todo esto se hace mediante consultas.
- ***Esquema:*** las bases de datos estan estructuras a traves de un esquema; esto es la definicion de como una base de datos esta estructurada mediante tablas, columnas/campos, filas/registros y otros metodos utilizados para el tratamiento de datos. Los esquemas tambien son llamados *metainformacion* es decir, un esquema brinda informacion sobre la informacion. ***Informacion sobre como esta estructurada mi informacion.***
- ***Campo clave:*** es un campo especial que identifica de forma unica a un registro. Por ejemplo: en una tabla podriamos tener dos personas con el mismo nombre y apellido, pero no con el mismo numero de DNI.
- ***Vista:*** es una tabla virtual cuyo contenido esta formado por una consulta. Al igual que una tabla una vista esta formada por filas y columnas pero estas no son creadas por la vista en si, si no adquiridas por las consultas hechas a otras tablas.
- ***Indice***
- ***Informe***
- ***Guiones***
- ***Procedimientos***

# Modelo relacional

Es aquella que se basa en las relaciones que los datos tienen entre si y no se tienen en cuenta el orden de almacenamiento.

> *En los modelos relacionales siempre tenemos una llave que identifica, el ID.*

Tienes una *tabla* llamada ***producto*** la cual esta relacionada con otras 4 tablas mas ***proveedor, presentación, marca y zona.*** 

Veamos la tabla ***proveedor y producto*** de forma relacional. Dentro de la tabla *proveedor* existe un campo llamado *id_proveedor* este campo representa un *ID* especifico para cado registro que sera un numero único.

Vamos ahora a la tabla ***producto*** donde aparte de sus campos específicos existe un campo llamado *id_proveedor* y los registros de este campo harán referencia al numero *ID* de la tabla ***proveedor***. 

> No copias los mismos datos que habría en la tabla proveedor hacia la tabla producto, unicamente creas un campo que hara referencia a un registro de la otra tabla y así poder  mediante este ID consultar mas en su respectiva tabla.

## Diseño de una base de datos relacional

Este es el diseño relacional de una base de datos perteneciente al sistema de *Academias.*

1. *Definir los elementos de nuestro sistema*

Los elementos del sistema que forman una academia serian la **Academia** en si, los **profesores, alumnos, cursos y notas**. 

1. *Definir los campos de cada tabla*

1. *Pensar en la relación que habría con cada tabla*

Una **Academia** esta formada por varios **Profesores**, pues la tabla de *Profesores tiene una relación con la tabla de Academia,* pues un profesor pertenece a una academia.

Los **Alumnos** pertenecen unicamente a una **Academia,** pues la tabla de *Alumnos* tiene una relación con la tabla de *Academia.*

Los **Cursos** son impartidos por profesores. *Un profesor puede impartir varios cursos pero un curso no puede ser impartido por varios profesore*s. Por lo tanto la tabla de *Cursos* tiene una relación con la tabla de *Profesores.*

Las **Notas** pertenecen a **Alumnos** que realizan **Cursos.** Por lo tanto la tabla Nota*s* tiene relación con la tabla *Alumno y Cursos.*

## Tabla intermedia

Siguiendo el ejemplo anterior; un curso puede ser realizado por varios alumnos, y varios alumnos pueden realizar varios cursos. A eso se le llama una ***relación de a muchos*** y la mejor forma de representarla en el diseño de una base de datos es mediante una ***tabla intermedia.***

La tabla ***Alumno_x_Cursos*** es una tabla intermedia que identificara mediante el *ID* a alumnos específicos que realizarán cursos identificados mediante el *ID.*

# Modelo no relacional

*Estan diseñadas para modelos de datos específicos.* Se caracterizan por no utilizar el lenguaje ***SQL***. La información en estos modelos no relacionales no se estructura en *columnas y filas (campos y registros) sino en **documentos.***

*El modelo no relacional se utiliza cuando no se tiene clara la estructura de un conjunto de datos.*

Tomemos como ejemplo una base de datos en la que se van a almacenar DVDs de películas. Estos podrían almacenarse según el título de la película, fecha de estreno, género, director, etc.

- En una ***base de datos relacional***, cada película sería un registro y ocuparía una de las filas de la tabla. Por su parte, los diferentes datos almacenados sobre cada película (título, fecha de estreno, género o director) se organizarían en campos, que corresponderían a las columnas de la tabla.
    - Sin embargo, ***en una base de datos NoSQL o no relacional*** cada registro de una película se almacena como un único documento JSON. Todos los atributos o características de cada película (título, fecha de estreno, género y director) se almacenan en un solo documento, Es decir, este almacenamiento de datos está preparado para ofrecer una mayor escalabilidad horizontal y un desarrollo más intuitivo. *Cada documento correspondra a una pelicula en especifico y su escabilidad sera mas facil, pues nuevos datos introducidos corresponderan a una pelicula en especifico.*

# SQL

SQL es un lenguaje de dominio especifico diseñado para obtener, calcular y registrar informacion en bases de datos relacionales. SQL es el lenguaje MySQL(por ejemplo) es la base de datos, con SQL podemos interaccionar encima de esta base de datos.

## Definición de datos

[](https://github.com/EzeDlr/Bases-de-datos/blob/main/definicion.sql)

### CREATE

***CREATE*** es la instruccion para la creacion de objetos como base de datos o  tablas.

```sql
//Creación de la base de datos
CREATE DATABASE nombreBaseDeDatos;

//Creacion de tablas. Las tablas son creadas dentro de las bases de datos
CREATE TABLE nombreTabla
(
       nombreColumna [tipo de dato]INT,
       nombreColumna2 [tipo de dato] VARCHAR (255)[tipo de dato para strings][tamaño 255maximo] ,
       nombreColumna3 [tipo de dato] CURRENT_DATE ++[fecha]
)
```

### ALTER TABLE

***ALTER TABLE*** es la keyword para modificar, borrar o agregar columnas a una tabla ya creada. Funciona sin parentesis.

```sql
ALTER TABLE nombreTabla << IMPORTANTE: NO USA PARENTESIS >>

   Añadir columna
   ADD nombreColumna4 [tipo de dato] VARCHAR(255)

   Borrar una columna
   DROP COLUMN nombreColumna3 [nombre de la columna]

   Cambiar tipo de dato de columna
   ALTER COLUMN nombreColumna3 INT [nombre de la columna] [nuevo tipo de dato]
           // MODIFY COLUMN EN MYSQL <<  IMPORTANTE  >>
```

### **DROP**

***DROP*** es la keyword utilizada para eliminar objetos como bases de datos, tablas o columnas. TRUNCATE TABLE es la keyword utilizada para resetear una tabla. La elimina y la vuelve a crear.

```sql
KEYWORD para borrar tablas.
DROP TABLE objetoAEliminar

KEYWORD para borrar bases de datos.
DROP DATABASE nombreBaseDeDatos

Borrar una columna
ALTER TABLE nombreTabla
DROP COLUMN nombreColumna3 [nombre de la columna]

KEYWORD para resetear la tabla borrandola y volviendola a crear,
TRUNCATE TABLE  nombreTabla
```

### PRIMARY KEY

***PRIMARY KEY*** o campo clave es un campo especial que identifica de forma unica a un registro.

Por ejemplo: en una tabla podriamos tener 3 columnas (DNI, nombre, apellido) y la informacion de dos personan rellenando los registros, las dos personas tienen el mismo nombre pero nunca el mismo DNI, por lo tanto la podriamos diferenciar mediante su DNI que es su campo clave.

```sql
CREATE TABLE testeo(
	dni INT NOT NULL AUTOINCREMENT,
	nombre VARCHAR(255),
	apellido VARCHAR(255),
	PRIMARY KEY(dni)
)
```

## Manipulación de datos

[](https://github.com/EzeDlr/Bases-de-datos/blob/main/manipulacion.sql)

### SELECT  FROM

***SELECT  FROM*** es la keyword para seleccionar los campos/columnas que queremos de una tabla.

```sql
SELECT [nombre columna] FROM [nombre tabla]
WHERE campo='registro' AND/OR/NOT [operador booleano *no obligatorio*] campo='registro'
```

### INSERT INTO

***INSERT INTO*** es la keyword para la inserción de datos en una tabla.

```sql
INSERT INTO [nombre tabla] (nombreColumna1, nombreColumna2, nombreColumna3)
values ("registro de nombreColumna1", "registro de nombreColumna", registro de nombreColumna3(si fuera un entero));
```

### DELETE FROM

***DELETE FROM*** es la sentencia para eliminar registros de una tabla.

```sql
DELETE FROM [nombre tabla] //borraria todos los registros de una tabla.
DELETE FROM [nombre tabla] WHERE nombreColumna='nombreRegistro'; //borraria unos registros en especifico
```

### UPDATE

***UPDATE*** es la keyword para modificar uno o varios registros.

```sql
UPDATE [nombre tabla] SET [campo/columna='nuevo valor'] //afectara a todos los registros de la tabla
UPDATE [nombre tabla] SET [campo/columna='nuevo valor'] WHERE nombreColumna='valor registro'; //afectara al registro que corresponda a la condicion.
```
