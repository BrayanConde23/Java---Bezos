public class ejercicio10 {
    public static void main(String[] args){
        /* Ejercicio 10: Invertir un Array
        Escribe un programa en Java que invierta el orden de los elementos
        en un array de números enteros.(Sin métodos). */

        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Array invertido: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
