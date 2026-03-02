import java.util.Scanner;

public class Ejercicio10 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Introduce el dinero entregado: ");
        double entregado = sc.nextDouble();

        double cambio = entregado - precio;

       System.out.println("Su cambio es " + cambio);
        sc.close();
    }
    
}
