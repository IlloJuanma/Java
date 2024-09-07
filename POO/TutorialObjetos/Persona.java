package POO.TutorialObjetos;

public class Persona {
    // Propiedas de la clase
    String nombre;
    int edad;
    String profesion;

    // Metodo constructor
    public Persona(String nombre, String job, int edad) {
        this.nombre = nombre;
        this.profesion = job;
        this.edad = edad;
    }

    // sobrecarga del metodo constructor
    public Persona(String nombre, String job) {
        this.nombre = nombre;
        this.profesion = job;
        this.edad = 20;

    }

    public Persona() {
        this.nombre = "Desconocido";
        this.profesion = "Misterio";
        this.edad = 0;
    }

    // Los metodos son acciones que pueden realizar los objetos de una clase
    // como hablar, correr, chequear, desplazarse...
    // ámbito -- tipo de dato a devolver -- nombre (parametros/datos recibidos){
    // Pueden:
    // Recibir datos a traves de los parentesis
    // Devolver UN dato usando la sentencia return

    public void hablar() {// NO RECIBE(nada en parentesis), NO DEVUELVE(VOID)
        System.out.println("Soy una persona llamada " + this.nombre);

    }

    // sobrecargar
    // cambiando el numero de argumento entre los parentesis
    public void hablar(String saludo) {
        System.out.println(this.nombre + " dice: " + saludo);

    }

    public void saludar(String frase) { // NO DEVUELVE, SI RECIBE
        System.out.println("Hola!," + frase);
    }

    public int dobleEdad() { // NO RECIBE, SI DEVUELVE
        int res = this.edad * 2;

        return res;
    }

    public int jubilacion(int edadJubilacion) { // DEVUELVE Y RECIBE
        int res = edadJubilacion - this.edad;
        if (res < 0) {
            res = 0;
        }
        return res;
    }
}
