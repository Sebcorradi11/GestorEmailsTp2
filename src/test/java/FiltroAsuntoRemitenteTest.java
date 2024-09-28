import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import email.ucp.Contacto;
import email.ucp.Correo;
import email.ucp.FiltroAsuntoRemitente;

public class FiltroAsuntoRemitenteTest {

    @Test
    public void testFiltrarRemitente() {
        // Crear remitentes y destinatarios
        Contacto remitente1 = new Contacto("Remitente 1", "remitente1@example.com");
        Contacto remitente2 = new Contacto("Remitente 2", "remitente2@example.com");
        Contacto remitente3 = new Contacto("Remitente 3", "remitente3@example.com");
        List<Contacto> destinatarios = Arrays.asList(
            new Contacto("Destinatario 1", "destinatario1@example.com"),
            new Contacto("Destinatario 2", "destinatario2@example.com")
        );

        // Crear correos de prueba
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", remitente1, destinatarios);
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", remitente2, destinatarios);
        Correo correo3 = new Correo("Asunto 3", "Contenido 3", remitente3, destinatarios);

        // Crear un filtro por asunto y remitente
        FiltroAsuntoRemitente filtroDePrueba = new FiltroAsuntoRemitente("Asunto 1", remitente1);

        // Filtrar los correos
        List<Correo> correosFiltradosDePrueba = filtroDePrueba.filtrar(Arrays.asList(correo1, correo2, correo3));

        // Verificar que solo se haya filtrado el correo1
        assertEquals(1, correosFiltradosDePrueba.size());
        assertEquals(correo1, correosFiltradosDePrueba.get(0));

        // Verificar que los correos que no cumplen con el filtro no están en los resultados
        assertFalse(correosFiltradosDePrueba.contains(correo2));
        assertFalse(correosFiltradosDePrueba.contains(correo3));
    }
}