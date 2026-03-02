import java.util.Scanner;

public class EjercicioDos {
    
    public static void main(String[] args)  { 
       System.out.println("Ingrese dos numeros");
        
       Scanner usuario = new Scanner (System.in);

       int numero1 = usuario.nextInt();
       int numero2 = usuario.nextInt();


       if (numero1 == numero2) {
            System.out.println(numero1 + " es igual " + numero2);

        } else if (numero1 > numero2) { 
            System.out.println(numero1 + " es mayor que " + numero2);

        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } 
       
        usuario.close();
    
    }

        
}