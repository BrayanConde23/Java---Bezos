package Objects.CourseManagementSystem;

import java.util.Scanner;
import java.util.ArrayList;

public class GestionCursos {
    /* Clase GestionCursos: Encargada de administrar los cursos, incluyendo métodos para
    agregar cursos, inscribir estudiantes en cursos y listar estudiantes inscritos en un curso
    específico. */

    private ArrayList<Curso> cursos;

    public GestionCursos() {
        cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void inscribirEstudiante(String codigoCurso, Estudiante estudiante) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        if (curso != null) {
            curso.agregarEstudiante(estudiante);
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    public void listarEstudiantes(String codigoCurso) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        if (curso != null) {
            System.out.println("Estudiantes inscritos en el curso " + "'" + curso.getNombre() + "'" + ":");
            for (Estudiante estudiante : curso.getListaEstudiantes()) {
                System.out.println(estudiante.getEstudiante());
            }
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    private Curso buscarCursoPorCodigo(String codigoCurso) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                return curso;
            }
        }
        return null;
    }

    public void menuCursos() {
        Scanner scanner = new Scanner(System.in);
        GestionCursos gestionCursos = new GestionCursos();
        String opcion = "";
        
        do {
            System.out.println("""
                    1. Agregar curso
                    2. Inscribir estudiante
                    3. Listar estudiantes de un curso
                    4. Salir
                    """);
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el código del curso: ");
                    String codigoCurso = scanner.nextLine();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre del curso: ");
                    String nombreCurso = scanner.nextLine();
                    scanner.nextLine();

                    Curso curso = new Curso(codigoCurso, nombreCurso);
                    gestionCursos.agregarCurso(curso);

                    System.out.println("Curso agregado exitosamente.");
                    break;

                case "2":
                    System.out.print("Ingrese el código del curso: ");
                    String codigo = scanner.nextLine();
                    scanner.nextLine();

                    System.out.print("Ingrese el ID del estudiante: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreEstudiante = scanner.nextLine();
                    scanner.nextLine();

                    System.out.print("Ingrese el email del estudiante: ");
                    String email = scanner.nextLine();
                    scanner.nextLine();

                    Estudiante estudiante = new Estudiante(id, nombreEstudiante, email);
                    gestionCursos.inscribirEstudiante(codigo, estudiante);
                    
                    System.out.println("Estudiante " + "'" + nombreEstudiante + "'" + " inscrito exitosamente.");
                    break;

                case "3":
                    System.out.print("Ingrese el código del curso: ");
                    String codigoCursoListar = scanner.nextLine();
                    gestionCursos.listarEstudiantes(codigoCursoListar);
                    break;

                case "4":
                    System.out.println("Saliendo del sistema...");
                    return;

                default:
                    break;
            }
        } while (opcion != "5"); {
            System.out.println("Opción no válida. Intente nuevamente.");
        }

        scanner.close();
    }
}

