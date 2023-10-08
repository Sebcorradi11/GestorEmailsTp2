package email.ucp;

public class Contacto {
    public Contacto(String name, String mail) {
        super();
        setNombre(name);
        setMail(mail);
    }

    String name;
    String mail;

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
    //                FIN DE ENCAPSULAMIENTO             //
}
