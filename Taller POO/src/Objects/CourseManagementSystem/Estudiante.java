package Objects.CourseManagementSystem;

public class Estudiante {
    /* Clase Estudiante: Con propiedades como id, nombre, y email. */

    private String id;
    private String nombre;
    private String email;

    public Estudiante(Integer id, String nombre, String email) {
        this.id = id.toString();
        this.nombre = nombre;
        this.email = email;
    }

    public String getEstudiante() {
        return "ID: " + id + ", Nombre: " + nombre + ", Email: " + email;
    }
}
