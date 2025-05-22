package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BancoTest {
    static Banco banco;

    @BeforeAll
    static void iniciarBanco() {
        banco = new Banco();
        banco.agregarCuenta("123", 1000.0);
        System.out.println("Inicio de las pruebas del Banco");
    }

    @AfterAll
    static void finalizarBanco() {
        System.out.println("Fin de las pruebas del Banco");
    }

    @Test
    void testAgregarCuentaYConsultarSaldo() {
        banco.agregarCuenta("444", 550.0);
        assertEquals(550.0, banco.consultarSaldo("444"));
    }

    @Test
    void testConsultarSaldoCuentaInexistente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            banco.consultarSaldo("676");
        });
        assertEquals("La cuenta no existe", exception.getMessage());
    }

    @Test
    void testDepositoCorrecto() {
        banco.agregarCuenta("123", 200.0);
        assertEquals(1200.0, banco.consultarSaldo("123"));
    }

    @Test
    void testDepositoNegativoLanzaExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            banco.depositar("123", -100);
        });
        assertEquals("El monto no puede ser negativo", exception.getMessage());
    }

    @Test
    void testRetiroCorrecto() {
        banco.retirar("123", 300.0);
        assertEquals(900.0, banco.consultarSaldo("123"));
    }

    @Test
    void testRetiroMontoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("123", -50.0);
        });
        assertEquals("El monto no puede ser negativo", exception.getMessage());
    }

    @Test
    void testRetiroSaldoInsuficiente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("123", 90000.0);
        });
        assertEquals("Saldo insuficiente", exception.getMessage());
    }
}
