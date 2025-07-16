package controllers;

import models.Book;
import java.util.*;

public class LibroController {
    public Set<Book> procesarLibros(List<Book> libros) {
        Comparator<Book> comparador = new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                int compaTitulo = b2.getTitulo().compareTo(b1.getTitulo());
                if (compaTitulo != 0) return compaTitulo;

                return Integer.compare(b1.getAnio(), b2.getAnio());
            }
        };

        Set<Book> resultado = new TreeSet<>(comparador);
        resultado.addAll(libros);
        return resultado;
    }
}
