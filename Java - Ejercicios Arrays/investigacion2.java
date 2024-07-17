/* En el contexto de la programación, especialmente en Java y otros lenguajes de programación orientados a objetos, un Map es una estructura de datos que permite almacenar pares de clave-valor, donde cada clave es única y se utiliza para recuperar el valor asociado a esa clave. En resumen, un Map asocia claves con valores, similar a cómo un diccionario funciona en otros contextos. 

----- Características principales de un Map: -----

Claves únicas: Cada clave en un Map debe ser única dentro de la colección. No puede haber dos claves iguales.

Asociación clave-valor: Cada clave en un Map está asociada a exactamente un valor. Esta relación se llama mapeo clave-valor.

Permite valores nulos: En la mayoría de las implementaciones de Map, tanto las claves como los valores pueden ser null. Sin embargo, en implementaciones como HashMap, puede haber una única clave null.

Implementaciones variadas: Java proporciona varias implementaciones de la interfaz Map, cada una con características específicas para diferentes necesidades de uso. Algunas de las implementaciones comunes son HashMap, TreeMap, LinkedHashMap, Hashtable, etc. */

import java.util.HashMap;
import java.util.Map;

public class investigacion2 {
    public static void main(String[] args) {
        // Crear un HashMap de tipo String para almacenar nombres y edades
        Map<String, Integer> mapaNombresEdades = new HashMap<>();

        // Añadir elementos al mapa
        mapaNombresEdades.put("Juan", 30);
        mapaNombresEdades.put("María", 25);
        mapaNombresEdades.put("Carlos", 35);

        // Acceder a un valor mediante su clave
        int edadJuan = mapaNombresEdades.get("Juan");
        System.out.println("La edad de Juan es: " + edadJuan);

        // Verificar si una clave está presente en el mapa
        boolean existeMaria = mapaNombresEdades.containsKey("María");
        System.out.println("¿Existe María en el mapa? " + existeMaria);

        // Eliminar un elemento del mapa
        mapaNombresEdades.remove("Carlos");
        System.out.println("Mapa después de eliminar a Carlos: " + mapaNombresEdades);

        // Iterar sobre todas las entradas del mapa
        for (Map.Entry<String, Integer> entry : mapaNombresEdades.entrySet()) {
            String nombre = entry.getKey();
            int edad = entry.getValue();
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }

        // Obtener el tamaño del mapa
        int tamañoMapa = mapaNombresEdades.size();
        System.out.println("Tamaño del mapa: " + tamañoMapa);

        // Limpiar el mapa
        mapaNombresEdades.clear();
        System.out.println("Mapa después de limpiar: " + mapaNombresEdades);

        EjemploMetodos();
    }

    /* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */

    /* En Java, la clase HashMap es una implementación común de la interfaz Map. Aquí hay una lista de métodos importantes de la interfaz Map y la clase HashMap: 
    
    ----- Métodos de la interfaz Map: -----

    put(K key, V value): Asigna el valor value a la clave key. Si la clave ya tiene un valor asociado, se reemplaza.

    putAll(Map<? extends K, ? extends V> m): Copia todos los mapeos de m al mapa actual.

    putIfAbsent(K key, V value): Asigna el valor value a la clave key si la clave no está ya asociada a un valor.

    get(Object key): Devuelve el valor al que está mapeada la clave especificada, o null si el mapa no contiene un mapeo para la clave.

    remove(Object key): Elimina el mapeo para una clave específica si está presente.

    remove(Object key, Object value): Elimina la entrada para una clave específica solo si está actualmente mapeada al valor especificado.

    containsKey(Object key): Devuelve true si el mapa contiene un mapeo para la clave especificada.

    containsValue(Object value): Devuelve true si el mapa mapea una o más claves al valor especificado.

    isEmpty(): Devuelve true si el mapa no contiene ningún mapeo de claves a valores.

    size(): Devuelve el número de mapeos de clave-valor en el mapa.

    clear(): Elimina todos los mapeos del mapa.

    keySet(): Devuelve un conjunto de las claves contenidas en el mapa.

    values(): Devuelve una colección de los valores contenidos en el mapa.

    entrySet(): Devuelve un conjunto de los mapeos contenidos en el mapa.

    replace(K key, V value): Reemplaza la entrada para la clave especificada solo si está actualmente mapeada a algún valor.

    replace(K key, V oldValue, V newValue): Reemplaza la entrada para la clave especificada solo si está actualmente mapeada al valor especificado.

    getOrDefault(Object key, V defaultValue): Devuelve el valor al que está mapeada la clave especificada, o defaultValue si el mapa no contiene un mapeo para la clave.

    ----- Métodos de la clase HashMap: -----

    La clase HashMap en Java hereda de la interfaz Map y proporciona implementaciones concretas de estos métodos. Además, HashMap ofrece algunos métodos específicos, como:

    clone(): Devuelve una copia superficial del HashMap.

    compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction): Intenta calcular un mapeo para la clave especificada y su valor actual (o null si no existe un mapeo actual).

    computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction): Si la clave especificada no está presente en el mapa, intenta calcular su valor usando la función de mapeo especificada y la introduce en el mapa.

    computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction): Si el valor para la clave especificada está presente y no es null, intenta calcular un nuevo mapeo dado el valor clave actual.

    merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction): Si la clave especificada no está presente o está asociada con null, asocia la clave con el valor dado. De lo contrario, reemplaza el valor actual con el resultado de la función de remapeo. */

    public static void EjemploMetodos() {
        // Crear un HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Agregar elementos al mapa
        map.put("Uno", 1);
        map.put("Dos", 2);
        map.put("Tres", 3);

        // Obtener un valor asociado a una clave
        int value = map.get("Dos");
        System.out.println("Valor de 'Dos': " + value);

        // Verificar si una clave existe
        boolean hasKey = map.containsKey("Tres");
        System.out.println("¿El mapa contiene la clave 'Tres'? " + hasKey);

        // Verificar si un valor existe
        boolean hasValue = map.containsValue(3);
        System.out.println("¿El mapa contiene el valor 3? " + hasValue);

        // Eliminar una clave-valor del mapa
        map.remove("Uno");
        System.out.println("Mapa después de eliminar 'Uno': " + map);

        // Reemplazar el valor asociado con una clave
        map.replace("Dos", 22);
        System.out.println("Mapa después de reemplazar 'Dos': " + map);

        // Obtener un valor con un valor predeterminado si la clave no existe
        int defaultValue = map.getOrDefault("Cuatro", 0);
        System.out.println("Valor de 'Cuatro' (predeterminado 0): " + defaultValue);

        // Iterar sobre las claves y valores del mapa
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Usar computeIfAbsent para agregar un valor si la clave no está presente
        map.computeIfAbsent("Cinco", k -> 5);
        System.out.println("Mapa después de computeIfAbsent para 'Cinco': " + map);

        // Usar computeIfPresent para modificar un valor si la clave está presente
        map.computeIfPresent("Cinco", (k, v) -> v * 10);
        System.out.println("Mapa después de computeIfPresent para 'Cinco': " + map);

        // Limpiar el mapa
        map.clear();
        System.out.println("Mapa después de clear: " + map);
    }
}

