package Basic;

import java.util.Scanner;

/* Diseña un algoritmo que calcule el mayor de 5 números introducidos por el usuario.
Utiliza la versión de el “candidato” para resolverlo. Hay que controlar además,  que los
valores de introducidos sean correctos: números positivos.*/

public class elCandidato {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2 = 0, n3, n4, n5;

        // Suponemos que el menor es n2 (candidato)
        int menor = n2;

        System.out.print("Introduce n1: ");
        n1 = sc.nextInt();
        System.out.print("Introduce n2: ");
        n2 = sc.nextInt();
        System.out.print("Introduce n3: ");
        n3 = sc.nextInt();
        System.out.print("Introduce n4: ");
        n4 = sc.nextInt();
        System.out.print("Introduce n5: ");
        n5 = sc.nextInt();
        sc.close();

        // Suponemos que el mayor es n1 (candidato)
        int mayor = n1;

        if (n2 > mayor && n2 > 0) {
            mayor = n2;
        } else if (n3 > mayor && n3 > 0) {
            mayor = n3;
        } else if (n4 > mayor && n4 > 0) {
            mayor = n4;
        } else if (n5 > mayor && n5 > 0) {
            mayor = n5;
        } else if (n1 < menor && n1 > 0) {
            menor = n1;
        } else if (n3 < menor && n3 > 0) {
            menor = n3;
        } else if (n4 < menor && n4 > 0) {
            menor = n4;
        } else if (n5 < menor && n5 > 0) {
            menor = n5;
        } else if (n1 < 0 || n2 < 0 || n3 < 0 || n4 < 0 || n5 < 0) {
            System.out.println("error");
        }
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}
