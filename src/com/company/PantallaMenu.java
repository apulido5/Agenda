package com.company;

public class PantallaMenu {
    boolean mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("AGENDA");    // // titulo = "BLOC DE NOTAS"

        MenuAgenda menuAgenda = new MenuAgenda();
        String[] opciones = {"Crear contacto", "Buscar contacto", "salir"};//jjgfk
        String opcion = menuAgenda.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            CrearContacto crearContacto = new CrearContacto();
            crearContacto.mostrar();
        } else if("2".equals(opcion)){
            ListarContacto listarContacto = new ListarContacto();
            listarContacto.mostrar();
        } else if("3".equals(opcion)){
            return false;
        }
        return true;
    }
}

