public class ejercicio9 {
    public static void main(String[] args) {
        /* Ejercicio 9: Contar coincidencias en un Array:
        Crea un programa que mire dentro de un array, si hay elementos
        repetidos y los cuente e imprima en pantalla en orden del elemento
        que más se repite al que menos. */

        int[] array = {1, 2, 3, 4, 5, 5, 6, 3, 2, 1, 1, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("El número " + array[i] + " no se repite.");
            } else {
                System.out.println("El número " + array[i] + " se repite " + count + " veces.");
            }
        }
    }
}
