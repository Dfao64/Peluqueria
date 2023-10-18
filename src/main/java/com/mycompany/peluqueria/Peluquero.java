package com.mycompany.peluqueria;

public abstract class Peluquero {

    private double resultadoCorteC;
    private double resultadoCorteD;
    private double resultadoTintura;
    private double resultadoPeinado;
    private int numTrabajo1;
    private int numTrabajo2;
    private int numTrabajo3;
    private int numTrabajo4;

    public Peluquero() {
    }

    public Peluquero(double resultadoCorteC, double resultadoCorteD, double resultadoTintura, double resultadoPeinado, int numTrabajo1, int numTrabajo2, int numTrabajo3, int numTrabajo4) {
        this.resultadoCorteC = resultadoCorteC;
        this.resultadoCorteD = resultadoCorteD;
        this.resultadoTintura = resultadoTintura;
        this.resultadoPeinado = resultadoPeinado;
        this.numTrabajo1 = numTrabajo1;
        this.numTrabajo2 = numTrabajo2;
        this.numTrabajo3 = numTrabajo3;
        this.numTrabajo4 = numTrabajo4;
    }

    public void corteCaballero() {
        resultadoCorteC = 8000 + resultadoCorteC;
        numTrabajo1 = numTrabajo1 + 1;
    }

    public void corteDama() {
        resultadoCorteD = 10500 + resultadoCorteD;
        numTrabajo2 = numTrabajo2 + 1;
    }

    public void tintura() {
        resultadoTintura = 40000 + resultadoTintura;
        numTrabajo3 = numTrabajo3 + 1;
    }

    public void peinado() {
        resultadoPeinado = 15000 + resultadoPeinado;
        numTrabajo4 = numTrabajo4 + 1;
    }

    public double getResultadoCorteC() {
        return resultadoCorteC;
    }

    public void setResultadoCorteC(double resultadoCorteC) {
        this.resultadoCorteC = resultadoCorteC;
    }

    public double getResultadoCorteD() {
        return resultadoCorteD;
    }

    public void setResultadoCorteD(double resultadoCorteD) {
        this.resultadoCorteD = resultadoCorteD;
    }

    public double getResultadoTintura() {
        return resultadoTintura;
    }

    public void setResultadoTintura(double resultadoTintura) {
        this.resultadoTintura = resultadoTintura;
    }

    public double getResultadoPeinado() {
        return resultadoPeinado;
    }

    public void setResultadoPeinado(double resultadoPeinado) {
        this.resultadoPeinado = resultadoPeinado;
    }

    public int getNumTrabajo1() {
        return numTrabajo1;
    }

    public void setNumTrabajo1(int numTrabajo1) {
        this.numTrabajo1 = numTrabajo1;
    }

    public int getNumTrabajo2() {
        return numTrabajo2;
    }

    public void setNumTrabajo2(int numTrabajo2) {
        this.numTrabajo2 = numTrabajo2;
    }

    public int getNumTrabajo3() {
        return numTrabajo3;
    }

    public void setNumTrabajo3(int numTrabajo3) {
        this.numTrabajo3 = numTrabajo3;
    }

    public int getNumTrabajo4() {
        return numTrabajo4;
    }

    public void setNumTrabajo4(int numTrabajo4) {
        this.numTrabajo4 = numTrabajo4;
    }

}
