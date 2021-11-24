/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author Core i3
 */
public class Cafe extends Ingrediente{
    private String tipo;
    private int cantidad = 0;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public String metodo1(){
        return "Metodo uno de cafe";
    }
}
