package com.company;

public class Menu {
    Managment managment = new Managment();

    int menuGeneral(){
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
                /*Pasar por caja*/
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
                managment.AñadirAlimento(Widget.introString("Introduce el nombre del alimento"),
                        Widget.introDouble("Introduce el precio del alimento (Formato 00.00)"),
                        Widget.introString("Introduce la fecha de caducidad del alimento (Formato: dd/mm/yyyy)"),
                        Widget.introString("Introduce el codigo de barras del alimento")
                        );
                break;
            case 2:
                managment.AñadirTextil(Widget.introString("Introduce el nombre del producto textil"),
                        Widget.introDouble("Introduce el precio del producto textil (Formato 00.00)"),
                        Widget.introString("Introduce la composicion del producto textil"),
                        Widget.introString("Introduce el codigo de barras del producto textil")
                );
                break;
            case 3:
                managment.AñadirElectronica(Widget.introString("Introduce el nombre del producto electronico"),
                        Widget.introDouble("Introduce el precio del producto electronico (Formato 00.00)"),
                        Widget.introNumero("Introduce la garantia del producto electronico"),
                        Widget.introString("Introduce el codigo de barras del producto electronico")
                );
                break;
            case 4:
                break;
            default:
                Widget.errorMenu();
        }
        return op;
    }
}
