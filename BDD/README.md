# Bases de datos

#Tabla de contenidos
- [Bases de datos básicos](#bases-de-datos-básicos)
- [Conceptos](#conceptos)
- [Modelo relacional](#modelo-relacional)
	- [Diseño de una base de datos relacional][#diseño-de-una-base-de-datos-relacional]
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
