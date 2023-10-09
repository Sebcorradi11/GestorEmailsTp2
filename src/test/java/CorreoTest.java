import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import email.ucp.Contacto;
import email.ucp.Correo;



public class CorreoTest {
    @Test
    public void TestCrearCorreo(){
        Contacto remitente = new Contacto ("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");
        Contacto destinatario1 = new Contacto ("Luciano Aquino", "LucianoAquinopla@gmail.com");
        Contacto destinatario2 = new Contacto ("Gonzalo Mata", "GonzaMataxd@gmail.com");

        //Crear una lista de destinatarios
        List<Contacto> destinatarios = new ArrayList<>();
        destinatarios.add(destinatario1);
        destinatarios.add(destinatario2);
        //Crea un correo
        Correo correo = new Correo("Asunto del Correo", "Contenido del Correo", remitente, destinatarios );

        assertEquals("Asunto del Correo", correo.getAsunto());
        assertEquals("Contenido del Correo", correo.getContenido());
        assertEquals(remitente, correo.getRemitente());
        assertEquals(destinatarios,correo.getDestinatarios());
    }
    }

    