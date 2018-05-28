/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.aplicacion.modelo.datos;

import java.util.ArrayList;
import punto1.aplicacion.modelo.dominio.Televisor;

/**
 *
 * @author sandra
 */
public class ListaTelevisor {
    private ArrayList<Televisor>lista;

    public ListaTelevisor() {
        lista=new ArrayList();
    }

    public ListaTelevisor(ArrayList<Televisor> lista) {
        this.lista = lista;
    }
    
    public void agregarTelevisor(Televisor unTelevisor){
        getLista().add(unTelevisor);
    }

    /**
     * @return the lista
     */
    public ArrayList<Televisor> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Televisor> lista) {
        this.lista = lista;
    }
    
    
}
