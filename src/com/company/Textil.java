package com.company;

public class Textil extends Producto {
    private String Composicion;

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

    public String getComposicion() {
        return Composicion;
    }

    public void setComposicion(String composicion) {
        Composicion = composicion;
    }
}
