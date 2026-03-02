public class Coche {

    private String marca;
    private String modelo;
    private int anio;

    private Color color;

    void InfoCoche() {
        System.out.println("El modelo es: " + modelo);
        System.out.println("La marca es: " + marca);
        System.out.println("El anio es: " + anio);
        System.out.println("El color es: " + color);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public Color getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Coche(String marca, String modelo, int anio, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public Coche() {
        this.marca = "Desconocido";
        this.modelo = "Desconocido";
        this.anio = 2010;
        this.color = Color.AZUL;
    }

}
