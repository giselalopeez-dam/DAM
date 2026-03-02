import java.util.Scanner;

public class Ejercicio6
{

       
     
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            System.out.println("El número " + numero + " es IMPAR.");
        }

        scanner.close();
    }

   
    
}