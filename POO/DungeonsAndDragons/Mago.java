package POO.DungeonsAndDragons;
public class Mago extends Heroe{
     /**
     * Esta variable protegida indica que la vida máxima del mago
     * no va a poder ser mas de 10, por la que la hacemos protegida
     * y no se puede sobrepasar
     */
    protected int vidaMAX;

    public Mago(String nombre) {
        super(nombre);
        this.inteligencia = (int) calcularAleatorio(22, 12);
        this.fuerza = (int) calcularAleatorio(10, 5);
        this.destreza = (int) calcularAleatorio(12, 5);
        this.vida = (int) calcularAleatorio(10, 2);
        this.vidaMAX = 10;
    }

    // Metodo aleatorio privado para ahorrar codigo. Es un metodo privado, mio y
    // solo mio
    private double calcularAleatorio(double max, double min) {
        return (Math.random() * (max - min)) + min;
    }
    

    /**
     * Método propio del mago, curarse, donde el mago se cura 3 puntos de vida
     * pero no puede hacer si tiene mas de 7 puntos de vida y menos de 0
     */

    public void curarse() {
        if (!this.muerto) {
            if (this.vida <= 7 && this.vida > 0) {
                System.out.println(this.nombre + " ha usado sus poderes mágicos y se cura 3 puntos de vida");
                this.vida += 3;
                System.out.println(this.nombre + " su vida actual es " + this.vida);
            } else {
                this.vida = this.vidaMAX;
            }
        } else {
            System.out.println(this.nombre + " esta muerto y no puede mover su varita mágica para curarse");
        }
    }

    // Sobreescribimos los metodos abstractos (astrastros)
    @Override
    public boolean esquivar() {
        if (!this.muerto) {
            int numAle = (int) calcularAleatorio(40, 2); // Porque es mago
            if (numAle < this.destreza) {
                return true;

            } else {
                return false;
            }

        } else {
            System.out.println("Esta muerto, esquivar poco");
            return false;
        }
    }

    @Override
    public void atacar(Heroe defensor) {
        if (!defensor.muerto) { // Si esta vivo, se puede atacar, esque sino la propiedad muerto no se usaba
                                // nunca :S
            if (defensor.esquivar()) {
                System.out.println(defensor.nombre + " ha esquivado!");

            } else {
                System.out.println("El ataque de " + this.nombre + " ha sido un éxito, le da con una bola de FOGO!");
                defensor.vida -= this.fuerza / 2;
                if (defensor.vida == 0) {
                    System.out.println("El enemigo del mago " + defensor.nombre
                            + " ha caido en combate gracias a poder del fuego");
                    defensor.muerto = true;
                }

            }

        } else {
            System.out.println("El " + defensor.nombre + " esta muerto, le pegas a un cadaver eres un ansioso");
            defensor.muerto = true;
        }

    }

    @Override
    public String toString() {
        String res = super.toString();

        res += "---------------\n";
        res += "Nombre: " + this.nombre + "\n";
        res += "Tipo: Mago\n";
        res += "Inteligencia: " + this.inteligencia + "\n";
        res += "Fuerza: " + this.fuerza + "\n";
        res += "Destreza: " + this.destreza + "\n";
        res += "Vida: " + this.vida + "\n";
        res += "----------------";

        return res;
    }
}
