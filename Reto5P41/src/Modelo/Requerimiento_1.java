/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author eescobarm
 */
public class Requerimiento_1 {
    private int numLideres;
    private String ciudadResidencia;  
    
    public Requerimiento_1(){

    }

    public Requerimiento_1(int numLideres, String ciudadResidencia) {
        this.numLideres = numLideres;
        this.ciudadResidencia = ciudadResidencia;
    }

    public int getNumLideres() {
        return numLideres;
    }

    public void setNumLideres(int numLideres) {
        this.numLideres = numLideres;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }
}
