package Basic;

import java.util.Scanner;

public class letraDNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;

        System.out.print("Introduce el número del DNI: ");
        int num = sc.nextInt();
        System.out.println("---");
        sc.close();

        /**
         * Switch es una estructura de control en la que podemos indicar que código se
         * ejecutará en los casos que queramos
         * es perfecto para hacer menus
         */
        switch (num % 23) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
            default:
                System.out.println("El número introducido no es correcto");
                letra = '$';
                break;
        }
        System.out.println("La letra que corresponde a " + num + " es: " + letra);
    }
}
