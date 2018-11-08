package com.company;

public class Electronica extends Producto{
    private int garantia;
    Electronica(String nombre){
        this.nombre=nombre;
    }
    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio + precio*(garantia/365)*0.1;
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

    public  int getCantidad(){ return cantidad; }

    public  void setCantidad(int _cantidad ){this.cantidad = _cantidad;  }
}
