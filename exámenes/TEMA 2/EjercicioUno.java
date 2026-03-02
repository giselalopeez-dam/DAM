import java.util.Scanner;

public class EjercicioUno {
    
    public static void main(String[] args) {

        System.out.println("Escriba un numero entero");
        Scanner usuario = new Scanner(System.in);
        
        int numero = usuario.nextInt();

        if (numero == 0) {

            System.out.println("Su numero es cero");
            
        } else if (numero > 0) {
            
            System.out.println("Su numero es positivo");

        } else if (numero < 0) {
            System.out.println("Su numero es negativo");
         }   
            
         usuario.close();
        
        }

        
}

