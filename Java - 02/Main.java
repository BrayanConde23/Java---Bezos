import java.util.Scanner;

/* Ejercicio 1: Calculadora Básica.
Escribe un programa que pida al usuario dos números y luego muestre el resultado de sumar, restar,
multiplicar y dividir esos números. Utiliza tipos de datos primitivos para almacenar los números y
los resultados. */

/* public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese otro numero:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int res = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;

        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + res);
        System.out.println("La multiplicacion es: " + multi);
        System.out.println("La division es: " + div);

        scanner.close();
    }
} */

/* Ejercicio 2: Verificador de Edad.
Crea un programa que solicite la edad del usuario y determine si es mayor de edad (18 años o más).
El programa debe imprimir un mensaje indicando si el usuario es mayor de edad o no. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        scanner.close();
    }
} */

/* Ejercicio 3: Conversor de Unidades.
Desarrolla un programa que convierta kilómetros a millas. El programa debe solicitar al usuario que
introduzca una distancia en kilómetros y luego debe mostrar la distancia equivalente en millas.
Utiliza el hecho de que una milla es igual a 1.60934 kilómetros. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia en kilometros:");
        double km = scanner.nextDouble();

        double millas = km / 1.60934;

        System.out.println("La distancia en millas es: " + millas);

        scanner.close();
    
    }
} */

/* Ejercicio 4: Calculadora de Índice de Masa Corporal (IMC).
Escribe un programa que calcule el índice de masa corporal (IMC) de una persona. El programa
debe pedir al usuario su peso en kilogramos y su altura en metros, calcular el IMC y mostrar un
mensaje con el resultado. La fórmula para calcular el IMC es peso / (altura * altura). */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos:");
        double weight = scanner.nextDouble();

        System.out.println("Ingrese su altura en metros:");
        float height = scanner.nextFloat();

        double imc = weight / (height * height);

        System.out.println("Su IMC es: " + imc);

        scanner.close();
    }
} */

/* Ejercicio 5: Clasificador de Números.
Crea un programa que solicite al usuario un número y muestre un mensaje indicando si el número
es positivo, negativo o cero. Además, indica si el número es par o impar. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("El numero es positivo.");
        } else if (num < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }

        if (num % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }

        scanner.close();
    }
} */

/* Ejercicio 6: Calculadora de Días del Mes.
Desarrolla un programa que pida al usuario el número de un mes (1-12) y muestre el número de días
de ese mes. Asume que febrero tiene 28 días. Utiliza una estructura switch para resolverlo. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de un mes (1-12):");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 dias.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 dias.");
                break;
            case 2:
                System.out.println("El mes tiene 28 dias.");
                break;
            default:
                System.out.println("El numero ingresado no corresponde a un mes.");
                break;
        }

        scanner.close();
    }
} */

/* Ejercicio 7: Menú Interactivo.
Implementa un programa que muestre un menú con opciones para realizar diferentes operaciones
matemáticas (por ejemplo, sumar, restar, multiplicar, dividir). El usuario debe poder seleccionar una
opción ingresando un número, y luego el programa debe pedir los números necesarios para realizar
la operación elegida y mostrar el resultado. Utiliza una estructura switch para manejar las opciones
del menú. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. Salir""");
        System.out.println("Ingrese una opcion:");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Ingrese un numero:");
                int num1 = scanner.nextInt();
                System.out.println("Ingrese otro numero:");
                int num2 = scanner.nextInt();
                int sum = num1 + num2;
                System.out.println("La suma de " + num1 + "+" + num2 + " es:" + sum);
                break;

            case 2:
                System.out.println("Ingrese un numero:");
                int num3 = scanner.nextInt();
                System.out.println("Ingrese otro numero:");
                int num4 = scanner.nextInt();
                int res = num3 - num4;
                System.out.println("La resta de " + num3 + "-" + num4 + " es:" + res);
                break;

            case 3:
                System.out.println("Ingrese un numero:");
                int num5 = scanner.nextInt();
                System.out.println("Ingrese otro numero:");
                int num6 = scanner.nextInt();
                int mult = num5 * num6;
                System.out.println("La multiplicacion de " + num5 + "x" + num6 + " es:" + mult);
                break;
            case 4:
                System.out.println("Ingrese un numero:");
                int num7 = scanner.nextInt();
                System.out.println("Ingrese otro numero:");
                int num8 = scanner.nextInt();
                int div = num7 / num8;
                System.out.println("La division de " + num7 + "/" + num8 + " es:" + div);
                break;

            case 5:
                System.out.println("Usted ha salido del menu.");
            default:
                break;
        }

        scanner.close();
    }
} */

