package com.gm.mundopc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada,String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public void setTipoEntrada(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getTipoEntrada(){
        return tipoEntrada;
    }

    public String getMarca(){
        return marca;
    }

    @Override
    public String toString(){
        return "Tipo de entrada: "+this.tipoEntrada+
                "Marca: "+this.marca;
    }
}
