package Basic;

import java.util.Scanner;

public class contandoDinero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese dinero: ");
        cantidad = sc.nextInt();
        int b500 = cantidad / 500;
        cantidad %= 500;
        int b200 = cantidad / 200;
        cantidad %= 200;
        int b100 = cantidad / 100;
        cantidad %= 100;
        int b50 = cantidad / 50;
        cantidad %= 50;
        int b20 = cantidad / 20;
        cantidad %= 20;
        int b10 = cantidad / 10;
        cantidad %= 10;
        int b5 = cantidad / 5;
        cantidad %= 5;
        int m2 = cantidad / 2;
        cantidad %= 2;
        int m1 = cantidad;

        if (b500 != 0) {
            System.out.println(b500 + " biletes de 500");
        }
        if (b200 != 0) {
            System.out.println(b200 + " billetes de 200");
        }
        if (b100 != 0) {
            System.out.println(b100 + " billetes de 100");
        }
        if (b50 != 0) {
            System.out.println(b50 + " billetes de 50");
        }
        if (b20 != 0) {
            System.out.println(b20 + " billetes de 20");
        }
        if (b10 != 0) {
            System.out.println(b10 + " billetes de 10");
        }
        if (b5 != 0) {
            System.out.println(b5 + " billetes de 5");
        }
        if (m2 != 0) {
            System.out.println(m2 + " monedas de 2");
        }
        if (m1 != 0) {
            System.out.println(m1 + " monedas de 1");
        }
        sc.close();
    }
}
