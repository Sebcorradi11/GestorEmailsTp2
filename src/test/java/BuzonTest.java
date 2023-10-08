import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import email.ucp.Buzon;
import email.ucp.Contacto;
import email.ucp.Correo;
import email.ucp.FiltroAsuntoRemitente;


public class BuzonTest {
    @Test
    public void testAgregarCorreoAEntrada(){
        Buzon buzon = new Buzon();
            Contacto remitente = new Contacto ("Sebastiano Corradi", "Sebasitanocorradi57@gmail.com");
            Correo correo = new Correo ("Asunto del Correo", "Contenido del Correo",remitente, null);

            buzon.agregarAEntrada(correo);
            
            assertTrue(buzon.getBandejaEntrada().contains(correo));
        }

    @Test
       public void testAgregarCorreoAEnviados(){
        Buzon buzon = new Buzon();
            Contacto remitente = new Contacto ("Sebastiano Corradi", "Sebasitanocorradi57@gmail.com");
            Correo correo = new Correo ("Asunto del Correo", "Contenido del Correo",remitente, null);

            buzon.agregarAEnviados(correo);
            
            assertTrue(buzon.getBandejaEnviados().contains(correo));
        }

    }  
    


