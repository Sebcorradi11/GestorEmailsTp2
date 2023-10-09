import static org.junit.Assert.*;

import org.junit.Test;

import email.ucp.Contacto;
import email.ucp.Correo;
import email.ucp.FiltroAsuntoRemitente;
import java.util.Arrays;
import java.util.List;

public class FiltroAsuntoRemitenteTest {
    
    @Test
    public void testFiltrarRemitente() {
        // Crear algunos correos para las pruebas
        Contacto remitente1 = new Contacto("Remitente 1", "remitente1@example.com");
        Contacto remitente2 = new Contacto("Remitente 2", "remitente2@example.com");
        Contacto remitente3 = new Contacto("Remitente 3", "remitente3@example.com");
        List<Contacto> destinatarios = Arrays.asList(
            new Contacto("Destinatario 1", "destinatario1@example.com"),
            new Contacto("Destinatario 2", "destinatario2@example.com")
        );

        Correo correo1 = new Correo("Asunto 1", "Contenido 1", remitente1, destinatarios);
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", remitente2, destinatarios);
        Correo correo3 = new Correo("Asunto 3", "Contenido 3", remitente3, destinatarios);

        // Crear un filtro de asunto y remitente
        FiltroAsuntoRemitente filtro = new FiltroAsuntoRemitente("Asunto 1", remitente1);

        // Filtrar los correos
        List<Correo> correosFiltrados = filtro.filtrar(Arrays.asList(correo1, correo2, correo3));

        // Verificar que solo se encuentre el correo1 en los resultados
        assertEquals(1, correosFiltrados.size());
        assertEquals(correo1, correosFiltrados.get(0));
    }
}