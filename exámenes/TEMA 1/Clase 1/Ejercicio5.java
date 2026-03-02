import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese uun caracter y lo convertiremos a codigo ASCII");
        Scanner entrada = new Scanner (System.in);
        char caracter = entrada.nextLine().charAt(0);
        int ascii = (int)caracter;
        System.out.println("Su cogido ASCII es " + ascii);



        entrada.close();
        
}
}

