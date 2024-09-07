package POO.Aritmética;

public class Aritmetica {
    double valor1;
    double valor2;

    public Aritmetica() {
    }

    // Constructor
    public Aritmetica(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;

    }

    public double suma() {
        double sum = this.valor1 += this.valor2;
        return sum;
    }

    public double resta() {
        double res = this.valor1 -= this.valor2;
        return res;

    }

    public double multiplicacion() {
        double mult = this.valor1 *= this.valor2;
        return mult;

    }

    public double division() {
        double divi = this.valor1 /= this.valor2;
        return divi;
    }

    public double potencia() {
        double pot = Math.pow(this.valor1, this.valor2);
        return pot;

    }

    public String mostrar() {
        String res = "";

        res += "--------------------------------------------\n";
        res += "Suma: " + suma() + "\n";
        res += "Resta: " + resta() + "\n";
        res += "Multiplicacion: " + multiplicacion() + "\n";
        res += "Division: " + division() + "\n";
        res += "Potencia: " + potencia() + "\n";
        res += "--------------------------------------------";

        return res;
    }
}
