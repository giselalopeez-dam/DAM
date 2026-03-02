import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    System.out.println("Ingrese dos numeros enteros y vera el resultado de la suma, resta, multiplicacion y division entre ambos");
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ponga el primer numero entero");
    int numero1 = entrada.nextInt();
    System.out.println("Ponga el segundo numero entero");
    int numero2 = entrada.nextInt();
    
    int suma = numero1 + numero2;
    int resta = numero1 - numero2;
    int multiplicacion = numero1 * numero2;
    int division = numero1 / numero2;

    System.out.println("El resultado de sumar " + numero1 + " y " + numero2 + " es " + suma);
    System.out.println("El resultado de restar " + numero1 + " y " + numero2 + " es " + resta);
    System.out.println("El resultado de multiplicacion " + numero1 + " y " + numero2 + " es " + multiplicacion);
    System.out.println("El resultado de dividir " + numero1 + " y " + numero2 + " es " + division);

    entrada.close();
    


}
}