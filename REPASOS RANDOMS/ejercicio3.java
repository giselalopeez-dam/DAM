import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        System.out.println("Indique dos numeros y la operacion que quiere realizar");
        Scanner usuario = new Scanner(System.in);

        System.out.println("Indique el primer numero");
        double numero1 = usuario.nextDouble();

        System.out.println("Indique el segundo numero");
        double numero2 = usuario.nextDouble();

        System.out.println(
                "Indique la operacion que quiere realizar. Siendo (1) SUMA, (2) RESTA, (3) MULTIPLICACION, (4) DIVISION");
        int operacion = usuario.nextInt();

        switch (operacion) {
            case 1:
                double suma = numero1 + numero2;
                System.out.println("Su suma es " + suma);
                break;

            case 2:
                double resta = numero1 - numero2;
                System.out.println("Su resta es " + resta);
                break;

            case 3:
                double multiplicacion = numero1 * numero2;
                System.out.println("Su multiplicacion es " + multiplicacion);
                break;

            case 4:
                double division = numero1 / numero2;
                if (numero2 == 0) {

                    System.out.println("No puedes dividir entre cero, introduzca otro numero");

                } else {

                    System.out.println("Su division es " + division);
                }
                break;

            default:
                System.out.println("Introduca la operacion que quiere realizar de forma valida");
                break;

        }

        usuario.close();
    }
}
