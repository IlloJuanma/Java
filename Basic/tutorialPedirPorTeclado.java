package Basic;

// Para usar la clase Scanner, debemos importarla
import java.util.Scanner;

public class tutorialPedirPorTeclado {
      public static void main(String[] args){
        // Creamos un objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");

        // Pedimos por teclado, guardando en una variable el resultado, del mismo tipo que queremos que sea ese dato guardado
        int edad = sc.nextInt();

        System.out.println("El próximo año tendra: " + (edad + 1));

        // Cerramos teclado
        sc.close();
    }
}
