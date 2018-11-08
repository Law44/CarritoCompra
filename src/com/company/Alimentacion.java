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

    public Alimentacion(String nombre,Double precio, String caducidad, String codigoBarras) {
        this.nombre = nombre;
        this.caducidad = LocalDate.parse(caducidad, formatter);
        diferencia = Period.between(this.caducidad, actual);
        int diferenciaDias;
        if (diferencia.getDays() < 0) {
            diferenciaDias = 0;
        }
        else {
            diferenciaDias = diferencia.getDays();
        }
        System.out.println(diferenciaDias);
        this.precio = precio - precio *(double)(1/(diferenciaDias+1)) + (precio * 0.1);
        this.codigoBarras = codigoBarras;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
            this.caducidad = LocalDate.parse(caducidad, formatter);
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

    public  int getCantidad(){ return cantidad; }

    public  void setCantidad(int _cantidad ){this.cantidad = _cantidad ;}
}
