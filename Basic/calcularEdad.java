package Basic;

import java.util.Scanner;

public class calcularEdad {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a_actual, a_nacimiento, edad;

        // Leemos los datos
        System.out.print("Año de nacimiento: ");
        a_nacimiento = sc.nextInt();

        System.out.println("---");

        System.out.println("Año actual: ");
        a_actual = sc.nextInt();

        edad = a_actual - a_nacimiento;

        System.err.print("Usted tiene " + edad + " años");
        sc.close();
    }
}
