import java.util.Scanner;

public class EjercicioCinco
 {
    public static void main(String[] args)
    {
    
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if(edad < 0){
            System.out.println("No existes");
        }
        if (edad >= 0 && edad <= 12) {
            System.out.println("Eres un niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres un adolescente.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres un adulto.");
        } else if (edad >= 65) {
            System.out.println("Eres un abuelo.");
        } else {
            System.out.println("Edad no válida. Debe ser un número positivo.");
        }

        scanner.close();
    }
}
