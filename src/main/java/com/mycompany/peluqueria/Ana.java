package com.mycompany.peluqueria;

public class Ana {
    public double resultado;
    public int numTrabajo = 0;
    public void corteCaballero(double opcion){
        resultado = 8000 + resultado;
        numTrabajo = numTrabajo+1;
    }
    public void corteDama(double opcion){
        resultado = 10500 +resultado;
        numTrabajo = numTrabajo+1;
    }
    public void tintura(double opcion){
        resultado = 40000 + resultado;
        numTrabajo = numTrabajo+1;
    }
    public void peinado(double opcion){
        resultado = 15000 +resultado;
        numTrabajo = numTrabajo+1;
    }

}
