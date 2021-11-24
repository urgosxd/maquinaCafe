/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author Marco Antonio
 */
public class DepositoMonedaTipo extends DepositoMoneda {
    private int denominacion;

    public int getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(int denominacion) {
        this.denominacion = denominacion;
    }
    
    public String VerificarMoneda(){
        return "El metodo verificar moneda no ha sido implementado";
    }
    public String DevolverMoneda(){
        return "El metodo devolver moneda no ha sido implementado";
    }       
}