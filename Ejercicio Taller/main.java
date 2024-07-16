import java.util.Scanner;

public class TallerDeMotosYCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la capacidad máxima del taller: ");
        int maxEmployees = scanner.nextInt();
        scanner.nextLine();

        String[][][] taller = new String[maxEmployees][2][4];

        System.out.print("Ingrese el número de trabajos a registrar: ");
        int numTrabajos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numTrabajos; i++) {
            System.out.print("Ingrese el nombre del empleado: ");
            String nombreEmpleado = scanner.nextLine();

            int empleadoIndex = findEmptySlot(taller);
            
            if (empleadoIndex == -1) {
                System.out.println("El taller está lleno.");
                break;
            }
            
            System.out.print("Ingrese el tipo de vehículo (Moto/Carro): "); 
            String tipo = scanner.nextLine();
            int tipoIndex = tipo.equalsIgnoreCase("Moto") ? 0 : 1; 
            
            System.out.print("Ingrese la marca: "); 
            String marca = scanner.nextLine(); 
            
            System.out.print("Ingrese el modelo: "); 
            String modelo = scanner.nextLine(); 
            
            System.out.print("Ingrese el año: "); 
            String año = scanner.nextLine(); 
            
            System.out.print("Ingrese el estado (Pendiente, En reparación, Reparado): "); 
            String estado = scanner.nextLine(); 
            
            taller[empleadoIndex][tipoIndex][0] = marca; 
            taller[empleadoIndex][tipoIndex][1] = modelo; 
            taller[empleadoIndex][tipoIndex][2] = año; 
            taller[empleadoIndex][tipoIndex][3] = estado; 
        
        } mostrarAgendaDeTrabajos(taller); 
        
        System.out.print("Ingrese la marca del vehículo a buscar: "); 
        String marcaBuscar = scanner.nextLine(); 
        
        System.out.print("Ingrese el modelo del vehículo a buscar: "); 
        String modeloBuscar = scanner.nextLine(); 
        
        buscarVehiculo(taller, marcaBuscar, modeloBuscar); 
        
        System.out.print("Ingrese la marca del vehículo a actualizar: "); 
        String marcaActualizar = scanner.nextLine(); 
        
        System.out.print("Ingrese el modelo del vehículo a actualizar: "); 
        String modeloActualizar = scanner.nextLine(); 
        
        System.out.print("Ingrese el nuevo estado: "); 
        String nuevoEstado = scanner.nextLine(); 
        
        actualizarEstado(taller, marcaActualizar, modeloActualizar, nuevoEstado); 
        
        mostrarAgendaDeTrabajos(taller); 
        
        contarVehiculosPorEstado(taller); scanner.close(); } 
    private static int findEmptySlot(String[][][] taller) { 
        for (int i = 0; i < taller.length; i++) { 
            if (taller[i][0][0] == null && taller[i][1][0] == null) {
                return i; 
            } 
        } 
        return -1; 
    } 
    
    private static void mostrarAgendaDeTrabajos(String[][][] taller) { 
        System.out.println("Agenda de trabajos:"); 
        System.out.println("| Tipo | Marca | Modelo | Año | Estado |"); 
        System.out.println("|------|-------|--------|-----|--------|"); 
        
        for (int i = 0; i < taller.length; i++) { 
            for (int j = 0; j < 2; j++) { 
                if (taller[i][j][0] != null) { 
                    String tipo = (j == 0) ? "Moto" : "Carro"; 
                    
                    System.out.printf("| %s | %s | %s | %s | %s |%n", tipo, taller[i][j][0], taller[i][j][1], taller[i][j][2], taller[i][j][3]); 
                } 
            } 
        } 
    } 
    
    private static void buscarVehiculo(String[][][] taller, String marcaBuscar, String modeloBuscar) { 
        for (int i = 0; i < taller.length; i++) { 
            for (int j = 0; j < 2; j++) { 
                if (taller[i][j][0] != null && taller[i][j][0].equalsIgnoreCase(marcaBuscar) && taller[i][j][1].equalsIgnoreCase(modeloBuscar)) { 
                    String tipo = (j == 0) ? "Moto" : "Carro"; 
                    
                    System.out.printf("Vehículo encontrado: %s %s %s %s %s%n", tipo, taller[i][j][0], taller[i][j][1], taller[i][j][2], taller[i][j][3]); 
                    return; 
                } 
            } 
        } 
        
        System.out.println("Vehículo no encontrado."); 
    } 
    
    private static void actualizarEstado(String[][][] taller, String marcaActualizar, String modeloActualizar, String nuevoEstado) { 
        for (int i = 0; i < taller.length; i++) { 
            for (int j = 0; j < 2; j++) { 
                if (taller[i][j][0] != null && taller[i][j][0].equalsIgnoreCase(marcaActualizar) && taller[i][j][1].equalsIgnoreCase(modeloActualizar)) { taller[i][j][3] = nuevoEstado; 
                    System.out.println("Estado actualizado."); 
                    return; 
                } 
            } 
        } 
        
        System.out.println("Vehículo no encontrado."); 
    } 
    
    private static void contarVehiculosPorEstado(String[][][] taller) { 
        int pendiente = 0, enReparacion = 0, reparado = 0; 
        for (int i = 0; i < taller.length; i++) { 
            for (int j = 0; j < 2; j++) { 
                if (taller[i][j][0] != null) { 
                    switch (taller[i][j][3].toLowerCase()) { 
                        case "pendiente": pendiente++; 
                        break; 
                        
                        case "en reparación": enReparacion++; 
                        break; 
                        
                        case "reparado": reparado++;
                        break; 
                    }
                } 
            } 
        } 
        
        System.out.printf("Vehículos pendientes: %d%n", pendiente); 
        System.out.printf("Vehículos en reparación: %d%n", enReparacion); 
        System.out.printf("Vehículos reparados: %d%n", reparado); 
    } 
}
