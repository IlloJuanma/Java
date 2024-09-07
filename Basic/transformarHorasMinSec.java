package Basic;

import java.util.Scanner;
/* Diseña   un   algoritmo   que   pida   por   teclado   un   tiempo   expresado   en   segundos   y
muestre por pantalla ese valor expresado en horas, minutos y segundos.*/

public class transformarHorasMinSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hora = 3600;
        final int minuto = 60;
        int t, h, m, s;

        System.out.print("Introduce tiempo en segundos: ");
        t = sc.nextInt();

        h = t / hora;
        t = t % hora;
        m = t / minuto;
        s = t % minuto;
        
        System.out.println("Hora: " + h + " minutos: " + m + " segundos: " + s);
        sc.close();
    }
}
