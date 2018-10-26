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
}
