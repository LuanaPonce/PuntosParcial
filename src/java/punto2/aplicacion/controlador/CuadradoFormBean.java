/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.aplicacion.controlador;

import punto2.aplicacion.modelo.datos.ListaCuadrado;
import punto2.aplicacion.modelo.dominio.Cuadrado;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author sandra
 */
@ManagedBean
@ViewScoped
public class CuadradoFormBean implements Serializable {
    private Cuadrado cuadrado;
    private ListaCuadrado listaCuadrado;
    private double a;
    private double per;
    private double sup;

    public CuadradoFormBean() {
        listaCuadrado=new ListaCuadrado();
        cuadrado=new Cuadrado();
    }
    
    public void ingresarC(){
        per=a*4;
        sup=Math.pow(a, 2);
        
        cuadrado.setA(a);
        cuadrado.setPer(per);
        cuadrado.setSup(sup);
        getListaCuadrado().Agregar(cuadrado);
        cuadrado=new Cuadrado(getA(),getPer(),getSup());
    }
    
    
   

    /**
     * @return the unCuadrado
     */
   

    /**
     * @return the listaCuadrado
     */
    public ListaCuadrado getListaCuadrado() {
        return listaCuadrado;
    }

    /**
     * @param listaCuadrado the listaCuadrado to set
     */
    public void setListaCuadrado(ListaCuadrado listaCuadrado) {
        this.listaCuadrado = listaCuadrado;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the cuadrado
     */
    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    /**
     * @param cuadrado the cuadrado to set
     */
    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }

    /**
     * @return the per
     */
    public double getPer() {
        return per;
    }

    /**
     * @param per the per to set
     */
    public void setPer(double per) {
        this.per = per;
    }

    /**
     * @return the sup
     */
    public double getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(double sup) {
        this.sup = sup;
    }
    
}
