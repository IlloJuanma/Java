package POO.Libro;

public class LibroMain {
    public static void main(String[] args) {
        Libro libro1 = new Libro();

        System.out.println(libro1.mostrar());

        System.out.println("-----------");

        libro1.setNumeroPaginas(300);

        System.out.println(libro1.mostrar());

    }
}
