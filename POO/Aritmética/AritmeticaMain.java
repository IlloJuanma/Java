package POO.Aritmética;

public class AritmeticaMain {
    public static void main(String[] args) {
        Aritmetica cuenta = new Aritmetica(8.5, 5.1);

        cuenta.suma();
        cuenta.resta();
        cuenta.multiplicacion();
        cuenta.division();
        cuenta.potencia();

        System.out.println(cuenta.mostrar());

    }
}
