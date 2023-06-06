package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private static int contadorOrdenes;
    private Computadora[] computadoras;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if (contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Array lleno de computadoras");
        }
    }

    public void mostrarOrden(){
        System.out.println("ID Orden: "+this.idOrden);
        System.out.println("Computadoras: ");
        for (int i = 0; i < contadorComputadoras; i++){
            System.out.println(this.computadoras[i]);
        }
    }

}
