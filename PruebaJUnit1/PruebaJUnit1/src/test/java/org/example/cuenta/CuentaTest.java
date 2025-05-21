package org.example.cuenta;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    Cuenta cuenta;

   @BeforeEach
    void initMetodoTest(){
     this.cuenta = new Cuenta("Pepe", 10000);

    }

    @AfterEach
    void tearDown(){
        System.out.println("Finalizando el método");

    }


    @Test
    @DisplayName("probando el nombre")
    void testNombreCuenta(){


        String esperado = "Pepe";

        String real = cuenta.getPersona();

        Assertions.assertEquals(esperado,real);

        Assertions.assertTrue(real.equals("Pepe"));



    }


    @Test
    @DisplayName("Probando el saldo")
    void testSaldo() {

        Cuenta cuenta = new Cuenta(null, 10000);

       assertNotNull(cuenta.getSaldo());

      assertEquals(10000, cuenta.getSaldo());

      assertFalse(cuenta.getSaldo() < 0);

      assertTrue(cuenta.getSaldo() > 0);




    }
}