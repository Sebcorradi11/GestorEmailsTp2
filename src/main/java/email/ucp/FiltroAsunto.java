package email.ucp;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroAsunto {
    private String asunto;

    public FiltroAsunto(String asunto) {
        this.asunto = asunto;
    }

    public List<Correo> filtrar(List<Correo> correos) {
        return correos.stream()
            .filter(correo -> correo.getAsunto().contains(asunto))
            .collect(Collectors.toList());
    }
}