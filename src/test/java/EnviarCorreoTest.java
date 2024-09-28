import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import email.ucp.Buzon;
import email.ucp.Contacto;
import email.ucp.Correo;
import email.ucp.EnviarCorreo;

public class EnviarCorreoTest {

    @Test
    public void testEnviarCorreo() {
        // Crear buzones de remitente y destinatario
        Buzon buzonRemitente = new Buzon();
        Buzon buzonDestinatario = new Buzon();

        // Crear un remitente y un destinatario
        Contacto remitente = new Contacto("Sebastiano Corradi", "sebasitanocorradi57@gmail.com");
        Contacto destinatario = new Contacto("Luciano Aquino", "lucianoaquinopla@gmail.com");

        // Crear una lista de destinatarios
        List<Contacto> destinatarios = new ArrayList<>();
        destinatarios.add(destinatario);

        // Crear el correo
        Correo correo = new Correo("Asunto del Correo", "Contenido del Correo", remitente, destinatarios);

        // Enviar el correo
        List<Buzon> buzonesDestinatarios = new ArrayList<>();
        buzonesDestinatarios.add(buzonDestinatario);
        EnviarCorreo.enviar(correo, buzonRemitente, buzonesDestinatarios);

        // Verificar que el correo fue enviado al buzón del destinatario
        assertTrue(buzonDestinatario.getBandejaEntrada().contains(correo));

        // Verificar que el correo está en la bandeja de enviados del remitente
        assertTrue(buzonRemitente.getBandejaEnviados().contains(correo));
    }
}
