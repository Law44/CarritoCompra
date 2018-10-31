package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Managment {
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
    }
}
