package email.ucp;

import java.util.ArrayList;
import java.util.List;

public class Correo {
    private String asunto;
    private String contenido;
    private Contacto remitente;
    private List<Contacto> destinatarios;



    public Correo (String asunto, String contenido, Contacto remitente, List<Contacto> destinatarios){
    this.asunto = asunto;
    this.contenido = contenido;
    this.remitente = remitente;
    this.destinatarios = destinatarios;
   } 
   public String getAsunto() {
    return asunto;
   }
    public String getContenido() {
    return asunto;
   }
   
    public String getRemitente() {
    return asunto;
   }
   public List<Contacto> getDestinatarios(){
    return destinatarios;
   }
   

}
