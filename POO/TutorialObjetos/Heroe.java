package POO.TutorialObjetos;

public class Heroe {
    // una clase es una pantilla que nos definen algo de la vida real
    // lo primero es definir los atributos de esa clase

    // --------------------------------------------------------------------------
    // las variables de clase o atributos y esta mal definido
    /*
     * String nombre ="Patriota";
     * double altura= 1.90;
     * int peso =86;
     * boolean sexo = false; // true: femenino y False: masculino
     */
    // ASI NO SE HACE!!
    // --------------------------------------------------------------------------
    String nombre;
    double altura;
    int peso;
    boolean sexo;
    int vida;
    // Creamos una constante de clase, una variable que no cambia su valor
    final int MAX_VIDA = 100;

    boolean busy; // indica si el heroe/heroina está ocupado/a o no.

    // las variables se inicializan en el metodo constructor
    // Es un trozo de codigo que se ejecuta siempre que se haga un new
    // Dentro del parentesis, tenemos los argumentos es decir, variables que
    // necesita ese metodo para funcionar perfectamente
    public Heroe(String nombre, int peso, boolean sexo, double altura) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;

        // por defecto el heroe/heroina está libres
        this.busy = false;
        // por defecto todos empiezan con 100 de vida
        this.vida = this.MAX_VIDA;
    }
    // Métodos de la clase

    // dormir
    // desplazarse
    // luchar
    public void dormir(int recu) {

        if (!this.busy) {
            System.out.print(this.nombre + " está");
            if (this.sexo) {
                System.out.println(" dormida");

            } else {
                System.out.println(" dormido");
            }
            this.busy = true;
            this.vida += recu;
            if (this.vida > this.MAX_VIDA) {
                this.vida = this.MAX_VIDA;

            }

        } else {
            System.out.println(this.nombre + " esta haciendo otra cosa y "
                    + "no puede dormir ahora");
        }
    }

    public void desplazarse() {
        if (!this.busy) {
            System.out.println(this.nombre + " se esta desplazando...");
            this.busy = true;

        } else {
            System.out.println(this.nombre + " está haciendo otra cosa"
                    + "y no puede hacer otra cosa");

        }

    }

    public void llegar() {
        if (this.busy) {
            System.out.println(this.nombre + " ha llegado a su destino");
            this.busy = false;

        } else {
            System.out.println(this.nombre + " no se está desplazando.");
        }

    }

    // esta funcion necesita un parametro para indicar el daño
    public void luchar(int daño) {
        if (!this.busy) {
            System.out.println("El heroe lucha...");
            this.busy = true;
            this.vida -= daño;
            if (this.vida < 0) {
                this.vida = 0;

            }

        } else {
            System.out.println(this.nombre + " está haciendo otra cosa y no"
                    + "no puede ahora");
        }

    }

    public void pararLuchar() {
        if (this.busy) {
            System.out.println(this.nombre + " ha terminado de luchar");
            this.busy = true;

        } else {
            System.out.println(this.nombre + " no está luchando");
        }
    }

    // Metodo toString

    public String toString() {
        String res = "HEROE:\n";
        res += "-----\n";
        res += "Nombre: " + this.nombre + "\n";
        res += "Altura: " + this.altura + "\n";
        res += "Peso: " + this.peso + "\n";

        if (this.sexo) {
            res += "Es una chica";

        } else {
            res += "Es un chico";
        }
        if (this.busy) {
            res += " y está ocupad@";

        } else {
            res += " y no está ocupad@";
        }

        return res;

    }
}
