/*Dado un número n, muestra la siguiente figura:
1  
12  
123  
1234  
... 
123...n
Y luego, decreciendo:
123...(n-1)  
123...(n-2)  
... 
1
Usa solo bucles for o while. No puedes convertir números en texto.
*/

import java.util.Scanner;

public class Ejercicio1Extra {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println(
                "Introduzca un numero positivo entero. Si pone un numero negativo o 0, no se ejecutará el programa");
        int numero = usuario.nextInt();

        if (numero <= 0) {

            System.out.println("Error");

        } else {

            for (int i = 1; i <= numero; i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print(j);

                }

                System.out.println();
            }

            for (int i = numero - 1; i >= 1; i--) {

                for (int j = 1; j <= i; j++) {

                    System.out.print(j);

                }

                System.out.println();
            }
        }

        usuario.close();

    }
}
