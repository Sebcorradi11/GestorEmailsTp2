import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import email.ucp.Contacto;
import email.ucp.Correo;



public class CorreoTest {

    @Test
    public void testCrearCorreo() {
        // Crear remitente y destinatarios
        Contacto remitente = new Contacto("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");
        Contacto destinatario1 = new Contacto("Luciano Aquino", "LucianoAquinopla@gmail.com");
        Contacto destinatario2 = new Contacto("Gonzalo Mata", "GonzaMataxd@gmail.com");

        // Crear una lista de destinatarios
        List<Contacto> destinatarios = new ArrayList<>();
        destinatarios.add(destinatario1);
        destinatarios.add(destinatario2);

        // Crear un correo
        Correo correoDePrueba = new Correo("Asunto del Correo", "Contenido del Correo", remitente, destinatarios);

        // Verificar que las propiedades del correo se asignaron correctamente
        assertEquals("Asunto del Correo", correoDePrueba.getAsunto());
        assertEquals("Contenido del Correo", correoDePrueba.getContenido());
        assertEquals(remitente, correoDePrueba.getRemitente());
        assertEquals(destinatarios, correoDePrueba.getDestinatarios());
    }
}