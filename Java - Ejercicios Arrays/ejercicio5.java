import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        /* Ejercicio 5: Busca palabras en arrays.
        Un programa que permita al usuario ingresar un texto y luego le da la
        opción de buscar una palabra específica, mostrando como resultado
        el rango de posiciones donde se encontró la palabra exacta. (Sin darle
        importancia a mayúsculas o minúsculas). */
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el texto:");
        String texto = scanner.nextLine().toLowerCase();
        scanner.nextLine(); 

        System.out.println("Ingrese la palabra a buscar:");
        String palabraBuscada = scanner.nextLine().toLowerCase();
        scanner.nextLine();

        int posicionInicial = texto.indexOf(palabraBuscada);
        int posicionFinal = posicionInicial + palabraBuscada.length();
        int contador = 1;
        while (posicionInicial != -1) {
            System.out.println("La palabra '" + palabraBuscada + "' se encuentra en la posición " + posicionInicial + " al " + posicionFinal + ".");
            posicionInicial = texto.indexOf(palabraBuscada, posicionFinal);
            posicionFinal = posicionInicial + palabraBuscada.length();
            contador++;
        }
        System.out.println("La palabra '" + palabraBuscada + "' se ha encontrado " + (contador - 1) + " veces.");

        scanner.close();
    }
}
