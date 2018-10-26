package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Alimentacion extends Producto{
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private LocalDate caducidad;
    private LocalDate actual = LocalDate.now();
    private Period diferencia = Period.between(caducidad, actual);

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio - precio*(1/(diferencia.getDays())) + (precio * 0.1);
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
}
