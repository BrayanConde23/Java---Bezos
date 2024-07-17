import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /* Ejercicio 2: Facturación de una tienda en arrays.
        Un cliente realiza una compra en una tienda. El programa proporciona
        un array de productos y un array de precios. Se requiere pedir al
        usuario la cantidad de cada producto que desea comprar, para
        posteriormente imprimir el valor total de la factura. */

        Scanner scanner = new Scanner(System.in);

        String[] productos = {"Producto A", "Producto B", "Producto C"};
        double[] precios = {10.5, 15.2, 7.8};
    
        System.out.println("Bienvenido a la tienda!");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
        }
    
        System.out.println("Ingrese el número del producto que desea comprar: ");
        int productoElegido = scanner.nextInt();
        scanner.nextLine();
    
        System.out.println("Ingrese la cantidad del producto que desea comprar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
    
        double total = precios[productoElegido - 1] * cantidad;
    
        System.out.println("El total de su compra es: " + total);
        
        scanner.close();
    }
}
