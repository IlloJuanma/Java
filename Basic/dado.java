package Basic;

import java.util.Scanner;

/*8. Crea un algoritmo que simule el lanzamiento de un dado de N caras. El número de
caras del dado se solicitará por teclado.*/

public class dado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dado;

        System.out.print("Introduce numero de caras: ");
        dado = sc.nextInt();
        dado = (int) (Math.random() * dado + 1);

        System.out.println(dado);
        sc.close();
    }
}
