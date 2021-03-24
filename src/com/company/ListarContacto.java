package com.company;

public class ListarContacto {
    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("Contactos guardados");

        for(Contacto contacto: Main.agenda.contactos){
            System.out.println(contacto.titulo);
        }

    }
}
