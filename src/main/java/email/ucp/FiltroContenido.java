package email.ucp;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroContenido implements Filtro {
    private String contenido;

    public FiltroContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public List<Correo> filtrar(List<Correo> correos) {
        return correos.stream()
            .filter(correo -> correo.getContenido().contains(contenido))
            .collect(Collectors.toList());
    }
}