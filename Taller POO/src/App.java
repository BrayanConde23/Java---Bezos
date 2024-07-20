import Objects.CourseManagementSystem.GestionCursos;
import Objects.EmployeeRegistrationSystem.GestionEmpleados;
import Objects.InventoryControlSystem.Productos;

public class App {
    public static void main(String[] args) throws Exception {
        /* Ejercicio 1: Sistema de Control de Inventarios.
        Objetivo: Crear un sistema para manejar el inventario de un almacén, aplicando
        encapsulamiento y herencia, y utilizando ArrayList para almacenar los productos. */
        Productos products = new Productos(null, 0, 0);
        products.interFace();

        /* Ejercicio 2: Sistema de Registro de Empleados
        Objetivo: Desarrollar un sistema para manejar los empleados de una empresa, aplicando
        encapsulamiento, herencia y polimorfismo, y utilizando ArrayList para almacenar los
        empleados. */
        GestionEmpleados gestion = new GestionEmpleados();
        gestion.menuEmpleados();

        /* Ejercicio 3: Sistema de Gestión de Cursos
        Objetivo: Implementar un sistema para gestionar cursos y estudiantes, aplicando
        abstracción y polimorfismo, y utilizando ArrayList para manejar las inscripciones. */
        GestionCursos cursos = new GestionCursos();
        cursos.menuCursos();
    }
}
