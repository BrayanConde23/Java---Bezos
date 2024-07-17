public class ejercicio8 {
    public static void main(String[] args) {
        /* Ejercicio 8: Verificar Matriz Simétrica
        Crea un programa en Java que verifique si una matriz cuadrada es
        simétrica (igual a su transpuesta, Ejercicio 7). */

        int[][] matriz = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        int[][] transpuesta = calcularTranspuesta(matriz);
    
        System.out.println("\nMatriz transpuesta:");
        mostrarMatriz(transpuesta);

        esMatrizSimétrica(matriz);
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

    public static boolean esMatrizSimétrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j]!= matriz[j][i]) {
                    System.out.println("La matriz no es simétrica.");
                    return false;
                }
            }
        }

        if (esMatrizSimétrica(matriz)) {
            System.out.println("La matriz es simétrica.");
        }
        
        return true;
    }
}