/* Ejercicio 8: Cálculo de Promedio.
Escribe un programa que solicite al usuario ingresar tres calificaciones, calcule el promedio y
muestre un mensaje indicando si el alumno aprueba o no (considera que se aprueba con un
promedio de 6 o más). */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera calificacion:");
        double cal1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la segunda calificacion:");
        double cal2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la tercera calificacion:");
        double cal3 = scanner.nextDouble();
        scanner.nextLine();

        double prom = (cal1 + cal2 + cal3) / 3;

        if (prom >= 6) {
            System.out.println("El alumno ha aprobado.");
        } else {
            System.out.println("El alumno no ha aprobado.");
        }

        scanner.close();
    }
}*/

/* Ejercicio 9: Calculadora de Año Bisiesto.
Escribe un programa que le pida al usuario que ingrese un año y determine si es un año bisiesto o
no. Recuerda que un año es bisiesto si es divisible entre 4, excepto aquellos que son divisibles entre
100, a menos que también sean divisibles entre 400. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año:");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100!= 0 || year % 400 == 0) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }

        scanner.close();
    }
} */

/* Ejercicio 10: Calculadora de Propina.
Desarrolla un programa que calcule cuánto dejar de propina en un restaurante. El usuario debe
ingresar el total de la cuenta y el porcentaje de propina que desea dejar. El programa debe mostrar
cuánto dinero en propina debe dejar. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta:");
        int total = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el porcentaje de propina:");
        double prop = scanner.nextDouble();
        scanner.nextLine();

        double propina = (total * prop) / 100;

        System.out.println("El monto de dinero en propina que debe dejar es: " + propina);

        scanner.close();
    }
} */

/* Ejercicio 11: Ordenando Tres Números.
Crea un programa que solicite al usuario ingresar tres números enteros y luego los muestre
ordenados de menor a mayor. Intenta resolverlo primero con if y else, y luego intenta crear una
solución usando el operador ternario para práctica adicional. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el segundo numero:");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el tercer numero:");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else if (num3 < num2 && num3 < num1) {
            if (num2 < num1) {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            } else {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            }
        }

        scanner.close();
    }
} */

/* Ejercicio 12: Generador de Horóscopo.
Implementa un programa que le pida al usuario su mes y día de nacimiento. Luego, basado en esa
información, muestra su signo del zodíaco. Utiliza una estructura switch para manejar los meses y if
para los días. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su mes de nacimiento:");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese su dia de nacimiento:");
        int day = scanner.nextInt();
        scanner.nextLine();

        switch (month) {
            case 1: // Enero
                if (day <= 19) {
                    System.out.println("Capricornio");
                } else {
                    System.out.println("Acuario");
                }
                break;
            case 2: // Febrero
                if (day <= 18) {
                    System.out.println("Acuario");
                } else {
                    System.out.println("Picis");
                }
                break;
            case 3: // Marzo
                if (day <= 20) {
                    System.out.println("Picis");
                } else {
                    System.out.println("Aries");
                }
                break;
            case 4: // Abril
                if (day <= 19) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Tauro");
                }
                break;
            case 5: // Mayo
                if (day <= 20) {
                    System.out.println("Tauro");
                } else {
                    System.out.println("Geminis");
                }
                break;
            case 6: // Junio
                if (day <= 20) {
                    System.out.println("Geminis");
                } else {
                    System.out.println("Cancer");
                }
                break;
            case 7: // Julio
                if (day <= 22) {
                    System.out.println("Cancer");
                } else {
                    System.out.println("Leo");
                }
                break;
            case 8: // Agosto
                if (day <= 22) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Virgo");
                }
                break;
            case 9: // Septiembre
                if (day <= 22) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Libra");
                }
                break;
            case 10: // Octubre
                if (day <= 22) {
                    System.out.println("Libra");
                } else {
                    System.out.println("Escorpio");
                }
                break;
            case 11: // Noviembre
                if (day <= 21) {
                    System.out.println("Escorpio");
                } else {
                    System.out.println("Sagitario");
                }
                break;
            case 12: // Diciembre
                if (day <= 21) {
                    System.out.println("Sagitario");
                } else {
                    System.out.println("Capricornio");
                }
                break;
            default:
                break;
            }

        scanner.close();
    }
} */

