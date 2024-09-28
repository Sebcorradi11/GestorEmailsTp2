package email.ucp;

import java.util.List;

public interface Filtro {
    List<Correo> filtrar(List<Correo> correos);
}