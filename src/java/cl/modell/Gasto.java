/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.modell;

/**
 *
 * @author rodo
 */
public class Gasto {
    private String Cuenta;
    private String FechaPago;
    private String MontoPago;
    private String Empresa;
    private String FormaPago;    
     
    public Gasto(String Cuenta, String FechaPago, String MontoPago, String Empresa, String FormaPago) {
        this.Cuenta = Cuenta;
        this.FechaPago = FechaPago;
        this.MontoPago = MontoPago;
        this.Empresa = Empresa;
        this.FormaPago = FormaPago;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(String FechaPago) {
        this.FechaPago = FechaPago;
    }

    public String getMontoPago() {
        return MontoPago;
    }

    public void setMontoPago(String MontoPago) {
        this.MontoPago = MontoPago;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }                  
}
