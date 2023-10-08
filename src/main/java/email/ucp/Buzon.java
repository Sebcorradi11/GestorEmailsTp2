package email.ucp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Buzon {
    private List <Correo> bandejaEntrada;
    private List <Correo> bandejaEnviados;

    public Buzon (){
        bandejaEntrada = new ArrayList<>();
        bandejaEnviados = new ArrayList<>();
    }
    public void agregarAEntrada(Correo correo){
        bandejaEntrada.add(correo);
    }
    public void agregarAEnviados(Correo correo){
        bandejaEnviados.add(correo);
    }
    public List<Correo> getBandejaEntrada(){
        return bandejaEntrada;
    }
    public List<Correo> getBandejaEnviados(){
        return bandejaEnviados;
    }
}