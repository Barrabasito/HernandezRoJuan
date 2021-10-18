#*Colecciones en Java*:question:

>Las colecciones en Java son almacenes unicamente de Objetos.

Los **arrays** o las **matrices**, en ellos, no solo podemos almacenar Objetos, sino también datos primitivos.

>:star2: La diferencia fundamental entre las colecciones y los arrays, es que, mientras que los arrays tiene un tamaño fijo, las colecciones en Java son totalmente dinámicas. Eso quiere decir que, podrán crecer o disminuir según la nuestras necesidades.

**Ventajas de las Colecciones en Java respecto a los Arrays**
* Puede cambiar de tamaño de forma dinámica.
* Se pueden insertar o eliminar elementos.
* Pueden ordenarse los objetos que existen dentro de la colección.

>:star2:***Las colecciones en Java heredan de una interfaz llamada Collection, esta interfaz contiene tres interfaces o colecciones que heredan o descienden de ella.***

*Estas son:*

**Set**
>Almacena objetos no repetidos y sin orden, las interfaces que heredan de esta interfaz son las siguientes.

Clases que heredan de la interfaz **Set**.

![Face Logo](https://www.clasesdeinformaticaweb.com/wp-content/uploads/2021/01/image.png)


**List**
>Puede almacenar objetos repetidos, aunque también admite objetos no repetidos. En este caso, cada uno de los objetos o elementos se encuentran indexados a través de un valor numérico. Normalmente sustituye a los vectores o arreglos. Este tipo de colección, permite acceder de forma aleatoria a un elemento.

Clases que heredan de la colección **List**.


![Face Logo](https://www.clasesdeinformaticaweb.com/wp-content/uploads/2021/01/image-1.png)

:star2:*Para finalizar con la interfaz List, vamos a ver un ejemplo de las formas en las que podemos declarar una colección de tipo ArrayList.*

**Ejemplo de codigo**

package colecciones;
 
import java.util.ArrayList;
 
public class Colecciones {
 
    public static void main(String[] args) {
        /* Ejemplo 1. */
        /* Crearemos una colección de tipo List. En este caso un ArrayList.
        Para crear este objeto, lo haremos de forma genérica. Es decir,
        no sabemos el tipo de dato que se almacenará en la coleccion.*/
        ArrayList coleccion = new ArrayList ();
         
        // Agregamos elementos a la colección con el método add().
        coleccion.add("Aprendiendo colecciones"); // Valor String
        coleccion.add(10); // Valor de entero
        coleccion.add(15.25); // Valor decimal
        coleccion.add("Ilerna"); //Valor texto
        coleccion.add('a'); // Valor tipo char
          
        // Para recorrer la coleccion usaremos un bucle for y el método size()
        for(int i = 0; i < coleccion.size(); i++) {
            System.out.println(coleccion.get(i));
        }
         
        /* Ejemplo 2. */
        /* Crearemos una colección de tipo List. En este caso un ArrayList.
        Para crear este objeto, lo haremos de forma en la que previamente
        sabremos el tipo de datos que se van a almacenar en la colección.*/
        ArrayList<String> coleccionEnteros = new ArrayList<String>();
         
        // Agregamos los elementos a la colección con el método add().
        coleccionEnteros.add("Elementos de tipo texto.");
        coleccionEnteros.add("Creando una colección con objetos tipo String.");
        coleccionEnteros.add("Este es el tercer elemento de la colección.");
          
        // Mostramos todo el contenido con el método toString() 
        System.out.println(coleccionEnteros.toString());
    }
}

**Queue**

>También denominadas colas. En este caso, no se puede acceder a un elemento de manera aleatoria. Es decir, solo podemos acceder a un objeto que se encuentre o bien al principio, bien al final o a ambos dos.

Clases que heredan de la interfaz **Queue**

![Face Logo](https://www.clasesdeinformaticaweb.com/wp-content/uploads/2021/01/image-3.png)

#***Otras colecciones.***

Además de estas tres interfaces, existe otra llamada **Map**, aunque esta última no forma parte de la cadena de herencia de la interfaz Collection.

Esta colección, permite almacenar una serie de objetos repetidos e indexados por una clave única arbitraria, es decir una clave que no tiene porque ser necesariamente un valor numérico. Esto podemos asemejarlo a un array asociativo en PHP.

Para finalizar con las interfaces correspondientes a las colecciones en java, debemos tener en cuenta que las **interfaces Set y Map, contienen unas sub – interfaces llamadas SortedSet y SortedMap respectivamente** que permiten hacer alguna cosa más en cuanto a ordenamiento.


----------------------------------------------------------------------------------

#*Java Collections Framework*:question:

>Es una arquitectura unificada para representar y manipular colecciones . Contiene interfaces, sus clases de implementación y algoritmos para procesar los datos almacenados en una colección. La interfaz de Colección se amplía con otras interfaces como Lista, Conjunto y Cola.

:star2:**Nota :** También hay una interfaz de Mapa, pero no implementa la interfaz de Colección porque almacena pares clave-valor, y las clases que vienen bajo la interfaz de Colección solo almacenan valores.

**Diferencias entre el marco de colecciones y las colecciones :**
* Colecciones Framework es una interfaz, mientras que Colecciones es una clase.
* La interfaz de Colección brinda la funcionalidad estándar de estructuras de datos para Lista , Establecer y Cola . La clase Colecciones proporciona métodos estándar que puede utilizar para buscar, ordenar y coordinar elementos de colección.
* Las colecciones son objetos que representan un grupo de objetos (como Vector ), mientras que el marco de colecciones puede representar y manipular colecciones.

**Los componentes de Java Collections Framework**
> **Interfaces :** estas interfaces proporcionan el tipo de datos abstracto para representar la colección. **El java.util.Collectiones** la interfaz raíz del marco. Es en la parte superior de la jerarquía del marco y contiene métodos importantes, como **size(), iterator(), add(), remove(), y clear().**

La interfaz iterable es la raíz de todo el marco de la colección. Permite que el iterador recorra todas las colecciones. Todas las clases e interfaces utilizan esta interfaz. La interfaz de la colección extiende la interfaz iterable y es ejecutada por las clases en el marco de la colección. La interfaz de lista inhibe una estructura de datos de tipo lista donde podemos almacenar colecciones ordenadas de objetos.

**Algunas interfaces más importantes incluyen:**
* Interfaz de mapa: **java.util.Map**
* Establecer interfaz: **java.util.Set**
* Interfaz deque: **java.util.Deque**

:star2:**Nota :** La interfaz del mapa es la única que no hereda de la interfaz de la colección, pero está incluida en el marco de las colecciones. Todas las interfaces del marco están en el paquete java.util.

> **Clases de implementación :** el marco proporciona clases de implementación para colecciones. Puede usarlos para crear diferentes tipos de colecciones en sus programas Java. Algunas de las principales clases de recolección incluyen: 

* **ArrayList**
* **LinkedList**
* **PriorityQueue**
* **HashMap** y **HashSet**
* **TreeMap** y **TreeSet**

 >Algoritmos : estos algoritmos realizan funciones importantes en colecciones, como ordenar listas.

 ***La jerarquía del marco de colecciones es la siguiente:***
 ![Face Logo](https://www.educative.io/cdn-cgi/image/f=auto,fit=contain,w=1800/api/page/5582979315793920/image/download/6709185406828544)