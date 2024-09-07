package Basic;

import java.util.Scanner;

/* Un partido de fútbol tiene una duración de 90 minutos. El minuto 1 se considera que
abarca desde los 0 segundos hasta los 59 segundos. El minuto 2 abarca desde los 60
segundos hasta los 119 segundos... así sucesivamente hasta el último minuto, que es el
minuto 90 y abarca desde los 5340 segundos hasta los 5400 segundos.
Crea un programa que pida al usuario el número de segundos transcurridos y muestre el
minuto en que nos encontramos.*/

public class partidoFutbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos, res;
        final int minutos = 60;

        System.out.print("Ingresa segundos: ");
        segundos = sc.nextInt();
        res = segundos / minutos;

        if (segundos <= 5400) {
            System.out.println(segundos + " segundos es igual a: " + res + " minutos");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
