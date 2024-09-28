import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import email.ucp.Contacto;
import email.ucp.Correo;
import email.ucp.FiltroAsunto;

public class FiltroAsuntoTest {

    @Test
    public void testFiltrarPorAsunto() {
        // Configura una lista de correos para las pruebas
        List<Correo> correos = new ArrayList<>();
        correos.add(new Correo("Asunto1", "Contenido1", new Contacto("Remitente1", "remitente1@example.com"), null));
        correos.add(new Correo("Asunto2", "Contenido2", new Contacto("Remitente2", "remitente2@example.com"), null));
        correos.add(new Correo("OtroAsunto", "OtroContenido", new Contacto("Remitente3", "remitente3@example.com"), null));

        // Crea un filtro de asunto "Asunto1"
        FiltroAsunto filtroDePrueba = new FiltroAsunto("Asunto1");

        // Filtra los correos
        List<Correo> correosFiltradosDePrueba = filtroDePrueba.filtrar(correos);

        // Verifica que solo se obtengan los correos con el asunto "Asunto1"
        assertEquals(1, correosFiltradosDePrueba.size());
        assertEquals("Asunto1", correosFiltradosDePrueba.get(0).getAsunto());

        // Verifica que los correos que no cumplen el filtro no estén presentes
        assertFalse(correosFiltradosDePrueba.stream()
            .anyMatch(correo -> correo.getAsunto().equals("Asunto2") || correo.getAsunto().equals("OtroAsunto")));
    }
}