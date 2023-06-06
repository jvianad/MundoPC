package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Raton ratonHGXTREME = new Raton("USB","HGx");
        Teclado tecladoHGXTREME = new Teclado("USB","HGx");
        Monitor monitorHGXTREME = new Monitor("HGx",50);
        Computadora computadorHG = new Computadora("PC HGx",monitorHGXTREME,tecladoHGXTREME,ratonHGXTREME);


        Raton ratonGAMER = new Raton("USB","GAMER");
        Teclado tecladoGAMER = new Teclado("USB","GAMER");
        Monitor monitorGAMER = new Monitor("GAMER",30);
        Computadora computadorGAMER = new Computadora("PC GAMER",monitorGAMER,tecladoGAMER,ratonGAMER);


        Raton ratonHP = new Raton("USB","HP");
        Teclado tecladoHP = new Teclado("USB","HP");
        Monitor monitorHP = new Monitor("HP",20);
        Computadora computadorHP = new Computadora("PC HP",monitorHP,tecladoHP,ratonHP);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadorHG);
        orden1.agregarComputadora(computadorGAMER);
        orden1.agregarComputadora(computadorHP);

        orden1.mostrarOrden();

    }
}
