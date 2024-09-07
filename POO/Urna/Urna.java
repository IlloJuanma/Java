package POO.Urna;

public class Urna {
    private int bolasBlancas;
    private int bolasNegras;

    public Urna(int BB, int BN) {
        this.bolasBlancas = BB;
        this.bolasNegras = BN;
    }

    public int getBolasNegras() {
        return bolasNegras;
    }

    public int getBolasBlancas() {
        return bolasBlancas;
    }

    public int suma() {
        return bolasBlancas + bolasNegras;
    }

    public char extraer() {

        int bolasAle = (int) (Math.random() * this.suma() + 1);

        if (bolasAle <= bolasBlancas) {
            bolasBlancas--;
            return 'b';
        } else {
            bolasNegras--;
            return 'n';
        }

    }

    /*
     * public void meter() {
     * bolasBlancas++;
     * }
     * public void meter2(){
     * bolasNegras++;
     * }
     */
    public void meterBola(String color) {
        if (color.equals("blanca")) {
            bolasBlancas++;
        } else if (color.equals("negra")) {
            bolasNegras++;
        }
    }
}
