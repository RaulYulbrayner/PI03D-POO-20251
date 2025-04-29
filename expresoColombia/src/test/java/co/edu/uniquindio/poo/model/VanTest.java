package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VanTest {

    @Test
    public void testCostoVanSinEntretenimiento() {
        Vehiculo van = new Van("VAN123", "Mercedes", 12, false, TipoTraccion.TRACCION_4X2);
        assertEquals(250.0, van.calcularCosto(), 0.001);
    }

}