package POO.ElPunto;

public class PuntoMain {
    public static void main(String[] args) {
        Punto pnt = new Punto(0, 0);

        pnt.moverHorizontal();
        pnt.moverVertical();
        pnt.mostrar();
    }
}
