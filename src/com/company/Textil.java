package com.company;

public class Textil extends Producto {
    private String Composicion;

    public Textil(String _nombre,Double _precio, String composicion, String _codigoBarras) {
        super.setNombre(_nombre);
        this.Composicion = composicion;
        super.setPrecio(_precio);
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

    public String getComposicion() {
        return Composicion;
    }

    public void setComposicion(String composicion) {
        Composicion = composicion;
    }


}

