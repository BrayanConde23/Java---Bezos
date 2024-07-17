import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        /* Ejercicio 3: Notas de un curso en arrays.
        Crea un programa que calcula la calificación promedio que se necesita
        obtener en las notas faltantes de un curso para aprobarlo,
        considerando la cantidad de calificaciones totales, las calificaciones ya
        obtenidas, el puntaje mínimo requerido para aprobar y la cantidad de
        notas faltantes. Importante: el total de notas del curso será de 8 notas,
        la calificación será de 0 a 100 y el promedio mínimo para aprobar el
        curso es de 76. */

        Scanner scanner = new Scanner(System.in);

        int[] notas = {50, 66, 78, 92, 82};
        double promedio = 76;
        int notasFaltantes = 8 - notas.length;

        double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
        }

        double promedioObtenido = sumaNotas / notas.length;
        double diferenciaPromedio = promedio - promedioObtenido;

        if (promedioObtenido >= promedio) {
            System.out.println("Usted ya ha aprobado el curso.");
        } else {
            System.out.println("Usted necesita un promedio mínimo de " + diferenciaPromedio + " para aprobar el curso.");
        }

        System.out.println("Usted tiene " + notasFaltantes + " notas faltantes.");

        scanner.close();
    }
}
