package Basic;

import java.util.Scanner;

public class humanoVsMaquina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definimos las variables de los participantes
        int numero, maquina, marcadorJugador = 0, marcadorMaquina = 0;

        System.out.println("Victorias Maquina: " + marcadorMaquina);
        System.out.println("Victorias Jugador: " + marcadorJugador);
        System.out.println("");
        // Empezamos el bucle para pedir número y comprobar resultado

        do {
            System.out.print("Introduce un numero entre 5 y 15 (0 para salir): ");
            numero = sc.nextInt();
            maquina = (int) (Math.random() * 20 + 1);
            if (numero > maquina) { // Si el número del jugador es mayor, gana el jugador y se le suma 1 al marcador
                System.out.println("La maquina ha sacado un: " + maquina);
                System.out.println("Tu ganas!!");
                marcadorJugador++;
            } else if (numero == maquina) { // Si es empate, sale el mensaje es empate y no se suma nada a ningún
                                            // marcador
                System.out.println("Empate, se sigue jugando");
            } else if (numero < maquina) { // Si el número aleatorio de la máquina es mayor, gana la máquina y se le
                                           // suma 1 al marcadormaquina
                System.out.println("La maquina ha sacado un: " + maquina);
                System.out.println("Has perdido");
                marcadorMaquina++;
            }
            System.out.println(" ");
            System.out.println("Victorias Maquina: " + marcadorMaquina);
            System.out.println("Victorias Jugador: " + marcadorJugador);
            System.out.println(" ");
        } while (numero >= 5 && numero <= 15 || numero != 0);
        System.out.println("Game Over!!");
        // Cerramos sc
        sc.close();

    }
}
