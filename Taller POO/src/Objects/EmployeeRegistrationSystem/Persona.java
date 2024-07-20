package Objects.EmployeeRegistrationSystem;

public class Persona {
    /*  Clase Persona: Con propiedades básicas como nombre y edad. */

    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
