package CapaNegocio;


public class Maquina {
    private String durabilidad;
    private String garantia;
    private String ahorro;
    private String eficiencia;

    //Set y Get de  durabilidad 
    public String getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(String durabilidad) {
        this.durabilidad = durabilidad;
    }

    
    //Set y Get de garantia
    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    
    //Set y Get de ahorro
    public String getAhorro() {
        return ahorro;
    }

    public void setAhorro(String ahorro) {
        this.ahorro = ahorro;
    }

    
    //Set y Get de eficiencia
    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }
 
    
    
    //Metodos de la clase maquina
    
    public String producir()
    {
        return "El producir no se ha implentado";
    }
    
    public String funcionar()
    {
        return "El funcionar  no se ha implementado";
    }
   
}
