package POO.Cafetera;

public class CafeteraMain {
    public static void main(String[] args) {
        Cafetera cafe = new Cafetera(1000, 0);

        cafe.cantidadCafe();
        cafe.echarCafe(1500);
        cafe.cantidadCafe();
        cafe.vaciarCafetera();
        cafe.cantidadCafe();
        cafe.llenarCafetera();
        cafe.cantidadCafe();
        cafe.servirTaza(100);
        cafe.cantidadCafe();
    }
}
