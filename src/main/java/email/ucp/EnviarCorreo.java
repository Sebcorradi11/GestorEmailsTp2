package email.ucp;
public class EnviarCorreo {
    public static void enviar(Correo correo, Buzon buzonRemitente, Buzon buzonDestinatario) {
        if (correo == null || buzonRemitente == null || buzonDestinatario == null) {
            throw new IllegalArgumentException("Correo, buzonRemitente y buzonDestinatario no pueden ser nulos.");
        }

        if (!buzonRemitente.getBandejaEnviados().contains(correo)) {
            throw new IllegalArgumentException("El correo no está en la bandeja de enviados del buzonRemitente.");
        }

        buzonRemitente.eliminarDeEnviados(correo);
        buzonDestinatario.agregarAEntrada(correo);
    }
}