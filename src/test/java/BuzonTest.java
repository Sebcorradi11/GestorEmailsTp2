import static org.junit.Assert.*;
import org.junit.Test;
import email.ucp.Buzon;
import email.ucp.Contacto;
import email.ucp.Correo;



public class BuzonTest {
    @Test
    public void testAgregarCorreoAEntrada(){
        Buzon buzon = new Buzon();
            Contacto remitente = new Contacto ("Sebastiano Corradi", "Sebasitanocorradi57@gmail.com");
            Correo correo = new Correo ("Asunto del Correo", "Contenido del Correo",remitente, null);
            // Agrega un correo al buzon de entrada
            buzon.agregarAEntrada(correo);
            //Verifica si esta el correo en el buzon de entrada
            assertTrue(buzon.getBandejaEntrada().contains(correo));
        }

    @Test
       public void testAgregarCorreoAEnviados(){
        Buzon buzon = new Buzon();
            Contacto remitente = new Contacto ("Sebastiano Corradi", "Sebasitanocorradi57@gmail.com");
            Correo correo = new Correo ("Asunto del Correo", "Contenido del Correo",remitente, null);
            //Agrega un correo al buzon de enviados
            buzon.agregarAEnviados(correo);
            //Verifica si el correo se encuentra en el buzon de enviados
            assertTrue(buzon.getBandejaEnviados().contains(correo));
        }

    
    @Test
    public void testEliminarCorreoDeEntrada(){
        Buzon buzon = new Buzon ();
        Contacto remitente = new Contacto ("Sebastiano Corradi", "Sebasitanocorradi57@gmail.com");
        Correo correo = new Correo ("Asunto del Correo", "Contenido del Correo",remitente, null);
        // Agrega y elimina un correo e la bandeja de entrada
        buzon.agregarAEntrada(correo);
        buzon.eliminarDeEntrada(correo);
        // Verifica que se haya eliminado el correo en la bandeja de entrada
        assertFalse(buzon.getBandejaEntrada().contains(correo));
    }

 @Test
    public void testEliminarCorreoDeEnviados(){
        Buzon buzon = new Buzon ();
        Contacto remitente = new Contacto ("Sebastiano Corradi", "Sebasitanocorradi57@gmail.com");
        Correo correo = new Correo ("Asunto del Correo", "Contenido del Correo",remitente, null);
        
        // Agrega y elimina un correo en la bandeja de enviados
        buzon.agregarAEnviados(correo);
        buzon.eliminarDeEnviados(correo);
        //Verifica que  el correo ya no esta en la bandeja de enviados
        assertFalse(buzon.getBandejaEnviados().contains(correo));
    }
}

    

    
