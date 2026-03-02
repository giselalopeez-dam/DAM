//Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.

public class EJERCICIOBUCLES8 {
    
    public static void main(String[] args) {
        
        System.out.println("A continuacion, se muestra la tabla del 1 al 10");


        int tablas = 0;
        int multiplicaciones = 0;


        for (tablas = 1; tablas <= 10; tablas++) {
            

            for (multiplicaciones = 1; multiplicaciones <= 10; multiplicaciones++) {

                int resultado = tablas * multiplicaciones;
                System.out.println(tablas + " x " + multiplicaciones + " = " + resultado);
            
            }
        }

        
    }
}
