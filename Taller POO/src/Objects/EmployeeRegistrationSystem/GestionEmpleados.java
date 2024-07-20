package Objects.EmployeeRegistrationSystem;

import java.util.ArrayList;

public class GestionEmpleados {
    /* Clase GestionEmpleados: Utiliza un ArrayList para gestionar objetos del tipo Empleado.
    Implementa métodos para añadir, eliminar y mostrar empleados. Utiliza polimorfismo para
    manejar diferentes tipos de empleados. */

    private ArrayList<Empleado> empleados;

    public GestionEmpleados() {
        empleados = new ArrayList<>();
    }

    public void añadirEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(String idEmpleado) {
        empleados.removeIf(empleado -> empleado.getIdEmpleado().equals(idEmpleado));
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public void menuEmpleados() {
        GestionEmpleados gestion = new GestionEmpleados();

        EmpleadoPermanente empleado1 = new EmpleadoPermanente("Juan Pérez", 30, "01", 3000.00, "Permanente");
        EmpleadoTemporal empleado2 = new EmpleadoTemporal("Ana López", 25, "02", 1500.00, "Temporal");

        gestion.añadirEmpleado(empleado1);
        gestion.añadirEmpleado(empleado2);

        System.out.println("Listado de empleados: ");
        gestion.mostrarEmpleados();

        gestion.eliminarEmpleado("02");

        System.out.println("Listado de empleados después de la eliminación: ");
        gestion.mostrarEmpleados();
    }
}
