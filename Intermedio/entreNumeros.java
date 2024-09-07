package Intermedio;

import java.util.Scanner;

public class entreNumeros {
    static void mostrar(int a, int b) {
        // Operador ternario
        int mayor = a > b ? a : b;
        int menor = a < b ? a : b;

        for (int i = menor; i <= mayor; i++) {
            System.out.print(i);
            // Evitamos que salga el ultimo guion
            if (i != mayor) {
                System.out.print("-");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo numero:");

        int b = sc.nextInt();

        mostrar(a, b);

        sc.close();
    }

}
