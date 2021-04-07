package com.company;

public class PantallaListar {
    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("Contactos");

        for(Contacto contacto: Main.agenda.contactos){
            if (contacto.nombre == null){
            } else {
                System.out.print(contacto.nombre + " ");
            }
            if (contacto.nombre == null){
            } else {
                System.out.println(contacto.apellidos);
            }        }

        System.out.println();

        MenuAgenda menuAgenda = new MenuAgenda();
        String[] opciones = {"Volver al menu principal"};
        String opcion = menuAgenda.elegirOpcion(opciones);


        if("1".equals(opcion)){
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }
    }
}