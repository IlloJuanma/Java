package Basic;

import java.util.Scanner;

/*21. Realiza un algoritmo que indique si un año es bisiesto o no. Un año es bisiesto si es 
divisible entre 4 y no es divisible entre 100 o es divisible entre 400.*/

public class añoBisiesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Introduce año: ");
        año = sc.nextInt();
        sc.close();
        if ((año % 4 == 0) && (año % 100 != 0 || (año % 400 == 0))) {
            System.out.print("El año es bisiesto");
        } else {
            System.out.print("El año no es bisiesto");
        }
    }
}
