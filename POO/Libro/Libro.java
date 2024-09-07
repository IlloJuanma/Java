package POO.Libro;

public class Libro {
    private final String ISBN;
    private final String Titulo;
    private final String Autor;
    private int NumeroPaginas;

    public Libro() {
        this.ISBN = "0458 - 874 - 55";
        this.Titulo = "El archivo de las Tormentas";
        this.Autor = "Sanderson";
        this.NumeroPaginas = 500;

    }

    public String getAutor() {
        return Autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String mostrar() {
        String res = "";

        res += "El libro " + Titulo + " con el ISBN: " + ISBN + " creado por "
                + Autor + " tiene " + NumeroPaginas + " paginas";

        return res;

    }
}
