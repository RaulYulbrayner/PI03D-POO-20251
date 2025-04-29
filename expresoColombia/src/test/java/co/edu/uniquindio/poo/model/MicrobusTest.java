package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MicrobusTest {

    @Test
    public void testCostoMicrobusElectrico() {
        Vehiculo microbus = new Microbus("MIC123", "Hyundai", 20, TipoEnergia.ELECTRICO);
        assertEquals(230.0, microbus.calcularCosto(), 0.001);
    }
}