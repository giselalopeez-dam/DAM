import java.lang.Math;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Vamos a calcular el area de un circulo. Dime el radio que tiene el circulo y lo calcularemos");
        Scanner entrada = new Scanner (System.in);
        double radio = entrada.nextDouble();

        double calculo = Math.PI * Math.pow(radio, 2);

        System.out.println("El radio que tiene tu circulo es " + calculo);
        entrada.close();
}
}
