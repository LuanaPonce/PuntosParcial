/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.aplicacion.modelo;

import java.io.Serializable;

/**
 *
 * @author sandra
 */
public class Numero implements Serializable {
    private int num;

    public Numero() {
    }
    

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }
}
