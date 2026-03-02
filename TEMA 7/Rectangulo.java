public class Rectangulo {

    double base;
    double altura;

    void RectanguloCalculo() {

        double calculo = base * altura;

        System.out.println("El area del rectangulo introducido es: " + calculo);

    }

    void PerimetroCalculo() {

        double perimetro = (base * 2) + (altura * 2);
        System.out.println("El perimetro es: " + perimetro);
    }
}
