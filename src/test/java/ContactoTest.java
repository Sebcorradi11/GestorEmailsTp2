import static org.junit.Assert.assertEquals;
import org.junit.Test;

import email.ucp.Buzon;
import email.ucp.Contacto;


public class ContactoTest {

    @Test
    public void testCrearContacto() {
        // Crea un contacto
        Contacto contactoDePrueba = new Contacto("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");
        
        // Verifica si el contacto se creó correctamente
        assertEquals("Sebastiano Corradi", contactoDePrueba.getNombre());
        assertEquals("Sebastianocorradi57@gmail.com", contactoDePrueba.getMail());
    }

    @Test
    public void testAsignarBuzon() {
        // Crea un contacto
        Contacto contactoDePrueba = new Contacto("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");
        
        // Crea un buzón
        Buzon buzonDePrueba = new Buzon();
        
        // Asigna un buzón al contacto
        contactoDePrueba.setBuzon(buzonDePrueba);
        
        // Verifica si el buzón fue asignado correctamente al contacto
        assertEquals(buzonDePrueba, contactoDePrueba.getBuzon());
    }
}