package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiasLluviaTest {

    // ------------ PRUEBAS ------------

    @Test
    void registrarUnDia() {
        DiasLluvia d1 = new DiasLluvia();
        boolean registrado = d1.registroDia(5, 7, true);
        assertTrue(registrado);
    }

    @Test
    void registrarUnDia2() {
        DiasLluvia d1 = new DiasLluvia();
        boolean registrado = d1.registroDia(11, 1, true);
        assertTrue(registrado);
    }

    @Test
    void registrarUnDia3() {
        DiasLluvia d1 = new DiasLluvia();
        boolean registrado = d1.registroDia(9, 1, true);
        assertNotEquals(false, registrado);
    }

    //-------------------------------------------------------------------------------------
    @Test
    void consultarUnDia() {
        DiasLluvia d1 = new DiasLluvia();
        d1.registroDia(8, 7, true);
        assertTrue(d1.consultarDia(8, 7));
    }

    @Test
    void consultarUnDia2() {
        DiasLluvia d1 = new DiasLluvia();
        d1.registroDia(23, 11, true);
        assertTrue(d1.consultarDia(23, 11));
    }

    @Test
    void consultarUnDia3() {
        DiasLluvia d1 = new DiasLluvia();
        d1.registroDia(29, 1, true);
        assertNotEquals(false, d1.consultarDia(29, 1));
    }

    //-------------------------------------------------------------------------------------
    @Test
    void contarDiasLluviosos() {
        DiasLluvia d1 = new DiasLluvia();
        DiasLluvia d2 = new DiasLluvia();

        d1.registroDia(27, 1, true);
        d1.registroDia(25, 2, true);
        d2.registroDia(10, 3, true);
        d2.registroDia(15, 4, true);

        assertEquals(2, d1.contarDiasLluviosos());
        assertEquals(2, d2.contarDiasLluviosos());
    }


    @Test
    void contarDiasLluviosos2() {
        DiasLluvia d1 = new DiasLluvia();
        DiasLluvia d2 = new DiasLluvia();

        d1.registroDia(1, 3, true);
        d1.registroDia(5, 4, false);
        d2.registroDia(20, 6, true);
        d2.registroDia(10, 7, true);

        assertEquals(1, d1.contarDiasLluviosos());
        assertEquals(2, d2.contarDiasLluviosos());
    }

    @Test
    void contarDiasLluviosos3() {
        DiasLluvia d1 = new DiasLluvia();
        DiasLluvia d2 = new DiasLluvia();

        d1.registroDia(3, 2, true);
        d1.registroDia(8, 5, false);
        d2.registroDia(15, 7, true);
        d2.registroDia(20, 8, true);

        assertNotEquals(3, d1.contarDiasLluviosos());
        assertNotEquals(9, d2.contarDiasLluviosos());
    }

    //-------------------------------------------------------------------------------------
    @Test
    void testTrimestreLluvioso() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(10, 1, true);

        d.registroDia(5, 7, true);
        d.registroDia(10, 8, true);

        assertEquals(3, d.trimestreLluvioso());
    }


    @Test
    void testTrimestreLluvioso2() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(3, 1, true);
        d.registroDia(15, 2, true);

        d.registroDia(20, 8, true);

        assertEquals(1, d.trimestreLluvioso());
    }


    @Test
    void testTrimestreLluvioso3() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(3, 1, true);

        d.registroDia(15, 7, true);
        d.registroDia(20, 8, true);

        assertNotEquals(1, d.trimestreLluvioso());
    }


//-------------------------------------------------------------------------------------

    @Test
    void testPrimerDiaLluvia() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(4, 1, true);

        d.registroDia(15, 1, true);

        assertEquals(4, d.primerDiaLluvia());
    }

    @Test
    void testPrimerDiaLluvia2() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(3, 1, true);

        d.registroDia(15, 2, true);

        assertEquals(3, d.primerDiaLluvia());
    }

    @Test
    void testPrimerDiaLluvia3() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(3, 1, true);

        d.registroDia(15, 2, true);

        assertNotEquals(1, d.primerDiaLluvia());
    }
}