package Basic;

/* Para la cadena cad = “Volando, volando... siempre arriba”,  crear un algoritmo
que nos indique la posición de la letra ‘d’ en los 7 primeros caracteres de cad.
b) Igual pero ahora busca la letra ‘d’ en los 7 últimos*/

public class posicionDeLetra {
    public static void main(String[] args) {
        String frase = "Volando, Volando... siempre arriba";
        int pos = frase.indexOf('d', 0);

        System.out.println(pos);
        int pos2 = frase.lastIndexOf('d');

        System.out.println(pos2);
    }
}
