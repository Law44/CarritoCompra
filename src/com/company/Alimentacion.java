package com.company;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Alimentacion extends Producto{
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate caducidad;
    private String actualString = LocalDate.now().format(formatter);
    private LocalDate actual = LocalDate.parse(actualString, formatter);
    private Period diferencia;

    public Alimentacion(String _nombre,double _precio, String caducidad, String _codigoBarras) {
        setNombre(_nombre);
        this.caducidad = LocalDate.parse(caducidad, formatter);
        diferencia = Period.between(this.caducidad, actual);

        int diferenciaDias  = diferencia.getDays();
        System.out.println(diferenciaDias);

        System.out.println(diferenciaDias);
        setPrecio(_precio - ((_precio * (double)(1/(diferenciaDias+1)) + (_precio * 0.1))));
        setCodigoBarras(_codigoBarras);

    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
            this.caducidad = LocalDate.parse(caducidad, formatter);
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
