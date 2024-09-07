package POO.Urna;

public class UrnaMain {
    public static void main(String[] args) {
        int ale = (int) (Math.random() * 10 + 1);

        Urna NB = new Urna(ale, ale);

        System.out.println("Urna creada con " + NB.getBolasBlancas() + " bolas blancas y  " + NB.getBolasNegras()
                + " bolas negras");

        while (NB.suma() > 1) {
            char salida = NB.extraer();
            char salida2 = NB.extraer();
            if (salida == 'b') {
                System.out.println("Se ha extraido una bola b");
            } else {
                System.out.println("Se ha extraido una bola n");
            }
            if (salida2 == 'b') {
                System.out.println("Se ha extraido una bola b");
            } else {
                System.out.println("Se ha extraido una bola n");
            }

            if ((salida == 'b' && salida2 == 'b') || (salida == 'n' && salida2 == 'n')) {
                NB.meterBola("blanca");
                System.out.println("Se ha metido una bola BLANCA");

            } else {
                NB.meterBola("negra");
                System.out.println("Se ha metido una bola NEGRA");
            }

            System.out.println("Quedan " + NB.suma() + " bolas en la urna");

            System.out.println("\t" + NB.getBolasBlancas() + " blancas y " + NB.getBolasNegras() + " negras");
        }

        System.out.println("Se ha extraido la bola final de color " + NB.extraer());

    }
}
