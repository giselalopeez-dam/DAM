import java.util.Scanner;

public class EjercicioOCho {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese una letra: ");
        char caracter = sc.nextLine().charAt(0);

       
        caracter = Character.toLowerCase(caracter);

        
        if (Character.isLetter(caracter)) {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println("Es una vocal.");
            } else {
                System.out.println("Es una consonante.");
            }
        } else {
            System.out.println("El carácter ingresado no es una letra.");
        }

        sc.close();
    }
}
