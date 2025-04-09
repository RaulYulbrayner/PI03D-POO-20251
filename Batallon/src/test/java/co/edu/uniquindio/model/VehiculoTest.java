package co.edu.uniquindio.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {

    @Test
    public void determinarCantidadMisionesTest(){
        Vehiculo vihiculo = new VehiculoTransporteTropa("1", "2002", 2001, 12000, EstadoOperativo.DISPONIBLE, 60);
        assertEquals(60, vihiculo.getMisionesCompletadas());
    }

    @Test
    public void imcrementarKilometrajeNegativoTest(){
        Vehiculo vihiculo1 = new VehiculoTransporteTropa("1", "2002", 2001, 12000, EstadoOperativo.DISPONIBLE, 60);
        assertThrows(IllegalArgumentException.class, () -> vihiculo1.incrementarKilometraje(10));
    }

}