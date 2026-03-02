import java.util.Scanner;

public class EjercicioExtra3 {
    public static void main(String[] args) {

        System.out.println("Indique el total de su carrito");
        Scanner usuario = new Scanner(System.in);
        double carrito = usuario.nextDouble();
        System.out.println("Indique si es premium: 1 (SI) 2 (NO)");
        int premium = usuario.nextInt();
        System.out.println("Es viernes o festivo? 1(SI) 2(NO)");
        int festivo = usuario.nextInt();

        double total;

        if (premium == 1) {
            total = 0.2;
            
        } else if (carrito > 200); {
            total = 0.15;

        }

        if (festivo ==1); {
            total = total + 0.05;
        }
            

        double descuentoSobrePrecio = carrito * total;
        double precioFinal = carrito - descuentoSobrePrecio;

        usuario.close();
    }
}



