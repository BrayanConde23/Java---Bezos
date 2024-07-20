package Objects.EmployeeRegistrationSystem;

public class Empleado extends Persona {
    /* Clase Empleado: Hereda de Persona y añade propiedades como idEmpleado y salario. Usa
    encapsulamiento adecuadamente. */

    private String idEmpleado;
    private Double salario;

    public Empleado(String nombre, int edad, String idEmpleado, Double salario) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String toString() {
        return super.toString() + ", ID Empleado: " + idEmpleado + ", Salario: " + salario;
    }
}
