package Objects.CourseManagementSystem;

import java.util.ArrayList;

public class Curso {
    /* Clase Curso: Con propiedades como codigo, nombre, y listaEstudiantes, donde
    listaEstudiantes es un ArrayList de objetos Estudiante. */

    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public String getCurso() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Estudiante inscrito: " + listaEstudiantes.size();
    }
}
