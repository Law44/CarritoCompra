package com.company;

public class Electronica extends Producto{
    private int garantia;

    public Electronica(String _nombre,Double _precio, int _garantia, String _codigoBarras) {
        super.setNombre(_nombre);
        this.garantia = _garantia;
        super.setPrecio(  _precio + _precio* (double)(garantia/365)*0.1);
        super.setCodigoBarras( _codigoBarras);
    }


    public double getPrecio(){
        return super.getPrecio();
    }

    public void setPrecio(double _precio){
        super.setPrecio(_precio);
    }

    public void setNombre(String _nombre){
        super.setNombre(_nombre);
    }

    public String getNombre(){
        return super.getNombre();
    }

    public void setCodigoBarras(String _codigoBarras){
        super.setCodigoBarras( _codigoBarras);
    }

    public String getCodigoBarras(){
        return super.getCodigoBarras();
    }

    public  int getCantidad(){ return super.getCantidad(); }

    public  void setCantidad(int _cantidad ){super.setCantidad( _cantidad) ;}
}
