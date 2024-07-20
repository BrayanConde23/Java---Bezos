package Objects.EmployeeRegistrationSystem;

public class EmpleadoTemporal extends Empleado {
    /* Clase EmpleadoTemporal y Clase EmpleadoPermanente: Heredan de Empleado y
    representan diferentes tipos de empleados. */

    private String empleadoTemporal;

    public EmpleadoTemporal(String nombre, int edad, String idEmpleado, double salario, String empleadoTemporal) {
        super(nombre, edad, idEmpleado, salario);
        this.empleadoTemporal = empleadoTemporal;
    }

    public String getempleadoTemporal() {
        return empleadoTemporal;
    }

    public void setempleadoTemporal(String empleadoTemporal) {
        this.empleadoTemporal = empleadoTemporal;
    }

    public String toString() {
        return super.toString() + ", Tipo de empleado: " + empleadoTemporal;
    }
}
