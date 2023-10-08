import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import email.ucp.Contacto;
import email.ucp.Correo;
import email.ucp.FiltroAsuntoRemitente;

public class ContactoTest{
    @Test
    public void testCrearContacto(){
        Contacto contacto = new Contacto ("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");

        assertEquals("Sebastiano Corradi", contacto.getNombre());
        assertEquals("Sebastianocorradi57@gmail.com", contacto.getMail());

    }
    
}
