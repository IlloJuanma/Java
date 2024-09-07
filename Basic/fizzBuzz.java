package Basic;

import java.util.Scanner;

/* Se te pide que imprimas los números del 1 al 100. Sin embargo:

Si el número es divisible por 3, en lugar de imprimir el número, debes imprimir "Fizz".
Si el número es divisible por 5, en lugar de imprimir el número, debes imprimir "Buzz".
Si el número es divisible tanto por 3 como por 5 (es decir, divisible por 15), en lugar del número, debes imprimir "FizzBuzz".
Si el número no es divisible ni por 3 ni por 5, simplemente imprimes el número.

*/
public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Introduce numero entre 1 y 100: ");
        num1 = sc.nextInt();
        if (num1 % 3 == 0 && num1 >= 0 && num1 <= 100) {
            System.out.print("Fizz");
        } else if (num1 % 5 == 0 && num1 >= 0 && num1 <= 100) {
            System.out.print("Buzz");
        } else if (num1 % 3 == 0 && num1 % 5 == 0 && num1 >= 0 && num1 <= 100) {
            System.out.println("FizzBuzz");
        } else if (num1 % 10 == 0 && num1 >= 0 && num1 <= 100) {
            System.out.println(num1);
        } else {
            System.out.println(num1);
        }
        sc.close();
    }
}
