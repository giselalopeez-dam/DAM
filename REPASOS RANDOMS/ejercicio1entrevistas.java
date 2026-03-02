/*Diseña dos funciones que calculen la superficie y volumen de una esfera 
(tienes que pedir como parámetro el radio de la esfera, 
y además diseña una función extra a modo de menú que utilice un
 parámetro(opción) en forma de entero para decidir que quieres calcular
(1- Volumen, 2-Superficie).

Para hacer uso del número Math.PI o elevar al cuadrado usar la librería Math


4 π r 2.

 */

import java.util.Scanner;

public class ejercicio1entrevistas {

    public static void main(String[] args) {

        leerEntradaUsuario();
    }

    private static void leerEntradaUsuario() {
        Scanner usuario = new Scanner(System.in);
        int opcion = validarOpcion();
        double a;

        do {

            System.out.println("Introzuca cuanto vale el radio");
            a = usuario.nextDouble();

            if (a <= 0) {

                System.out.println("Introduzca un radio mayor a 0");
            }
        } while (a <= 0);

        menuParametro(opcion, a);
        usuario.close();
    }

    private static void menuParametro(int opcion, double a) {

        double resultado;

        {
            switch (opcion) {
                case 1:

                    resultado = superficieEsfera(a);
                    System.out.println("Su superficie es " + resultado);

                    break;

                case 2:

                    resultado = volumenEsfera(a);
                    System.out.println("Su volumen es " + resultado);

                    break;

            }
        }

    }

    private static int validarOpcion() {

        int opcion;
        Scanner usuario = new Scanner(System.in);

        do {

            System.out.println("Introduzca la opcion que quiera hacer con el radio: (1) SUPERFICIE, (2) VOLUMEN");
            opcion = usuario.nextInt();

            if (opcion != 1 && opcion != 2) {
                System.out.println("Introduzca una opcion valida");
            }

        } while (opcion != 1 && opcion != 2);

        usuario.close();
        return opcion;
    }

    private static double superficieEsfera(double a) {

        return 4 * Math.PI * Math.pow(a, 2);

    }

    private static double volumenEsfera(double a) {

        return 4.0 / 3 * Math.PI * Math.pow(a, 3);
    }

}
