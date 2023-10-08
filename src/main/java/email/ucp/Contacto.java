package email.ucp;

public class Contacto {
    public Contacto(String name, String mail) {
        super();
        setNombre(name);
        setMail(mail);
    }

    String name;
    String mail;
    private Buzon buzon;

    //                  ENCAPSULACION                        //
    public void setNombre(String name) {
        this.name = name;
    }

    public String getNombre() {
        return name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    public Buzon getBuzon() {
        return buzon;
    }
    public void setBuzon (Buzon buzon){
        this.buzon = buzon;
    }
    //                FIN DE ENCAPSULAMIENTO             //
}
