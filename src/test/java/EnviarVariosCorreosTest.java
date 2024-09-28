import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import email.ucp.Buzon;
import email.ucp.Contacto;
import email.ucp.Correo;
import email.ucp.EnviarCorreo;

public class EnviarVariosCorreosTest {

    @Test
    public void testEnviar100Correos() {
        // Crear buzones de remitente y destinatario
        Buzon buzonRemitente = new Buzon();
        Buzon buzonDestinatario = new Buzon();

        // Crear un remitente y un destinatario
        Contacto remitente = new Contacto("Sebastiano Corradi", "sebasitanocorradi57@gmail.com");
        Contacto destinatario = new Contacto("Luciano Aquino", "lucianoaquinopla@gmail.com");

        // Crear una lista de destinatarios
        List<Contacto> destinatarios = new ArrayList<>();
        destinatarios.add(destinatario);

        // Crear una lista de buzones para los destinatarios
        List<Buzon> buzonesDestinatarios = new ArrayList<>();
        buzonesDestinatarios.add(buzonDestinatario);

        // Enviar 100 correos
        for (int i = 1; i <= 100; i++) {
            // Crear un nuevo correo
            Correo correo = new Correo("Asunto del Correo " + i, "Contenido del Correo " + i, remitente, destinatarios);

            // Enviar el correo
            EnviarCorreo.enviar(correo, buzonRemitente, buzonesDestinatarios);

            // Verificar que el correo fue enviado al buzón del destinatario
            assertTrue(buzonDestinatario.getBandejaEntrada().contains(correo));

            // Verificar que el correo está en la bandeja de enviados del remitente
            assertTrue(buzonRemitente.getBandejaEnviados().contains(correo));
        }

        // Verificar que se han enviado 100 correos
        assertEquals(100, buzonDestinatario.getBandejaEntrada().size());
        assertEquals(100, buzonRemitente.getBandejaEnviados().size());
    }
}
