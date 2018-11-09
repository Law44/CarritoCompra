package com.company;

import java.util.Scanner;

public  class Widget {
    static Scanner sc = new Scanner(System.in);
    static String[] linea;
    static int menuNumero(String text){
        int resultado;

        linea=text.split(",");

        for (int i = 1; i < linea.length; i++) {
            System.out.println(i+"-"+linea[i]);
        }
        String resultadoSt= sc.nextLine();
        try {
            resultado = Integer.parseInt(resultadoSt);
        }catch (Exception IO){
            resultado=-1;
        }

        return resultado;
    }


    public static void errorMenu() {
        System.out.println("\033[31mERROR, La opción introducida no es válida\033[0m");
    }
    public static void errorNum(){
        System.out.println("\033[31mERROR, introduzca un numero \033[0m");
    }

    public static String introString(String text) {
        System.out.println(text);
        return sc.nextLine();
    }

    static double introDouble(String text){
        double resultado = 0;
        System.out.println(text);
        String resultadoSt= sc.nextLine();
        try {
            resultado = Double.parseDouble(resultadoSt);
        }catch (Exception IO){
            errorNum();
            introDouble(text);
        }

        return resultado;
    }

    static int introNumero(String text){
        System.out.println(text);
        int resultado;

        linea=text.split(",");

        for (int i = 1; i < linea.length; i++) {
            System.out.println(i+"-"+linea[i]);
        }
        String resultadoSt= sc.nextLine();
        try {
            resultado = Integer.parseInt(resultadoSt);
        }catch (Exception IO){
            resultado=-1;
        }

        return resultado;
    }
}
