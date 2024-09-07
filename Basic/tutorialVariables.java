package Basic;

/**
 * Las variables es un espacio de memoria que se utiliza para almacenar un valor
 * que puede cambiar
 * o ser modificado durante la ejecución de un programa.
 * Las variables actúan como etiquetas o nombres que refieren a estos valores,
 * permitiendo a los programadores manipular datos de manera flexible y
 * reutilizable.
 */

public class tutorialVariables {
    public static void main(String[] args) { // este metodo es la main, aqui empezaremos a declarar nuestro código, es
        // el punto de entrada del programa. se suele generar solo

        // Las variables no pueden tener el mismo nombre, en caso de tenerlo y tener el
        // mismo tipo, se sobreescribira prevalenciendo el ultimo valor declarado

        int num1; // variable declarada
        num1 = 5; // variable inicializada
        System.out.println(num1);

        int num = 10; // variable tipo int (integer) numero entero positivo o negativo, variable
        // declarada e inicializada
        System.out.println(num);

        double atq = 2.5; // variable tipo double, numero con decimal positivo o negativo
        System.out.println(atq);

        String name = "Tyr"; // variable tipo String (cadena de caracteres), entre comillas dobles

        char letter = 'a'; // variable tipo char (character), una letra, entre comillas simples
        System.out.println(letter);
        boolean gank = true; // variable tipo booleano (me la agarra con la mano), indica verdadero o falso
        System.out.println(gank);

        /**
         * Podemos usar una frase para que imprima por pantalla o una variable
         */
        System.out.println("Tyr");
        System.out.println("---");
        System.out.println(name);

    }
}
