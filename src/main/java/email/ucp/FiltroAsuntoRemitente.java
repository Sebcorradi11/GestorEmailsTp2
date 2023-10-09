package email.ucp;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class FiltroAsuntoRemitente {
    private String nombre;
    private Predicate<Correo> criterio;
    
    public FiltroAsuntoRemitente(String nombre, String asunto, String remitente) {
        this.nombre = nombre;
        this.criterio=correo ->
            correo.getAsunto().contains(asunto) && correo.getRemitente().getNombre().contains(remitente);

    }
    public List<Correo> filtrar(List<Correo> correos) {
        return correos.stream().filter(criterio).collect(Collectors.toList());
    }
    public String getNombre() {
        return nombre;
    }
}