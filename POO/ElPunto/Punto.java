package POO.ElPunto;

import java.util.Scanner;

public class Punto {
    int X;
    int Y;

    // Metodo constructor
    public Punto(int hori, int vert) {
        this.X = hori;
        this.Y = vert;
    }

    public void moverHorizontal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("SE mueve: ");
        X = sc.nextInt();
        sc.close();
    }

    public void moverVertical() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Se mueve dos puntos: ");
        Y = sc.nextInt();
        sc.close();
    }

    public void mostrar() {
        System.out.println("Punto(" + X + "," + Y + ")");
    }
}
