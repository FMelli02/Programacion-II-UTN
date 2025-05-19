package modelo;

public interface InterfaceLibro {
    String cuit = "4546366228";

    int cantidad_paginas(Libro libro);
    String idioma_primario();
    String[] traducciones();
}
