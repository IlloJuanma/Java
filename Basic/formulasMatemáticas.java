package Basic;
import java.util.Scanner;

/*
 * 4. Diseña un algoritmo que pida dos números por teclado (m y n) y calcule las
 * siguientes expresiones:
 * a) m / n*(m-n)
 * b) 12.3 / m + 5 - n * 9
 * c) m * 2048 / n*1024 - mn
 * d) El resto de la división: (3203 /m-n)n / (n2*m3)
 */

public class formulasMatemáticas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double m, n;

        System.out.print("Introduce numero m: ");
        m = sc.nextDouble();
        System.out.print("Introduce numero n: ");
        n = sc.nextDouble();

        System.out.println("a): " + m / n * (m / n));
        double b = 12.3 / m + 5 - n * 9;
        System.out.println("b); " + b);
        double potencia = Math.pow(m, n);
        System.out.println("c): " + m * 2048 / n * 1024 + -potencia);
        double ult = 3203 / m - n;
        double ult2 = Math.pow(ult, n);
        double ult3 = Math.pow(n, 2);
        double ult4 = Math.pow(m, 3);
        double ult5 = ult3 * ult4;
        System.out.println("d); " + ult2 / ult5);
        sc.close();

    }
}
