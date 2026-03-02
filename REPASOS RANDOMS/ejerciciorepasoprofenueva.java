import java.util.Scanner;

public class ejerciciorepasoprofenueva {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.println("Introduzca su nombre");

        do {

            nombre = usuario.nextLine();

            if (nombre.isEmpty()) {
                System.out.println("Debes escribir un nombre");
            }

        } while (nombre == "");

        System.out.println("Introduzca su edad");

        do {

            edad = usuario.nextInt();

            if (edad < 18) {
                System.out.println("Debes de ser mayor de edad");
            }

        } while (edad < 18);

        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);

        usuario.close();

        String[] clientes = new String[];
        clientes[] = nombre;
        for (int i = 0; i < clientes.length; i++) {
            
        }
    }
}
