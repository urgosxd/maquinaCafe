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
public class Ingrediente extends Maquina{
    
     private String nombre;
    private float cantidad = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
   
    
    public String ElegirIngrediente(){
        return " El ingrediente elejido es "+this.nombre;
    }
}