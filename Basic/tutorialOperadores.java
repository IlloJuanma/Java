package Basic;

public class tutorialOperadores {
    /**
     * Operados aritméticos básicos de Java
     */

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Creamos una variable llamada suma del mismo tipo, donde guarda el resultado
        // de la suma
        int suma = a + b;

        // Creamos una variable tipo booleana para guardar el "true" o "false" de la
        // operacion en su interior ( comprueba si a es mayor a b)
        boolean esMayor = a > b; // en este caso daria false
        System.out.println(esMayor);

        // Esta variable de tipo boolean, guarda el resultado de comprobar si las dos
        // operaciones en su interior es "true" o "false"
        // aunque yo pongo "true" o "false" entre comillas, el resultado no es de tipo
        // string, es de tipo boolean ojo!
        boolean esIgual = (a == 5) && (b == 10); // esto da true
        System.out.println(esIgual);

        // Otros operadores
        int division = a / b;
        System.out.println(division);
        int mult = a * b;
        System.out.println(mult);
        int resto = a % b;
        System.out.println(resto);
        int resta = a - b;

        System.out.println(suma + "-" + resta); // esto imprime la variable suma, un string "-" y luego la variable
                                                // resta

        // Otra forma de hacer operaciones
        System.out.println(5 + 5); // esto imprime 10 directamente sin usar variables
        // o
        System.out.println(suma + resta); // da el resultado de sumar el contenido de la variable suma y el contenido de
                                          // la variable resta
    }
}
