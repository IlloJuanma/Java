package Basic;

/*6. Crea un algoritmo que, partiendo de la cadena “LA LLUVIA EN SEVILLA ES UNA 
MARAVILLA” obtenga las cadenas “sevilla es una maravilla” y “la lluvia es 
una maravilla”. Muestra ambas por pantalla.*/

public class dividiendoCadenas {
    public static void main(String[] args) {
        String frase = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";

        System.out.println(frase);

        String subfrase = frase.substring(13, 37);

        System.out.println(subfrase);

        String subfrase2 = frase.substring(0, 10);
        String subfrase3 = frase.substring(21, 37);

        System.out.println(subfrase2 + subfrase3);
    }
}
