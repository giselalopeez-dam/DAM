import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        System.out.println("Diga un numero total de dias y le decimos cuantas semanas son");
        Scanner usuario = new Scanner(System.in);
        int dias = usuario.nextInt();

        int semanas = dias / 7;
        int diasSobrantes = dias % 7;

        if (dias <= 0) {

            System.out.println("El minimo de dias es de '1'. Por favor, indique de forma correcta los dias");

        } else if (dias >= 14) {
            if (diasSobrantes == 0) {

                System.out.println("El resultado es " + semanas + " semanas.");
            } else {

                System.out.println("El resultado es: " + semanas + " semanas y " + diasSobrantes + " dias");
            }

        } else {

            System.out.println("El resultado es: " + semanas + " semana y " + diasSobrantes + " dias");
        }

        usuario.close();

    }
}
