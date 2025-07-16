package controllers;

import models.Book;
import java.util.*;

public class LibroController {
    public Set<Book> procesarLibros(List<Book> libros) {
        Set<Book> resultado = new TreeSet<>((b1, b2) -> {
            int cmpTitulo = b2.getTitulo().compareTo(b1.getTitulo()); 
            if (cmpTitulo != 0) return cmpTitulo;

            int cmpAnio = Integer.compare(b1.getAnio(), b2.getAnio()); 
            return cmpAnio;
        });

        resultado.addAll(libros);
        return resultado;
    }
}
