package POO.CuentaBancaria;

public class Cuenta {
    private String titular;
    private int cantidad;

    public Cuenta(int cantidad) {
        this.titular = "Juanma";
        this.cantidad = cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void ingresar(int ingreso) {
        if (ingreso > 0) {
            this.cantidad += ingreso;

        } else {
            System.out.println("No puedes ingresar en negativo");
        }

    }

    public void retirar(int retirado) {
        if (retirado <= this.cantidad) {
            this.cantidad -= retirado;

        } else {
            System.out.println("Error, no hay disponible");
        }
    }

    public String mostrar() {
        String res = "";

        res += "Esta cuenta pertenece a " + titular + "\n";
        res += "y posee actualmente una cantidad de " + cantidad + "€";

        return res;
    }
}
