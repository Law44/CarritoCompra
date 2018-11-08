package com.company;

public class Menu {
    Management management = new Management();


    int menuGeneral(){
        management.anadirAlimentos();
        int op;
        op=Widget.menuNumero("Que deseas hacer?, Introducir producto, Pasar por caja, Mostrar carro de la compra, Salir");

        switch (op){
            case 1:
                /*Entrar al menu de introducir producto*/
                int op2;
                do {
                   op2 = menuProducto();
                }while (op2!=4);
                break;
            case 2:
                management.calcularPrecioTiquet();

                break;
            case 3:
                /*Mostrar el carro*/
                break;
            case 4:
                /* Despedidad */
                break;
            case -1:
                Widget.errorNum();
                break;
            default:
                Widget.errorMenu();
        }
        return op;
    }
    int menuProducto(){
        int op;
        op=Widget.menuNumero("Que tipo de prodcuto?, Alimentación, Téxtil, Electrónica, Salir");

        switch (op){
            case 1:

                /*Alimentación*/
                break;
            case 2:
                /*Téxtil*/
                break;
            case 3:
                /*Electrónica*/
                break;
            case 4:
                /* Despedidad */
                break;
            default:
                Widget.errorMenu();
        }
        return op;
    }
}
