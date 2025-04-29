package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    @Test
    public void testCostoBusConBano() {
        Vehiculo bus = new Bus("BUS123", "Volvo", 40, 2, true);
        assertEquals(400.0, bus.calcularCosto(), 0.001);
    }
}