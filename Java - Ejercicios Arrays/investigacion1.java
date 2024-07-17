/* Un ArrayList es una estructura de datos en Java que implementa la interfaz List. Pertenece al paquete java.util y se utiliza para almacenar una colección de elementos de manera dinámica. Esto significa que puedes agregar, eliminar, y acceder a elementos de manera eficiente sin necesidad de especificar el tamaño inicial de la lista. 

----- Métodos para añadir elementos: -----

boolean add(E elemento): Añade el elemento especificado al final de la lista.

void add(int índice, E elemento): Inserta el elemento especificado en el índice especificado de la lista.

----- Métodos para acceder y modificar elementos: -----

E get(int índice): Devuelve el elemento en el índice especificado.

E set(int índice, E nuevoElemento): Reemplaza el elemento en el índice especificado con el nuevo elemento y devuelve el elemento original.

----- Métodos para eliminar elementos: -----

boolean remove(Object objeto): Elimina la primera ocurrencia del objeto especificado de la lista si está presente.

E remove(int índice): Elimina el elemento en el índice especificado de la lista y devuelve el elemento eliminado.

void clear(): Elimina todos los elementos de la lista.

----- Métodos de búsqueda y verificación: -----

int indexOf(Object objeto): Devuelve el índice de la primera ocurrencia del objeto especificado en la lista, o -1 si no se encuentra.

boolean contains(Object objeto): Devuelve true si la lista contiene el objeto especificado.

boolean isEmpty(): Devuelve true si la lista está vacía (sin elementos).

----- Otros métodos útiles: -----

int size(): Devuelve el número de elementos en la lista.

Object[] toArray(): Devuelve un array que contiene todos los elementos de la lista en el mismo orden. */

import java.util.ArrayList; // Importamos la clase ArrayList desde java.util
import java.util.Collections;

public class investigacion1 {
    // EJEMPLO ARRAYLIST:

    public static void main(String[] args) {
        // Creamos un ArrayList de tipo String
        ArrayList<String> listaFrutas = new ArrayList<>();

        // Añadimos elementos a la lista
        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Cereza");
        listaFrutas.add("Durazno");

        // Imprimimos la lista completa
        System.out.println("Lista de frutas: " + listaFrutas);

        // Accedemos a un elemento específico mediante su índice
        String fruta = listaFrutas.get(1); // Obtenemos la segunda fruta (índice 1)
        System.out.println("Segunda fruta: " + fruta);

        // Modificamos un elemento
        listaFrutas.set(2, "Fresa"); // Reemplazamos "Cereza" por "Fresa"
        System.out.println("Lista de frutas actualizada: " + listaFrutas);

        // Eliminamos un elemento
        listaFrutas.remove("Durazno"); // Eliminamos "Durazno" de la lista
        System.out.println("Lista de frutas después de eliminar 'Durazno': " + listaFrutas);

        // Tamaño de la lista
        System.out.println("Tamaño de la lista: " + listaFrutas.size());

        // Verificamos si la lista contiene un elemento específico
        boolean contieneManzana = listaFrutas.contains("Manzana");
        System.out.println("¿La lista contiene 'Manzana'? " + contieneManzana);

        // Eliminamos todos los elementos de la lista
        listaFrutas.clear();
        System.out.println("Lista de frutas después de limpiar: " + listaFrutas);

        // Verificamos si la lista está vacía
        boolean estaVacia = listaFrutas.isEmpty();
        System.out.println("¿La lista está vacía? " + estaVacia);

        EjemploMetodos();
    }

    /* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */

    /* Los ArrayList en Java ofrecen una variedad de métodos para manipular y trabajar con los elementos almacenados en la lista. Aquí te proporciono una lista de algunos de los métodos más comúnmente utilizados en la clase ArrayList: */

    // EJEMPLO ARRAYLIST CON METODOS:

    public static void EjemploMetodos() {

        // Creamos un ArrayList de tipo Integer
        ArrayList<Integer> numeros = new ArrayList<>();

        // Añadimos elementos a la lista
        numeros.add(10);
        numeros.add(5);
        numeros.add(8);
        numeros.add(15);
        numeros.add(3);

        // Imprimimos la lista completa
        System.out.println("Lista de números: " + numeros);

        // Ordenamos la lista en orden ascendente
        Collections.sort(numeros);
        System.out.println("Lista de números ordenada: " + numeros);

        // Reversamos la lista
        Collections.reverse(numeros);
        System.out.println("Lista de números reversada: " + numeros);

        // Creamos una sublista usando sublist()
        ArrayList<Integer> subLista = new ArrayList<>(numeros.subList(1, 4));
        System.out.println("Sublista de números: " + subLista);

        // Convertimos la lista a un array
        Integer[] arrayNumeros = new Integer[numeros.size()];
        numeros.toArray(arrayNumeros);
        System.out.print("Array de números: ");
        for (Integer num : arrayNumeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Comprobamos si un número está presente en la lista
        boolean contiene15 = numeros.contains(15);
        System.out.println("¿La lista contiene el número 15? " + contiene15);

        // Eliminamos un elemento por índice
        Integer eliminado = numeros.remove(2); // Eliminamos el elemento en la posición 2 (valor 8)
        System.out.println("Lista después de eliminar el número 8: " + eliminado);

        // Tamaño de la lista
        System.out.println("Tamaño de la lista: " + numeros.size());

        // Limpiamos la lista
        numeros.clear();
        System.out.println("Lista de números después de limpiar: " + numeros);

        // Verificamos si la lista está vacía
        boolean estaVacia = numeros.isEmpty();
        System.out.println("¿La lista está vacía? " + estaVacia);
    }
}


