/*Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique. 
Para distinguir un caso de otro se le pasará como opción un número: 1 (para el área) o 2 (para el volumen). 
Además, hay que pasarle a la función el radio de la base y la altura.
área = 2n · radio · (altura + radio)
volumen = n • radio2 • altura */

/*  Preguntar cómo validar la opción en el switch para que se siga repitiendo
 hasta que meta una opción buena sin que se corte el programa*/

import java.util.Scanner;

public class ejercicio3 {

    private static void Cilindro(int opcion, double altura, double radio) {

        switch (opcion) {
            case 1:
                double area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("El resultado del área es: " + area);
                break;
            case 2:
                double volumen = Math.PI * radio * radio * altura;
                System.out.println("El resultado del volumen es: " + volumen);
                break;

            default:

                System.out.println("Introduzca una opción valida");
                break;
        }

    }

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Vamos a calcular el área o el volumen de un cilindro. Eso lo decidirás más adelante.");

        System.out.println("Diga la altura del cilindro");
        double altura = usuario.nextDouble();

        System.out.println("Diga lo que mide el radio del cilindro");
        double radio = usuario.nextDouble();

        System.out.println("Ahora diga qué quiere calcular: Marque (1) ÁREA o (2) VOLUMEN");
        int opcion = usuario.nextInt();

        Cilindro(opcion, altura, radio);

        usuario.close();

    }
}
