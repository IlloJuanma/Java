package POO.ElRectangulo;

public class Rectangulo {
    int base;
    int altura;
    int area;
    int perimetro;

    // Constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;

    }

    public void area() {
        area = base * altura;

    }

    public void perimetro() {
        perimetro = 2 * (base + altura);

    }

    public String mostrar() {
        String res = "";

        res += "-----------------------------------------------------------------\n";
        res += "Rectangulo con base " + base + " y altura " + altura + "\n";
        res += "Area: " + area + "\n";
        res += "Perimetro: " + perimetro + "\n";
        res += "-----------------------------------------------------------------";

        return res;
    }
}
