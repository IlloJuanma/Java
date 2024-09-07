package Basic;

public class fizzBuzzForVersion {
    public static void main(String[] args) {
        // Recorremos los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Si es divisible por 3 y por 5, imprimimos FizzBuzz
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            // Si es divisible solo por 3, imprimimos Fizz
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            // Si es divisible solo por 5, imprimimos Buzz
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            // Si no es divisible por ninguno, imprimimos el número
            else {
                System.out.println(i);
            }
        }
    }
}
