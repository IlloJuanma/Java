package Intermedio;

import java.util.Scanner;

/**
 * Una vez pedido n numeros, creamos una tabla de n enteros
 * Leeremos los números de la tabla
 * Recorremos la tabla y procesaremos, sumando los valores (positivos y
 * negativos)
 * para calcular las medias y contar los ceros
 */

public class calcularNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba n: ");
        int n = sc.nextInt();
        int numeros[] = new int[n];

        // Acumulador de positivos
        int sumaPositivos = 0,
                // Contador de positivos
                contPositivos = 0,
                // Acumulador de negativos
                sumaNegativos = 0,
                // Contador de negativos
                contNegativos = 0,
                // Contador de ceros
                contCeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca número: ");
            numeros[i] = sc.nextInt();
        }

        // Usaremos un bucle para leer los datos y usaremos otro para procesar

        // Usaremos for-each
        for (int x : numeros) { // donde x es el valor de cada elemento en numeros, en cada vuelta tiene un
                                // valor diferente
            if (x == 0) {
                contCeros++; // Contamos los ceros
            } else {
                if (x > 0) {
                    sumaPositivos += x; // Acumulamos los positivos para hacer la media
                    contPositivos++; // Sumamos 1 al contador de positivos
                } else {
                    sumaNegativos += x; // Igual para los negativos
                    contNegativos++; // Sumamos 1 al contador de negativos
                }
            }
        }

        // Para hacer las medias hay que tener cuidado de no realizar la division por 0.
        // Eso daría error fatal.
        // Aunque esta hecho con if, la forma correcta seria try-catch
        if (contPositivos == 0) {
            System.out.println("Imposible hacer la media de los positivos");
        } else {
            System.out.println("Media de los positivos: " + (double) sumaPositivos / contPositivos); // casteamos por
                                                                                                     // los
                                                                                                     // decimales
                                                                                                     // posibles
        }
        System.out.println("---");

        if (contNegativos == 0) {
            System.out.println("Imposible hacer la media de los negativos");
        } else {
            System.out.println("Media de los negativos: " + (double) sumaNegativos / contNegativos); //
        }

        System.out.println("Cantidad de ceros: " + contCeros);

        sc.close();
    }
}
