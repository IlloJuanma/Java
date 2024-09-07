package POO.Cafetera;

public class Cafetera {
    int capacidadMaxima;
    int cantidadActual;

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;

    }

    public void echarCafe(int cafe) {
        if (capacidadMaxima >= 1000) {
            System.out.println("Cafetera llena, desecha lo sobrante");
            this.cantidadActual = 1000;
            this.capacidadMaxima = 1000;

        } else {
            this.cantidadActual += cafe;
        }

    }

    public void llenarCafetera() {
        System.out.println("Llenamos la cafetera porque estamos to muerto zueño abe");
        this.cantidadActual = 1000;

    }

    public void vaciarCafetera() {
        System.out.println("Tiramos todo el cafe porque somos gilipollas");
        this.cantidadActual = 0;
    }

    public void servirTaza(int taza) {
        if (cantidadActual >= taza) {
            System.out.println("Servimos una tazita mis locos mis reyes");
            cantidadActual -= taza;

        }
    }

    public void cantidadCafe() {
        System.out.println("Queda " + cantidadActual + "cc de café en la cafetera");
    }
}
