package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    ArrayList<Alimentacion> listaAlimentacion = new ArrayList<>();
    ArrayList<Electronica> listaElectronica = new ArrayList<>();
    ArrayList<Textil> listaTextil = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void AñadirAlimento(String nombre,Double precio, String caducidad, String codigoBarras){
        Alimentacion alimento = new Alimentacion(nombre, precio, caducidad, codigoBarras);
        listaAlimentacion.add(alimento);
    }

    public void AñadirTextil (String nombre,Double precio, String composicion, String codigoBarras){
        Textil textil = new Textil(nombre, precio, composicion, codigoBarras);
        listaTextil.add(textil);
    }

    public void AñadirElectronica (String nombre,Double precio, int garantia, String codigoBarras){
        Electronica electronica = new Electronica(nombre, precio, garantia, codigoBarras);
        listaElectronica.add(electronica);
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Management {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String actualString = LocalDate.now().format(formatter);
    private LocalDate actual = LocalDate.parse(actualString, formatter);

    ArrayList<Alimentacion> alimentacions = new ArrayList<>();
    ArrayList<Electronica> electronicas = new ArrayList<>();
    ArrayList<Textil> textils = new ArrayList<>();

    ArrayList<Producto> compraFinal = new ArrayList<>();

    void anadirAlimentos (){
        Electronica a = new Electronica("queso");
        a.setPrecio(20);
        a.setCodigoBarras("012");
        Electronica b = new Electronica("queso");
        b.setPrecio(20);
        b.setCodigoBarras("013");
        Electronica c = new Electronica("queso");
        c.setPrecio(20);
        c.setCodigoBarras("012");

        electronicas.add(a);
        electronicas.add(c);
        electronicas.add(b);

    }
    public void calcularPrecioTiquet(){

        for (int i = 0; i < alimentacions.size(); i++) {
            for (int j = 0; j < alimentacions.size(); j++) {
                if (alimentacions.get(i).getCodigoBarras().equals(alimentacions.get(j).getCodigoBarras())
                        && alimentacions.get(i).getPrecio() == alimentacions.get(j).getPrecio()){
                    alimentacions.get(i).setCantidad();
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
            for (int j = 0; j < textils.size(); j++) {
                if (textils.get(i).getCodigoBarras().equals(textils.get(j).getCodigoBarras())
                        && textils.get(i).getPrecio() == textils.get(j).getPrecio()){
                    textils.get(i).setCantidad();
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
            resultado+=(compraFinal.get(i).nombre +"   "+ compraFinal.get(i).codigoBarras+"   "+compraFinal.get(i).cantidad+"   "+compraFinal.get(i).precio*compraFinal.get(i).cantidad+"\n");
        }
        System.out.println(resultado);

    }
}
