package email.ucp;


public class EnviarCorreo {
    public static void enviar(Correo correo, Buzon buzonRemitente, Buzon buzonDestinatario) {
        if (correo == null || buzonRemitente == null || buzonDestinatario == null) {
            throw new IllegalArgumentException("Correo, buzonRemitente y buzonDestinatario no pueden ser nulos.");
        }

        // Verificar que el correo esté en la bandeja de enviados del remitente
        if (!buzonRemitente.getBandejaEnviados().contains(correo)) {
            throw new IllegalArgumentException("El correo no está en la bandeja de enviados del buzonRemitente.");
        }

        // Agregar el correo a la bandeja de entrada del destinatario
        buzonDestinatario.agregarAEntrada(correo);

        // Eliminar el correo de la bandeja de enviados del remitente
        buzonRemitente.eliminarDeEnviados(correo);
    }
}