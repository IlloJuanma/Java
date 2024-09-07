package POO.DungeonsAndDragons;
public abstract class Heroe {
     //Definimos las propiedades

     protected String nombre;
     protected int inteligencia;
     protected int fuerza;
     protected boolean muerto;
     protected int destreza;
     protected int vida;
     
     //Metodo constructor
     public Heroe(String nombre) {
         this.nombre = nombre;
         this.inteligencia = 0;
         this.fuerza = 0;
         this.destreza = 0;
         this.vida = 0;
         this.muerto = false;
     }
 
     /**
      * Como dependiendo de que clase de heroes sea hará una cosa u otra, no sabemos
      * como hará ese metodo, lo cual Heroe es una clase abstracta, o como
      * se conoce en malaga "astrastra"
      * @param defensor
      */
     public abstract void atacar(Heroe defensor);
 
     /**
      * Este método se sobreescribira en cada clase para que esquive
      * de una forma u otra
      * @return
      */
     public abstract boolean esquivar();
     
 
     /**
      * El método toString, se sobreescribira en cada clase para mostrar los datos
      * de cada clase correspondiente
      */
     public String toString(){
         String res="";
         
         
         return res;
     }
}
