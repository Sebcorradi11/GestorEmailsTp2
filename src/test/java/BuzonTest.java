import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import email.ucp.Buzon;
import email.ucp.Contacto;
import email.ucp.Correo;



public class BuzonTest {

    @Test
    public void testAgregarCorreoAEntrada() {
        Buzon buzon = new Buzon();
        Contacto remitente = new Contacto("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");
        Correo correoDePrueba = new Correo("Asunto del Correo", "Contenido del Correo", remitente, null);

        // Verifica que la bandeja de entrada esté vacía antes de agregar
        assertTrue(buzon.getBandejaEntrada().isEmpty());

        // Agrega un correo a la bandeja de entrada
        buzon.agregarAEntrada(correoDePrueba);

        // Verifica que el correo se haya agregado correctamente
        assertTrue(buzon.getBandejaEntrada().contains(correoDePrueba));
    }

    @Test
    public void testAgregarCorreoAEnviados() {
        Buzon buzon = new Buzon();
        Contacto remitente = new Contacto("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");
        Correo correoDePrueba = new Correo("Asunto del Correo", "Contenido del Correo", remitente, null);

        // Verifica que la bandeja de enviados esté vacía antes de agregar
        assertTrue(buzon.getBandejaEnviados().isEmpty());

        // Agrega un correo a la bandeja de enviados
        buzon.agregarAEnviados(correoDePrueba);

        // Verifica que el correo se haya agregado correctamente
        assertTrue(buzon.getBandejaEnviados().contains(correoDePrueba));
    }

    @Test
    public void testEliminarCorreoDeEntrada() {
        Buzon buzon = new Buzon();
        Contacto remitente = new Contacto("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");
        Correo correoDePrueba = new Correo("Asunto del Correo", "Contenido del Correo", remitente, null);

        // Agrega y luego elimina un correo de la bandeja de entrada
        buzon.agregarAEntrada(correoDePrueba);
        buzon.eliminarDeEntrada(correoDePrueba);

        // Verifica que el correo haya sido eliminado de la bandeja de entrada
        assertFalse(buzon.getBandejaEntrada().contains(correoDePrueba));
    }

    @Test
    public void testEliminarCorreoDeEnviados() {
        Buzon buzon = new Buzon();
        Contacto remitente = new Contacto("Sebastiano Corradi", "Sebastianocorradi57@gmail.com");
        Correo correoDePrueba = new Correo("Asunto del Correo", "Contenido del Correo", remitente, null);

        // Agrega y luego elimina un correo de la bandeja de enviados
        buzon.agregarAEnviados(correoDePrueba);
        buzon.eliminarDeEnviados(correoDePrueba);

        // Verifica que el correo haya sido eliminado de la bandeja de enviados
        assertFalse(buzon.getBandejaEnviados().contains(correoDePrueba));
    }
}

    
