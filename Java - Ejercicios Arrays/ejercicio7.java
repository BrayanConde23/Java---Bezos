public class ejercicio7 {
    public static void main(String[] args) {
        /* Ejercicio 7: Transposición de una Matriz en arrays.
        Crea un programa en Java que calcule la transpuesta de una matriz
        (intercambiar filas por columnas). */

        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        int[][] transpuesta = calcularTranspuesta(matriz);
    
        System.out.println("\nMatriz transpuesta:");
        mostrarMatriz(transpuesta);
    }
    
    public static int[][] calcularTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        int[][] transpuesta = new int[columnas][filas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        
        return transpuesta;
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
