package POO.DungeonsAndDragons;

public class Arquero extends Heroe{
    public Arquero(String nombre) {
        super(nombre);
        this.inteligencia = (int) calcularAleatorio(15, 7);
        this.fuerza = (int) calcularAleatorio(14, 5);
        this.destreza = (int) calcularAleatorio(20, 12);
        this.vida = (int) calcularAleatorio(12, 5);
    }

    // Metodo aleatorio privado para ahorrar codigo. Es un metodo privado, mio y
    // solo mio
    private double calcularAleatorio(double max, double min) {
        return (Math.random() * (max - min)) + min;
    }

    // Método del arquero, donde sube su destreza pero su fuerza baja 5 puntos
    public void rapidez() {
        if (!this.muerto) {
            this.destreza += 5;
            this.fuerza -= 5;
            System.out.println(this.nombre + " ha usado Rapidez. Ahora su destreza es " + this.destreza
                    + " y su fuerza " + this.fuerza);
        } else {
            System.out.println(this.nombre + " no puede usar Rapidez, está muerto bro");
        }
    }

    @Override
    public boolean esquivar() {
        if (!this.muerto) {
            int numAle = (int) calcularAleatorio(50, 4);

            if (numAle < this.destreza) {
                System.out.println(this.nombre + " ha esquivado el ataque!");
                return true;
            } else {
                System.out.println(this.nombre + " no ha conseguido esquivar el ataque enemigo");
                return false;
            }
        } else {
            System.out.println(this.nombre + " está muerto, no puede esquivar");
            return false;
        }
    }

    @Override
    public void atacar(Heroe defensor) {
        if (!this.muerto) {
            if (defensor.esquivar()) {
                System.out.println("El defensor " + defensor.nombre + " ha esquivado el ataque, espabila!");
            } else {
                defensor.vida -= this.fuerza / 3;
                System.out.println(
                        this.nombre + " ha atacado con éxito a su enemigo, haciendo " + this.fuerza / 3 + " de daño!");
                if (defensor.vida == 0) {
                    System.out.println(defensor.nombre + " ha caido en combate contra " + this.nombre);
                    defensor.muerto = true;
                }
            }
        } else {
            System.out.println("El" + defensor.nombre + " está muerto desde hace tiempo, no se que esperas");
            defensor.muerto = true;
        }

    }

    @Override
    public String toString() {
        String res = super.toString();

        res += "---------------\n";
        res += "Nombre: " + this.nombre + "\n";
        res += "Tipo: Elfo\n";
        res += "Inteligencia: " + this.inteligencia + "\n";
        res += "Fuerza: " + this.fuerza + "\n";
        res += "Destreza: " + this.destreza + "\n";
        res += "Vida: " + this.vida + "\n";
        res += "----------------";

        return res;
    }
}
