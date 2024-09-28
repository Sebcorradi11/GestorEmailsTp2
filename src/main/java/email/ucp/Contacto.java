package email.ucp;

public class Contacto {
    private String nombre;
    private String mail;
    private Buzon buzon;

    public Contacto(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
    }

    // Métodos de encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Buzon getBuzon() {
        return buzon;
    }

    public void setBuzon(Buzon buzon) {
        this.buzon = buzon;
    }
}
