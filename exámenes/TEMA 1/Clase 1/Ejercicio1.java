import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
    
    System.out.println("Hola, ingrese su nombre");
    Scanner entrada = new Scanner(System.in);
    String usuario = entrada.nextLine();
    System.out.println("Bienvenido a Cartagena, " + usuario);
        

    entrada.close();
}
}