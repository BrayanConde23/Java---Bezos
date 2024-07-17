import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        /* Ejercicio 4: Calculadora de descuentos en arrays.
        Crea un programa que calcule los descuentos por compras(Ejercicio 2)
        en una tienda, donde se aplica un porcentaje de descuento en función
        del monto total de la compra, con rangos de precios personalizados.
        _________________________________________________
        |    Rango de compra    | Porcentaje de descuento |
        |-----------------------|-------------------------|
        | Mayor o igual a $1000 |           25%           |
        | Mayor o igual a $500  |           20%           |
        | Mayor o igual a $300  |           15%           |
        | Mayor o igual a $200  |           10%           |
        | Menor a $200          |  No se aplica descuento | 
        __________________________________________________ */

        Scanner scanner = new Scanner(System.in);

        String[] productos = {"Producto A", "Producto B", "Producto C"};
        double[] precios = {10.5, 15.2, 7.8};
        double[] descuentos = {0.25, 0.20, 0.15, 0.10, 0};
        
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

        double totalCompra = precios[productoElegido] * cantidad;
        double descuentoAplicado = descuentos[Descuento(totalCompra)];
        double totalPagar = totalCompra - (totalCompra * descuentoAplicado);
        System.out.println("El total de su compra es: $" + totalCompra);
        System.out.println("El total a pagar con descuento aplicado es: $" + totalPagar);

        scanner.close();
    }

    private static int Descuento(double totalCompra) {
        if (totalCompra >= 1000) {
            return 0;
        } else if (totalCompra >= 500) {
            return 1;
        } else if (totalCompra >= 300) {
            return 2;
        } else if (totalCompra >= 200) {
            return 3;
        } else {
            return 4;
        }
    }
}
