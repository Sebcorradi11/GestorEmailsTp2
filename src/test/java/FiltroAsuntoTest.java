import static org.junit.Assert.*;

import org.junit.Test;
import email.ucp.FiltroAsunto;
import email.ucp.Correo;
import java.util.ArrayList;
import java.util.List;
import email.ucp.Contacto;

public class FiltroAsuntoTest {
    @Test
    public void testFiltrarPorAsunto() {
        // Configura una lista de correos para las pruebas
        List<Correo> correos = new ArrayList<>();
        correos.add(new Correo("Asunto1", "Contenido1", new Contacto("Remitente1", "remitente1@example.com"), null));
        correos.add(new Correo("Asunto2", "Contenido2", new Contacto("Remitente2", "remitente2@example.com"), null));
        correos.add(new Correo("OtroAsunto", "OtroContenido", new Contacto("Remitente3", "remitente3@example.com"), null));

        // Crea un filtro de asunto "Asunto1"
        FiltroAsunto filtro = new FiltroAsunto("Asunto1");

        // Filtra los correos
        List<Correo> correosFiltrados = filtro.filtrar(correos);

        // Verifica que solo se obtengan los correos con el asunto "Asunto1"
        assertEquals(1, correosFiltrados.size());
        assertEquals("Asunto1", correosFiltrados.get(0).getAsunto());
    }
}