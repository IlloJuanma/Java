package Basic;

import java.util.Scanner;

public class juegoSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guerrero, mago;
        
        System.out.print("Introduce nombre del guerrero: ");
        guerrero = sc.nextLine();
        System.out.print("Introduce nombre del mago: ");
        mago = sc.nextLine();
        sc.close();

        int dado1 = (int) (Math.random() * 6 + 1);
        System.out.println(guerrero + " golpea y hace " + dado1 + " puntos de daño");
        int dado2 = (int) (Math.random() * 6 + 1);
        System.out.println(mago + " lanza bola de fuego y hace " + dado2 + " puntos de daño");
        if (dado1 > dado2) {
            System.out.println(guerrero + " le ha clavado el hacha en la cabeza a " + mago);

        } else if (dado2 > dado1) {
            System.out.println(mago + " ha quemado hasta los huesos a " + guerrero);

        } else {
            System.out.println("Nadie ha conseguido herir a su contrincante");
        }
    }
}
