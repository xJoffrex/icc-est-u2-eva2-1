package models;

public class Book {
    private String titulo;
    private String autor;
    private int year;

    public Book(String titulo, String autor, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getyear() {
        return year;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + year + ")";
    }
}
