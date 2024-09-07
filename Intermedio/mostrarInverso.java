package Intermedio;

import java.util.Scanner;

public class mostrarInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos números desea introducir?: ");
        int num = sc.nextInt();

        int t[] = new int[num];

        for (int i = 0; i < t.length; i++) {
            System.out.print("Introduzca número: ");
            t[i] = sc.nextInt();
        }
        System.out.println("---");
        System.out.println("Los números en orden inverso son: ");
        for (int i = t.length - 1; i >= 0; i--) {
            System.out.println(t[i]);
        }
        sc.close();
    }
}
