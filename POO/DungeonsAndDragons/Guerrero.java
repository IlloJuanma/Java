package POO.DungeonsAndDragons;
public class Guerrero extends Heroe{
     // Método constructor del Guerrero
     public Guerrero(String nombre){
        // Atributos del guerrero
        super(nombre);
        this.inteligencia = (int) calcularAleatorio(5, 3);
        this.fuerza = (int) calcularAleatorio(27, 12);
        this.destreza = (int) calcularAleatorio(8, 2);
        this.vida = (int) calcularAleatorio(20, 8);
    }

    //Metodo aleatorio privado para ahorrar codigo. Es un metodo privado, mio y solo mio
    private double calcularAleatorio(double max, double min) {
        return (Math.random() * (max - min)) + min;
    }
    


    // Método furia del guerrero, que aumento su fuerza pero baja su vida
    public void furia(){
        // Comprobamos que no esté muerto
        if (!this.muerto){
            // Comprobamos que tenga más de 6 de vida para usarlo
            if (this.vida > 6){
                this.fuerza += 5;
                this.vida -= 6;
                System.out.println(this.nombre + " ha usado furia. Ahora su fuerza es " + this.fuerza + " y su vida es " + this.vida);
            }else{
                System.out.println("La vida de " + this.nombre + " es demasiado baja, no puede usar furia");
            }
        }else{
            System.out.println(this.nombre + " ha usado furia, pero con su ultimo aliento, se muere lentamente...");
        }
    }

    // Sobreescribimos el metodo esquivar original de heroe, para decirle como lo hará este Héroe
    @Override
    public boolean esquivar(){
        // Comprobamos que no esté muerto
        if (!this.muerto){
            int numAle = (int) calcularAleatorio(30, 3); // Porque es guerrero

            // Comprobamos que el numAle sea menor que la Destreza, si es mayor, no esquiva
            if (numAle < this.destreza){
                System.out.println(this.nombre + " ha sacado " + numAle + " y ha conseguido esquivar");
                return true; // Esquiva
                
            }else{
                System.out.println(this.nombre + " no ha conseguido esquivar el ataque enemigo");
                return false; // No esquiva
            }
        }else{
            System.out.println(this.nombre + " está muerto, no creo que esquive mucho");
            return false;
        }
    }

    /**
     * Sobreescribimos el metodo atacar para decirle como va a atacar esta clase Héroe
     * este método necesita un argumento, otro heroe que defienda
     */
    @Override
    public void atacar(Heroe defensor){
        if(!this.muerto){
            // Lo primero que hace el defensor es intentar esquivar, si lo consigue 0 daño
            if(defensor.esquivar()){
                System.out.println(defensor.nombre + " ha esquivado el ataque!");
            // Si no esquiva, depende del atacante inflige un daño diferente
            }else{
                defensor.vida -= this.fuerza;
                if(defensor.vida == 0){
                    defensor.muerto = true;
                }

            }
        // Si el defensor ya esta muerto
        }else{
            System.out.println("El " + defensor.nombre + " ya está muerto, le pegas a un cadáver que asco");
            defensor.muerto=true;
        }
        
    }
    // Sobreescribimos el metodo toString, para mostrar los datos del guerrero
    @Override
    public String toString() {
        String res = super.toString();

        res += "---------------\n";
        res += "Nombre: " + this.nombre + "\n";
        res += "Tipo: Guerrero\n";
        res += "Inteligencia: " + this.inteligencia + "\n";
        res += "Fuerza: " + this.fuerza + "\n";
        res += "Destreza: " + this.destreza + "\n";
        res += "Vida: " + this.vida + "\n";
        res += "----------------";

        return res;
    }
}
