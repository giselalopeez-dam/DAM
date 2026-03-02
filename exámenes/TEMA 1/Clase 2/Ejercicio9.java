import java.util.Scanner;

public class Ejercicio9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número con decimales: ");
        double numeroDecimal = sc.nextDouble();

        int numeroEntero = (int) numeroDecimal;

        String numeroTexto = Integer.toString(numeroEntero);

        System.out.println("El número sin decimales es: " + numeroTexto);

        System.out.print("Introduce un número entero: ");
        int entero = sc.nextInt();

        double convertidoADouble = (double) entero;

        System.out.println("El número entero convertido a double es: " + convertidoADouble);

        sc.close();
    }
    
}
