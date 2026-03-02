import java.util.Scanner;

public class Ejercicio7
 {
    public static void main(String[] args) 
    {
        
        final double IVA = 0.21;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del producto sin IVA: ");
        double precioSinIVA = sc.nextDouble();

        double precioConIVA = precioSinIVA * (1 + IVA);

        System.out.println("El precio final con IVA es: " + precioConIVA);

        sc.close();
    }
    






}
