package com.company;

import java.util.ArrayList;
import java.util.List;
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


    public String calcularPrecioTiquet(){

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
                        && (textils.get(i).getPrecio() == textils.get(j).getPrecio())){
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
            resultado+=(compraFinal.get(i).getNombre() +"   "+"   "+compraFinal.get(i).getCantidad()+"   "+compraFinal.get(i).getPrecio()+"   " + compraFinal.get(i).getPrecio()*compraFinal.get(i).getCantidad()+"\n");
        }


        compraFinal.clear();
        electronicas.clear();
        alimentacions.clear();
        textils.clear();
        return resultado;

    }
    public String mostrarCarroCompra(){
        List<Alimentacion> alimentacionsCopia = new ArrayList<>();
        alimentacionsCopia.addAll(alimentacions);

        List<Electronica> electronicasCopia = new ArrayList<>();
        electronicasCopia.addAll(electronicas);

        List<Textil> textilsCopia = new ArrayList<>();
        textilsCopia.addAll(textils);

        for (int i = 0; i < alimentacionsCopia.size(); i++) {
            for (int j = i+1; j < alimentacionsCopia.size(); j++) {
                if (alimentacionsCopia.get(i).getCodigoBarras().equals(alimentacionsCopia.get(j).getCodigoBarras())){
                    alimentacionsCopia.get(i).setCantidad(alimentacionsCopia.get(i).getCantidad()+1);
                    alimentacionsCopia.remove(j);
                }
            }
        }



        for (int i = 0; i < electronicasCopia.size(); i++) {
            for (int j = i+1; j < electronicasCopia.size(); j++) {
                if (electronicasCopia.get(i).getCodigoBarras().equals(electronicasCopia.get(j).getCodigoBarras())){
                    electronicasCopia.get(i).setCantidad(electronicasCopia.get(i).getCantidad()+1);
                    electronicasCopia.remove(j);
                }
            }
        }

        for (int i = 0; i < textilsCopia.size(); i++) {
            for (int j = i+1; j < textilsCopia.size(); j++) {
                if (textilsCopia.get(i).getCodigoBarras().equals(textilsCopia.get(j).getCodigoBarras())){
                    textilsCopia.get(i).setCantidad(textilsCopia.get(i).getCantidad()+1);
                    textilsCopia.remove(j);
                }
            }
        }

        compraFinal.addAll(electronicasCopia);
        compraFinal.addAll(alimentacionsCopia);
        compraFinal.addAll(textilsCopia);

        String resultado = actualString+"  |  MEGAMERCADOHOME\n" +
                "----------------------------------------------------\n";
        for (int i = 0; i < compraFinal.size(); i++) {
            resultado+=(compraFinal.get(i).getNombre() +"   "+"   "+compraFinal.get(i).getCantidad());
        }
        resetearCantidad(compraFinal);
        compraFinal.clear();



        return resultado;


    }

    public void resetearCantidad(List<Producto> list){

        for (int i = 0; i < list.size(); i++) {

            list.get(i).setCantidad(1);

        }
    }
}
