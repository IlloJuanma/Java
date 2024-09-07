package POO.ElRectangulo;

public class RectanguloMain {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(5, 5);
        rec.area();
        rec.perimetro();

        System.out.println(rec.mostrar());
    }
}
