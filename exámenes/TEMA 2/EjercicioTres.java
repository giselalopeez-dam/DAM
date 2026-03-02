import java.util.Scanner;

public class EjercicioTres {
    
    public static void main(String[] args) {
        
        System.out.println("Ponga su anio de nacimiento y calculamos su edad");
        Scanner usuario = new Scanner (System.in);

        int numero = usuario.nextInt();
        int resultado = 2025 - numero;

        if  (numero > 2025) {
            System.out.println("Introduzca una edad valida");
        } else if (resultado < 18) {
            System.out.println("Tiene " + resultado + ", es menor de edad");

        } else if (resultado >= 18) {
            System.out.println("Tiene " + resultado + ", es mayor de edad");
        }

        usuario.close();
    }
}
