package Objects.EmployeeRegistrationSystem;

public class EmpleadoPermanente extends Empleado {
    /* Clase EmpleadoTemporal y Clase EmpleadoPermanente: Heredan de Empleado y
    representan diferentes tipos de empleados. */

    private String empleadoPermanente;

    // Constructor
    public EmpleadoPermanente(String nombre, int edad, String idEmpleado, double salario, String empleadoPermanente) {
        super(nombre, edad, idEmpleado, salario);
        this.empleadoPermanente = empleadoPermanente;
    }

    // Getter y Setter
    public String getempleadoPermanente() {
        return empleadoPermanente;
    }

    public void setempleadoPermanente(String empleadoPermanente) {
        this.empleadoPermanente = empleadoPermanente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de empleado: " + empleadoPermanente;
    }
}
