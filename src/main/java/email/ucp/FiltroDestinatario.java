package email.ucp;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroDestinatario implements Filtro {
    private Contacto destinatario;

    public FiltroDestinatario(Contacto destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public List<Correo> filtrar(List<Correo> correos) {
        return correos.stream()
            .filter(correo -> correo.getDestinatarios().contains(destinatario))
            .collect(Collectors.toList());
    }
}