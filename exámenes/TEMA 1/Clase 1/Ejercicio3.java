import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese la temperatura en grados Celsius para convertirla a grados Fahrenheit");
        Scanner usuario = new Scanner (System.in);
        float celsius = usuario.nextFloat();
        float conversion = celsius * 9/5 + 32; 

        System.out.println("La conversion es " + conversion + " °F");

        usuario.close();
}
}