package email.ucp;
import java.util.List;
import java.util.ArrayList;

public class EnviarCorreo {
    public static void enviar (Correo correo, Buzon buzonRemitente, List<Buzon> buzonesDestinatarios){
    buzonRemitente.agregarAEnviados(correo);
    for (Buzon buzonDestinatario : buzonesDestinatarios){
        buzonDestinatario.agregarAEntrada(correo);
    }
    }   
}
