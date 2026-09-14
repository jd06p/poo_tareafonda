package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public class GestorFonda {

    List<Bebida> bebidas;
    public GestorFonda(Bebida bebida){
        bebidas = new ArrayList<>();
        bebidas.add(bebida);
    }

    public void registrar(Bebida bebida){
        bebidas.add(bebida);
    }

    public void buscarPorNombre(String nombre){
    }

    public void vender(String nombre, int unidades){
    }

    public void obtenerTodas(List<Bebida> lista){}
}
