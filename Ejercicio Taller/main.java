import java.util.Scanner;

public class TallerDeMotosYCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la capacidad máxima del taller: ");
        int maxEmployees = scanner.nextInt();

        System.out.print("Ingrese el número de trabajos a registrar: ");
        int numTrabajos = scanner.nextInt();

        if (numTrabajos > maxEmployees) {
            System.out.println("Error: número de trabajos supera la capacidad máxima del taller.");
            return;
        }

        String[][][] trabajos = new String[maxEmployees][2][4];

        for (int i = 0; i < numTrabajos; i++) {
            System.out.print("Ingrese el nombre del empleado: ");
            String empleado = scanner.next();

            System.out.print("Ingrese el tipo de vehículo (Moto/Carro): ");
            int tipoVehiculo = scanner.nextInt();
            String tipo = tipoVehiculo == 0? "Moto" : "Carro";

            System.out.print("Ingrese la marca: ");
            String marca = scanner.next();

            System.out.print("Ingrese el modelo: ");
            String modelo = scanner.next();

            System.out.print("Ingrese el año: ");
            String año = scanner.next();

            System.out.print("Ingrese el estado: ");
            String estado = scanner.next();

            trabajos[i][0][0] = empleado;
            trabajos[i][1][0] = tipo;
            trabajos[i][1][1] = marca;
            trabajos[i][1][2] = modelo;
            trabajos[i][1][3] = año;
            trabajos[i][1][4] = estado;
        }

        System.out.println("Agenda de trabajos:");
        System.out.println("| Tipo | Marca | Modelo | Año | Estado |");

        for (int i = 0; i < numTrabajos; i++) {
            System.out.println("| " + trabajos[i][1][0] + " | " + trabajos[i][1][1] + " | " + trabajos[i][1][2] + " | " + trabajos[i][1][3] + " | " + trabajos[i][1][4] + " |");
        }

        int pendientes = 0;
        int reparados = 0;
        int vendidos = 0;

        for (int i = 0; i < numTrabajos; i++) {
            if (trabajos[i][1][4].equalsIgnoreCase("Pendiente")) {
                pendientes++;
            } else if (trabajos[i][1][4].equalsIgnoreCase("Reparado")) {
                reparados++;
            } else if (trabajos[i][1][4].equalsIgnoreCase("Vendido")) {
                vendidos++;
            }
        }

        System.out.println("Estado de los vehículos:");
        System.out.println("Pendientes: " + pendientes);
        System.out.println("Reparados: " + reparados);
        System.out.println("Vendidos: " + vendidos);

        System.out.print("Ingrese la marca y modelo del vehículo a buscar (separados por espacio): ");
        String buscar = scanner.next();
        String[] partes = buscar.split(" ");
        String marcaBuscar = partes[0];
        String modeloBuscar = partes[1];

        boolean encontrado = false;
        
        for (int i = 0; i < numTrabajos; i++) {
            if (trabajos[i][1][1].equalsIgnoreCase(marcaBuscar) && trabajos[i][1][2].equalsIgnoreCase(modeloBuscar)) {
                System.out.println("Vehículo encontrado:");
                System.out.println("Tipo: " + trabajos[i][1][0]);
                System.out.println("Marca: " + trabajos[i][1][1]);
                System.out.println("Modelo: " + trabajos[i][1][2]);
                System.out.println("Año: " + trabajos[i][1][3]);
                System.out.println("Estado: " + trabajos[i][1][4]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }

        System.out.print("Ingrese la marca y modelo del vehículo a actualizar (separados por espacio): ");
        buscar = scanner.next();
        partes = buscar.split(" ");
        marcaBuscar = partes[0];
        modeloBuscar = partes[1];

        System.out.print("Ingrese el nuevo estado: ");
        String nuevoEstado = scanner.next();

        encontrado = false;

        for (int i = 0; i < numTrabajos; i++) {
            if (trabajos[i][1][1].equalsIgnoreCase(marcaBuscar) && trabajos[i][1][2].equalsIgnoreCase(modeloBuscar)) {
                trabajos[i][1][4] = nuevoEstado;
                System.out.println("Estado del vehículo actualizado.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }
    }
}
