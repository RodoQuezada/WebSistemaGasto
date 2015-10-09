/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.modell;

import java.util.ArrayList;

/**
 *
 * @author rodo
 */
public class Registro {
    private ArrayList<Gasto> lstGasto = new ArrayList(); 

    public Registro() {
    }

    public ArrayList<Gasto> getLstGasto() {
        return lstGasto;
    }

    public void setLstGasto(ArrayList<Gasto> lstGasto) {
        this.lstGasto = lstGasto;
    }
    
    
    
    
}
