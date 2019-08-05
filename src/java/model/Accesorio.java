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
public class Accesorio {
   private int idaccesorio;
   private int idtipoaccesorio;
   private String nombre;
   private int cantidad;
   private String talla;
   private double valor;
   private String color;

    public int getIdaccesorio() {
        return idaccesorio;
    }

    public void setIdaccesorio(int idaccesorio) {
        this.idaccesorio = idaccesorio;
    }

    public int getIdtipoaccesorio() {
        return idtipoaccesorio;
    }

    public void setIdtipoaccesorio(int idtipoaccesorio) {
        this.idtipoaccesorio = idtipoaccesorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
   
}
