package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UsuarioTest {
    static Usuario usuario;

    @BeforeAll
    static void inicializarUsuario() {
        usuario = new Usuario();
        System.out.println("Inicio de las pruebas del Usuario");
    }

    @AfterAll
    static void finalizarUsuario() {
        System.out.println("Fin de las pruebas del Usuario");
    }

    @Test
    void testNombre() {
        usuario.establecerNombre("Franco");
        assertEquals("Franco", usuario.obtenerNombre());
    }

    @Test
    void testEdad() {
        usuario.establecerEdad(22);
        assertEquals(22, usuario.obtenerEdad());
    }

    @Test
    void testEdadNegativaLanzaExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            usuario.establecerEdad(-2);
        });
        assertEquals("La edad debe ser mayor que 0", exception.getMessage());
    }
}
