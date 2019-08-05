/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Adrian Stuar
 */
public class Mensualidad {
    private int idMensualidad;
    private int idinscripcion;
    private double valor;
    private String mes;
    private String anio;
    private String fecha;

    public int getIdMensualidad() {
        return idMensualidad;
    }

    public void setIdMensualidad(int idMensualidad) {
        this.idMensualidad = idMensualidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdinscripcion() {
        return idinscripcion;
    }

    public void setIdinscripcion(int idinscripcion) {
        this.idinscripcion = idinscripcion;
    }
    
}
