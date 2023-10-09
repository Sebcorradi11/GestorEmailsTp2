package email.ucp;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltroAsunto {
    private String nombre;
    private Predicate<Correo> criterio;

    public FiltroAsunto(String nombre, String asunto) {
        this.nombre = nombre;
        this.criterio = correo -> correo.getAsunto().contains(asunto);
    }
    public List<Correo> filtrar(List<Correo> correos){
        return correos.stream().filter(criterio).collect(Collectors.toList());
    }

    public String getNombre() {
        return nombre;
    }
}