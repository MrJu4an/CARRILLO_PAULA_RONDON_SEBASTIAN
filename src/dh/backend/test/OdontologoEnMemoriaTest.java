package dh.backend.test;

import dh.backend.dao.impl.OdontologoDaoH2;
import dh.backend.dao.impl.OdontologoEnMemoria;
import dh.backend.model.Odontologo;
import dh.backend.service.OdontologoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoEnMemoriaTest {
    private static OdontologoService odontologoService = new OdontologoService(new OdontologoEnMemoria());

    @Test
    @DisplayName("Buscar Odontologos")
    void buscarOdontologos() {
        Odontologo odontologo = new Odontologo("MRJ1234", "Sebastian", "Rondon");
        odontologoService.registrarOdontologo(odontologo);

        Odontologo odontologo2 = new Odontologo("JR1234", "PAULA", "CARRILLO");
        odontologoService.registrarOdontologo(odontologo2);

        List<Odontologo> odontologosEncontrados = odontologoService.buscarTodos();

        assertNotNull(odontologosEncontrados);
    }
}