/* Ejercicio 13: Calculadora de Tarifa de Taxi.
Desarrolla un programa que calcule el costo de un viaje en taxi basándose en la distancia del viaje
(en kilómetros) y la tarifa base. Puedes añadir una tarifa adicional por kilómetro recorrido. El
usuario debe ingresar la distancia del viaje. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia del viaje:");
        double distance = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la tarifa base:");
        double base = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la tarifa por kilometro:");
        double extra = scanner.nextDouble();
        scanner.nextLine();

        double total = (base + (distance * extra));

        System.out.println("El costo del viaje es: " + total);

        scanner.close();
    }
} */

/* Ejercicio 14: Convertidor de Temperatura.
Crea un programa que convierta temperaturas entre grados Celsius y Fahrenheit. El usuario debe
poder elegir si quiere convertir de Celsius a Fahrenheit o viceversa, y luego ingresar la temperatura.
Utiliza la fórmula C = (F - 32) * 5/9 para Fahrenheit a Celsius y F = C * 9/5 + 32 para Celsius a
Fahrenheit. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura:");
        double temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la unidad de temperatura (C o F):");
        String unit = scanner.nextLine();

        double result = 0;

        if (unit.equals("C")) {
            result = (temperature * 9 / 5) + 32;
        } else if (unit.equals("F")) {
            result = (temperature - 32) * 5 / 9;
        }

        System.out.println("La temperatura es: " + result);

        scanner.close();
    }
} */


/* Ejercicio 15: Sistema de Calificaciones.
Implementa un programa que le pida al usuario la calificación de un examen (0-100). Basado en la
calificación, el programa debe mostrar una letra (A, B, C, D, F), donde A es 90-100, B es 80-89,
etc. Considera utilizar if o switch. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificacion:");
        int grade = scanner.nextInt();
        scanner.nextLine();

        if (grade >= 90) {
            System.out.println("Su calificacion pertenece a la letra: A");
        } else if (grade >= 80) {
            System.out.println("Su calificacion pertenece a la letra: B");
        } else if (grade >= 70) {
            System.out.println("Su calificacion pertenece a la letra: C");
        } else if (grade >= 60) {
            System.out.println("Su calificacion pertenece a la letra: D");
        } else {
            System.out.println("Su calificacion pertenece a la letra: F");
        }

        scanner.close();
    }
} */

/* Ejercicio 16: Contraseña segura
Crea un programa que valide si una contraseña es segura o no, que
responda con un booleano. (Una contraseña segura debe contener
mínimo 8 caracteres con al menos 1 mayúscula, 1 minúscula y 1
carácter espacial) */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una contraseña");
        String password = scanner.nextLine();

        passwordVerify(password);

        scanner.close();
    }

    public static boolean passwordVerify(String password){
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean space = false;

        if(password.length() >= 8){
            for (int i = 0; i < password.length(); i++) {
                char verify = password.charAt(i);
                if(Character.isUpperCase(verify)){
                    mayuscula = true;
                }
                if(Character.isLowerCase(verify)){
                    minuscula = true;
                }
                if(Character.isSpaceChar(verify)){
                    space = true;
                }
            }

            boolean esBuena = mayuscula && minuscula && space ?  true : false;
            if(esBuena){
                System.out.println("La contraseña es segura!");
                return true;
            }
            else{
                System.out.println("La contraseña no segura!");
                return false;
            }

        }
        else{
            System.out.println("La contraseña no segura!");
            return false;
        }
    }
} */

