package Basic;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- Bienvenido a la calculadora ---");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Raiz cuadrada");
            System.out.println("6- Salir");
            System.out.print("Seleccione opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma(sc);
                    break;
                case 2:
                    realizarResta(sc);

                    break;
                case 3:
                    realizarMult(sc);
                    break;
                case 4:
                    realizarDivi(sc);
                    break;
                case 5:
                    realizarRaizC(sc);
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    System.out.println(separador());
            }
        } while (opcion != 6);
        sc.close();
    }

    // Pedir valores ----------
    public static double obtenerNumero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    // Realizar suma ----------
    public static double sumar(double num1, double num2) {
        double resultado = num1 + num2;
        return Math.round(resultado * 100.0) / 100.0;
    }

    public static void realizarSuma(Scanner sc) {
        double num1 = obtenerNumero(sc, "Introduce numero 1: ");
        double num2 = obtenerNumero(sc, "Introduce numero 2: ");
        double resultado = sumar(num1, num2);
        System.out.println("La suma de " + num1 + " y " + num2 + " es = " + resultado);
        System.out.println(separador());
    }

    // Realizar resta ----------
    public static double restar(double num1, double num2) {
        double resultado = num1 - num2;
        return Math.round(resultado * 100.0) / 100.0;
    }

    public static void realizarResta(Scanner sc) {
        double num1 = obtenerNumero(sc, "Introduce numero 1: ");
        double num2 = obtenerNumero(sc, "Introduce numero 2: ");
        double resultado = restar(num1, num2);
        System.out.println("La resta de " + num1 + " y " + num2 + " es = " + resultado);
        System.out.println(separador());
    }

    // Realizar mult ----------
    public static double mult(double num1, double num2) {
        double resultado = num1 * num2;
        return Math.round(resultado * 100.0) / 100.0;
    }

    public static void realizarMult(Scanner sc) {
        double num1 = obtenerNumero(sc, "Introduce numero 1: ");
        double num2 = obtenerNumero(sc, "Introduce numero 2: ");
        double resultado = mult(num1, num2);
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es = " + resultado);
        System.out.println(separador());
    }

    // Realizar div ----------
    public static double div(double num1, double num2) {
        double resultado = num1 / num2;
        return Math.round(resultado * 100.0) / 100.0;
    }

    public static void realizarDivi(Scanner sc) {
        double num1 = obtenerNumero(sc, "Introduce numero 1: ");
        double num2 = obtenerNumero(sc, "Introduce numero 2: ");
        double resultado = div(num1, num2);
        System.out.println("La division de " + num1 + " y " + num2 + " es = " + resultado);
        System.out.println(separador());
    }

    // Realizar RaizC ----------
    public static double raizC(double num1) {
        double resultado = Math.sqrt(num1);
        return Math.round(resultado * 100.0) / 100.0;
    }

    public static void realizarRaizC(Scanner sc) {
        double num1 = obtenerNumero(sc, "Introduce numero 1: ");
        double resultado = Math.sqrt(num1);
        System.out.println("La Raiz Cuadrada de " + num1 + " es = " + resultado);
        System.out.println(separador());
    }

    // Separador ----------
    public static String separador() {
        return "-----------";
    }
}
