/*Diseña un programa que simule un cajero automático. 
El programa debe comenzar con un saldo inicial de 1000€. 
El usuario puede realizar entre 4 operaciones, eligiendo entre retirar dinero (en múltiplos de 10), ingresar dinero, 
consultar el saldo, salir del programa.. 
Si el usuario intenta retirar más dinero del que hay disponible, el programa debe mostrar un mensaje de error.
 */

import java.util.Scanner;

public class Ejercicio3Entrevista {

    public static void main(String[] args) {

        int saldoInicial = 1000;
        Scanner usuario = new Scanner(System.in);
        int operacion;
        int dinero;

        do {

            System.out.println(
                    "Puede realizar 4 operaciones (1) Retirar dinero, (2) Ingresar dinero, (3) Consultar el saldo, (4) Salir del programa");
            operacion = usuario.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println("Ingrese la cantidad que desea retirar");
                    dinero = usuario.nextInt();
                    int validar = dinero % 10;

                    if (validar != 0) {

                        System.out.println("Solo puede manejar dinero en multiplos de 10");

                    } else if (dinero > saldoInicial) {

                        System.out.println("No puede retirar mas de lo que tiene");

                    } else if (dinero < 0) {

                        System.out.println("Retire un numero mayor de 0");

                    } else {

                        saldoInicial -= dinero;
                        System.out.println("Ha retirado: " + dinero + " euros. Su saldo actual es = " + saldoInicial);

                    }

                    break;

                case 2:
                    System.out.println("Ingrese la cantidad deseada");
                    dinero = usuario.nextInt();

                    if (dinero < 0) {

                        System.out.println("Ingrese una cantidad positiva");
                    } else {

                        saldoInicial += dinero;
                        System.out.println("Ha ingresado: " + dinero + " euros. Su saldo actual es = " + saldoInicial);

                    }

                    break;
                case 3:

                    System.out.println("Su saldo actual es = " + saldoInicial);

                    break;

                case 4:

                    System.out.println("Gracias. Saliendo del cajero...");

                    break;

                default:
                    System.out.println("Ingrese una operacion valida");
                    break;
            }

        } while (operacion != 4);

        usuario.close();
    }
}