/* Ejercicio 17: Identificador de carácter
Crea un programa que pida al usuario un carácter e imprima en
consola si es una consonante, vocal o carácter especial. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);
        scanner.nextLine();

        if (Character.isLetter(caracter)) {
            caracter = Character.toLowerCase(caracter);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println("El carácter ingresado es una vocal.");
            } else {
                System.out.println("El carácter ingresado es una consonante.");
            }
        } else {
            System.out.println("El carácter ingresado es un carácter especial o un número.");
        }

        scanner.close();
    }
} */

/* Ejercicio 18: Juego de piedra, papel o tijera:
Crear un programa que simule el juego de piedra, papel o tijera
contra el usuario. Permitir al usuario elegir entre piedra, papel o
tijera. Determinar el ganador del juego y mostrar el resultado. */


/* public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
            Bienvenido al juego de Piedra, Papel o Tijera!
            Elige una de las siguientes opciones:
            1. Piedra
            2. Papel
            3. Tijera
        """);
        int opcionUsuario = scanner.nextInt();

        while (opcionUsuario < 1 || opcionUsuario > 3) {
            System.out.println("Opción inválida. Por favor, elige 1, 2 o 3:");
            opcionUsuario = scanner.nextInt();
        }

        String eleccionUsuario = convertirOpcion(opcionUsuario);

        int opcionComputadora = (int) (Math.random() * 3) + 1;
        String eleccionComputadora = convertirOpcion(opcionComputadora);

        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("La elección de la computadora: " + eleccionComputadora);

        determinarGanador(eleccionUsuario, eleccionComputadora);

        scanner.close();
    }

    public static String convertirOpcion(int opcion) {
        switch (opcion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "";
        }
    }

    public static void determinarGanador(String jugador, String computadora) {
        if (jugador.equals(computadora)) {
            System.out.println("Empate!");
        } else if ((jugador.equals("Piedra") && computadora.equals("Tijera")) || (jugador.equals("Papel") && computadora.equals("Piedra")) || (jugador.equals("Tijera") && computadora.equals("Papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
    }
} */

/* Ejercicio 19: Calculadora de edad:
Crea un programa que solicite la fecha de nacimiento al usuario (año,
mes y día). Calcule la edad e imprima su edad y si es mayor de edad o no. */

/* import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su año de nacimiento (YYYY): ");
        int year = scanner.nextInt();
        
        System.out.print("Ingrese su mes de nacimiento (MM): ");
        int month = scanner.nextInt();
        
        System.out.print("Ingrese su día de nacimiento (DD): ");
        int day = scanner.nextInt();
        
        LocalDate fechaNacimiento = LocalDate.of(year, month, day);
        LocalDate fechaActual = LocalDate.now();
        
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int age = periodo.getYears();
        
        System.out.println("Tienes " + age + " años.");
        
        if (age >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
        
        scanner.close();
    }
} */

/* Ejercicio 20: Cifrado César:
Escribe un método que cifre y descifre un mensaje utilizando el
cifrado César con un desplazamiento dado. */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el mensaje a cifrar: ");
        String message = scanner.nextLine();

        System.out.print("Ingrese el desplazamiento: ");
        int shift = scanner.nextInt();

        System.out.println("Mensaje cifrado: " + cifrar(message, shift));
        System.out.println("Mensaje descifrado: " + descifrar(message, shift));

        scanner.close();
    }

    public static String cifrar(String message, int shift) {
        String cifrado = "";

        for (int i = 0; i < message.length(); i++) {
            char caracter = message.charAt(i);
            if (Character.isLetter(caracter)) {
                caracter = (char) (caracter + shift);
                if (caracter > 'z') {
                    caracter = (char) (caracter - 26);
                } else if (caracter < 'a') {
                    caracter = (char) (caracter + 26);
                }
            }
            cifrado += caracter;
        }

        return cifrado;
    }

    public static String descifrar(String message, int shift) {
        String descifrado = "";

        for (int i = 0; i < message.length(); i++) {
            char caracter = message.charAt(i);
            if (Character.isLetter(caracter)) {
                caracter = (char) (caracter - shift);
                if (caracter > 'z') {
                    caracter = (char) (caracter - 26);
                } else if (caracter < 'a') {
                    caracter = (char) (caracter + 26);
                }
            }
            descifrado += caracter;
        }

        return descifrado;
    }
} */

