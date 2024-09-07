package Basic;
import java.util.Scanner;

/* Crea un algoritmo que calcule la media de 5 números que se le pasan por teclado.*/

public class laMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2, num3, num4, num5;

        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el segundo numero; ");
        num2 = sc.nextDouble();
        System.out.print("Introduce el tercer numero: ");
        num3 = sc.nextDouble();
        System.out.print("Introduce el cuarto numero: ");
        num4 = sc.nextDouble();
        System.out.print("Introduce el quinto numero: ");
        num5 = sc.nextDouble();
        sc.close();
        double media = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.print("La media es: " + media);
    }
}
