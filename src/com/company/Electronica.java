package com.company;

public class Electronica extends Producto{
    private int garantia;

    public Electronica(String nombre,Double precio, int garantia, String codigoBarras) {
        this.nombre = nombre;
        this.garantia = garantia;
        this.precio =  precio + precio* (double)(garantia/365)*0.1;
        this.codigoBarras = codigoBarras;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCodigoBarras(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras(){
        return codigoBarras;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
