/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author sandra
 */
public class Televisor implements Serializable {
    private int codigo;
    private String tipo;
    private String marca;
    private double precio;
    private Date feching;
    private int stock;

    public Televisor() {
    }

    public Televisor(int codigo, String tipo, String marca, double precio, Date feching, int stock) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
        this.feching = feching;
        this.stock = stock;
    }

   
    
    

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the feching
     */
    public Date getFeching() {
        return feching;
    }

    /**
     * @param feching the feching to set
     */
    public void setFeching(Date feching) {
        this.feching = feching;
    }
    
}
