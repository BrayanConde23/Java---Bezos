import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        /* Ejercicio 6: Búsqueda por coincidencia en arrays.
        Crea un array de Strings (por ejemplo, nombres) y pide al usuario que
        ingrese un nombre. Busca ese nombre en el array que imprima si se
        encuentra la posición y si no un mensaje que no se encuentra. */

        Scanner scanner = new Scanner(System.in);

        String[] nombres = {"Juan", "Pedro", "Maria", "Jose", "Ana"};
        System.out.println("Ingrese un nombre:");
        String nombreBuscado = scanner.nextLine();
        scanner.close();

        int posicion = buscarNombre(nombres, nombreBuscado);
        if (posicion != -1) {
            System.out.println("El nombre '" + nombreBuscado + "' se encuentra en la posición " + (posicion + 1) + ".");
        } else {
            System.out.println("El nombre '" + nombreBuscado + "' no se encuentra en el array.");
        }
    }
    
    public static int buscarNombre(String[] nombres, String nombreBuscado) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                return i;
            }
        }
        return -1;
    }
}
