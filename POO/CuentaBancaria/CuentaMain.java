package POO.CuentaBancaria;

public class CuentaMain {
    public static void main(String[] args) {
        Cuenta unicaja= new Cuenta(7500);
        
        System.out.println(unicaja.mostrar());
        System.out.println("-----");
        unicaja.ingresar(500);
        System.out.println(unicaja.mostrar());
        System.out.println("----");
        unicaja.retirar(1000);
        System.out.println(unicaja.mostrar());
    }
}
