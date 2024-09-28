package email.ucp;


import java.util.List;

public class EnviarCorreo {
    public static void enviar(Correo correo, Buzon buzonRemitente, List<Buzon> buzonesDestinatarios) {
        if (correo == null || buzonRemitente == null || buzonesDestinatarios == null) {
            throw new IllegalArgumentException("El correo, buzonRemitente y buzonesDestinatarios no pueden ser nulos.");
        }

        // Agregar el correo a la bandeja de enviados del remitente
        buzonRemitente.agregarAEnviados(correo);

        // Agregar el correo a la bandeja de entrada de cada destinatario
        for (Buzon buzon : buzonesDestinatarios) {
            buzon.agregarAEntrada(correo);
        }
    }
}
