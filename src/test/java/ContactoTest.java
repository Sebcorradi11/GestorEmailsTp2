import static org.junit.Assert.*;
import org.junit.Test;
import email.ucp.Buzon;
import email.ucp.Contacto;


public class ContactoTest{
    @Test
    public void testCrearContacto(){
        //Crea un contacto
        Contacto contacto = new Contacto ("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");
        //Verifica si el contacto se creo
        assertEquals("Sebastiano Corradi", contacto.getNombre());
        assertEquals("Sebastianocorradi57@gmail.com", contacto.getMail());

    }
    @Test
    public void testAsignarBuzon() {
        //Crea un contacto
        Contacto contacto = new Contacto ("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");
        //Crea un buzon
        Buzon buzon = new Buzon();
        //Le asigna un buzon al contacto
        contacto.setBuzon(buzon);
        //Verifica si el buzon fue asignado al contacto
        assertEquals(buzon, contacto.getBuzon());
        
    }
    
}
