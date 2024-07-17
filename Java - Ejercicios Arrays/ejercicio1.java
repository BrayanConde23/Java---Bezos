import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean salir = false;

        while (!salir) {
            System.out.println("""
                Menu de operaciones matematicas:
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """
                );
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                salir = true;
                System.out.println("Saliendo del programa...");
            } else if (opcion >= 1 && opcion <= 4) {
                double[] numeros = new double[2];
                System.out.print("Introduce el primer numero: ");
                numeros[0] = scanner.nextDouble();
                System.out.print("Introduce el segundo numero: ");
                numeros[1] = scanner.nextDouble();
                double resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = numeros[0] + numeros[1];
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = numeros[0] - numeros[1];
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = numeros[0] * numeros[1];
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (numeros[1] != 0) {
                            resultado = numeros[0] / numeros[1];
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Error: Division por cero.");
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } else {
                System.out.println("Opcion no valida.");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
