import java.util.Scanner;

public class EjercicioSEis
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese una calificación entre 0 y 100: ");
        int calificacion = scanner.nextInt();

        
        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Error: La calificación debe estar entre 0 y 100 tonto del culo.");
        } else if (calificacion >= 90) {
            System.out.println("Tu calificación en letra es: A");
        } else if (calificacion >= 80) {
            System.out.println("Tu calificación en letra es: B");
        } else if (calificacion >= 70) {
            System.out.println("Tu calificación en letra es: C");
        } else if (calificacion >= 60) {
            System.out.println("Tu calificación en letra es: D");
        } else {
            System.out.println("Tu calificación en letra es: F");
        }

        scanner.close();
    }
}
    

