package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Management {

    ArrayList<Alimentacion> alimentacions = new ArrayList<>();
    ArrayList<Electronica> electronicas = new ArrayList<>();
    ArrayList<Textil> textils = new ArrayList<>();

    ArrayList<Producto> compraFinal = new ArrayList<>();


    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String actualString = LocalDate.now().format(formatter);
    private LocalDate actual = LocalDate.parse(actualString, formatter);

    public void AñadirAlimento(String nombre,Double precio, String caducidad, String codigoBarras){
        Alimentacion alimento = new Alimentacion(nombre, precio, caducidad, codigoBarras);
        alimentacions.add(alimento);
    }

    public void AñadirTextil (String nombre,Double precio, String composicion, String codigoBarras){
        Textil textil = new Textil(nombre, precio, composicion, codigoBarras);
        textils.add(textil);
    }

    public void AñadirElectronica (String nombre,Double precio, int garantia, String codigoBarras) {
        Electronica electronica = new Electronica(nombre, precio, garantia, codigoBarras);
        electronicas.add(electronica);
    }






    public void calcularPrecioTiquet(){

        for (int i = 0; i < alimentacions.size(); i++) {
            for (int j = i+1; j < alimentacions.size(); j++) {
                if (alimentacions.get(i).getCodigoBarras().equals(alimentacions.get(j).getCodigoBarras())
                        && alimentacions.get(i).getPrecio() == alimentacions.get(j).getPrecio()){
                    alimentacions.get(i).setCantidad(alimentacions.get(i).getCantidad()+1);
                    alimentacions.remove(j);
                }
            }
        }



        for (int i = 0; i < electronicas.size(); i++) {
            for (int j = i+1; j < electronicas.size(); j++) {
                if (electronicas.get(i).getCodigoBarras().equals(electronicas.get(j).getCodigoBarras())
                        && electronicas.get(i).getPrecio() == electronicas.get(j).getPrecio()){
                    electronicas.get(i).setCantidad(electronicas.get(i).getCantidad()+1);
                    electronicas.remove(j);
                }
            }
        }

        for (int i = 0; i < textils.size(); i++) {
            for (int j = i+1; j < textils.size(); j++) {
                if (textils.get(i).getCodigoBarras().equals(textils.get(j).getCodigoBarras())
                        && textils.get(i).getPrecio() == textils.get(j).getPrecio()){
                    textils.get(i).setCantidad(textils.get(i).getCantidad()+1);
                    textils.remove(j);
                }
            }
        }

        compraFinal.addAll(electronicas);
        compraFinal.addAll(alimentacions);
        compraFinal.addAll(textils);

        String resultado = actualString+"  |  MEGAMERCADOHOME\n" +
                "----------------------------------------------------\n";
        for (int i = 0; i < compraFinal.size(); i++) {
            resultado+=(compraFinal.get(i).getNombre() +"   "+ compraFinal.get(i).getCodigoBarras()+"   "+compraFinal.get(i).getCantidad()+"   "+compraFinal.get(i).getPrecio()*compraFinal.get(i).getCantidad()+"\n");
        }
        System.out.println(resultado);

    }
}
