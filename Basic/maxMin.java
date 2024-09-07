package Basic;

import java.util.Scanner;

/* Se pide realizar un algoritmo  que solicite por teclado tres números. Si todos los
valores ingresados son menores a 0, se mostrará por pantalla:
Los números son: números introducidos
El mayor es: el número mayor
El menor es: el número menor*/

public class maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, mayor, menor;

        System.out.println("Introduce numero 1: ");
        n1 = sc.nextInt();
        System.out.println("Introduce numero 2: ");
        n2 = sc.nextInt();
        System.out.println("Introduce numero 3: ");
        n3 = sc.nextInt();

        // Suponemos que ambos es el min y el max
        mayor = n1;
        menor = n1;

        if (n1 > 0 || n2 > 0 || n3 > 0) {
            System.out.println("Error");

        }
        if (n2 > mayor && n2 > n3) {
            mayor = n2;
            System.out.println("Número mayor: " + mayor);
        }
        if (n3 > mayor && n3 > n2) {
            mayor = n3;
            System.out.println("Número mayor: " + mayor);
        } else {
            System.out.println("Número mayor: " + mayor);
        }
        if (n1 > 0 || n2 > 0 || n3 > 00) {
            System.out.println("Error");
        }
        if (n2 < menor && n2 < n3) {
            menor = n2;
            System.out.println("Número menor: " + menor);
        }
        if (n3 < menor && n3 < n2) {
            menor = n3;
            System.out.println("Número menor: " + n3);

        } else {
            System.out.println("Número menor: " + menor);
        }
        sc.close();
    }
}
