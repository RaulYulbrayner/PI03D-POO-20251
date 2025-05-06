package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    public void testVehiculosReservadosParaArmeniaPereira() {
        Empresa empresa = new Empresa("ExpresoColombia");

        Vehiculo bus = new Bus("ABC001", "Volvo", 40, 2, true);
        Vehiculo van = new Van("DEF002", "Mercedes", 12, true, TipoTraccion.TRACCION_4X4);

        empresa.registrarVehiculo(bus);
        empresa.registrarVehiculo(van);

        Conductor conductor = new Conductor("Luis", "123", "C1", 10);
        empresa.registrarConductor(conductor);

        Ruta ruta1 = new Ruta("Armenia", "Pereira", 1, 45);
        Ruta ruta2 = new Ruta("Bogotá", "Cali", 8, 400);
        empresa.registrarRuta(ruta1);
        empresa.registrarRuta(ruta2);

        List<Pasajero> pasajeros = List.of(new Pasajero("Ana", "111", true));

        empresa.registrarReserva(new Reserva(1, bus, conductor, ruta1, pasajeros));
        empresa.registrarReserva(new Reserva(2, van, conductor, ruta2, pasajeros));

        List<Vehiculo> resultado = empresa.obtenerVehiculosPorRuta("Armenia", "Pereira");

        assertEquals(1, resultado.size());
        assertEquals("ABC001", resultado.get(0).getPlaca());
    }

}