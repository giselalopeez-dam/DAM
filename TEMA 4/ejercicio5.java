/*Sumar 10 números
Pide 10 números al usuario y muestra la suma total. Usa un bucle while o for. */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca 10 numeros pa sumarlos");

        int numero;
        int suma = 0;

        for (int i = 1; i <= 10; i++) {

            numero = usuario.nextInt();
            suma += numero;
        }

        System.out.println("El resultado es: " + suma);

        usuario.close();
    }

}
